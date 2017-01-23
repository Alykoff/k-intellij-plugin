package com.appian.intellij.k;

import static com.appian.intellij.k.psi.KTypes.*;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

%%

%class KLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{ return NEWLINE;
%eof}

//EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE={LINE_WS}+
NEWLINE=\r|\n|\r\n

ANY=({NEWLINE}|.)*

COMMENT1="/" [^\r\n]* {NEWLINE}?
COMMENT2={WHITE_SPACE}+ "/" [^\r\n]* {NEWLINE}?
MULTY_COMMENT=\/ {WHITE_SPACE}* {NEWLINE} (([^\r\n\\][^\r\n]* {NEWLINE})|{NEWLINE})* \\


COMMAND_NAME={WHITE_SPACE}*"\\"[dl]
USER_IDENTIFIER=[.a-zA-Z][._a-zA-Z0-9]*
SYSTEM_IDENTIFIER="_" [._a-zA-Z0-9]*
N_COLON=[0-6] ":"
ID={USER_IDENTIFIER}|{SYSTEM_IDENTIFIER}
ID_START=[_.][a-zA-Z]

DAYS=0[1-9]|[1-2][0-9]|3[0-1]
MONTH=0[1-9]|1[0-2]
YEAR=[2-9][0-9]{3}
DATE={YEAR}\.{MONTH}\.{DAYS}[dpnzm]?
TIME=([012]\d\:[0-5]\d(\:[0-5]\d(\.\d+)?)?)[uvtpn]?
//FLOATS=(?:(?:\\d+(?:\\.\\d*)?|\\.\\d+)[eE][+-]?\\d+|\\d+\\.\\d*|\\.\\d+)[efpntm]?
STAMP=((\d+D|\d\d\d\d\.[01]\d\.[0123]\d[DT])([012]\d\:[0-5]\d(\:[0-5]\d(\.\d+)?)?|([012]\d)?))[zpn]?

FUNC=(first|enlist|value|type|get|set|count|string|key|max|min|sum|prd|last|flip|distinct|raze|neg|
           til|upper|lower|abs|acos|aj|aj0|not|null|any|asc|asin|attr|avg|avgs|ceiling|cols|cos|csv|all|atan|deltas|
           desc|differ|dsave|dev|eval|exit|exp|fills|fkeys|floor|getenv|group|gtime|hclose|hcount|hdel|hopen|hsym|
           iasc|idesc|inv|keys|load|log|lsq|ltime|ltrim|maxs|md5|meta|mins|next|parse|plist|prds|prev|rand|rank|ratios|
           read0|read1|reciprocal|reverse|rload|rotate|rsave|rtrim|save|sdev|show|signum|sin|sqrt|ssr|sums|svar|system|
           tables|tan|trim|txf|ungroup|var|view|views|wj|wj1|ww)

NIL=0[nNwW][hijefcpmdznuvt]
KEYWORD=(and|or|except|inter|like|each|cross|vs|sv|within|where|in|asof|bin|binr|cor|cov|cut|ej|fby|
              div|ij|insert|lj|ljf|mavg|mcount|mdev|med|mmax|mmin|mmu|mod|msum|over|prior|peach|pj|scan|scov|setenv|ss|
              sublist|uj|union|upsert|wavg|wsum|xasc|xbar|xcol|xcols|xdesc|xexp|xgroup|xkey|xlog|xprev|xrank)


NUMBER=-?((0|[1-9][0-9]*)(\.[0-9]+)?([eE][+-]?[0-9]*)?|0[iInN])
NUMBER_VECTOR={NUMBER}({WHITE_SPACE}{NUMBER})+
C=([^\\\"]|\\[^\ \t])
CHAR=\"{C}\"
CHAR_VECTOR=\"{C}*\"
SYMBOL="`"([._a-zA-Z0-9]+|{CHAR_VECTOR}|({NEWLINE}|{WHITE_SPACE}*)+)
SYMBOL_VECTOR={SYMBOL} ({WHITE_SPACE}*{SYMBOL})+
VERB=[!#$%&*+,-.<=>?@\^_|~]
ADVERB="/" | "/": | \\ | \\: | ' | ':

// function composition
COMPOSED_MONAD=(({VERB}|{N_COLON}){WHITE_SPACE}*) ":"

// higher-order functions
DERIVED_VERB=({ID}|(({VERB}|{N_COLON})":"?)){ADVERB}+

%state MINUS
%state DERIVED_LAMBDA
%state ESCAPE
%state COMMAND

%%

<MINUS> {
  "-"/":["                     { yybegin(YYINITIAL); return VERB;}
  "-:"                         { yybegin(YYINITIAL); return COMPOSED_MONAD;}
  "-" (":"?) {ADVERB}+         { yybegin(YYINITIAL); return DERIVED_VERB;}
  "-"                          { yybegin(YYINITIAL); return VERB;}
}

<DERIVED_LAMBDA> {
  {ADVERB}                     { yybegin(YYINITIAL); return ADVERB;}
}

<ESCAPE> {
  {ANY}                        { yybegin(YYINITIAL); return COMMENT; }
}

<COMMAND> {
  "^"                          { yybegin(YYINITIAL); return CARET; }
  {USER_IDENTIFIER}            { yybegin(YYINITIAL); return USER_IDENTIFIER; }
  {WHITE_SPACE}                { return com.intellij.psi.TokenType.WHITE_SPACE; }
  {NEWLINE}                    { yybegin(YYINITIAL); return NEWLINE; }
}

<YYINITIAL> {

  {NEWLINE}+                   { return NEWLINE; }
  ^{COMMAND_NAME}              { yybegin(COMMAND); return COMMAND_NAME; }
  {NUMBER_VECTOR}              { return NUMBER_VECTOR; }
  {N_COLON}/[^\[]              { return N_COLON; }
  ":"/"["                      { return COLON; }
  "if"/"["                     { return IF; }
  "do"/"["                     { return DO; }
  "while"/"["                  { return WHILE; }
  {ADVERB}+/"["                { return ADVERB; }
  {DERIVED_VERB}               { return DERIVED_VERB; }
  {COMPOSED_MONAD}/[^\[]       { return COMPOSED_MONAD; }
  {SYMBOL_VECTOR}/{LINE_WS}"/" { return SYMBOL_VECTOR; }
  {SYMBOL_VECTOR}              { return SYMBOL_VECTOR; }
  {SYMBOL}/{LINE_WS}"/"        { return SYMBOL; }
  {SYMBOL}                     { return SYMBOL; }
  {WHITE_SPACE}                { return com.intellij.psi.TokenType.WHITE_SPACE; }
  ^{MULTY_COMMENT}             { return COMMENT; }
  ^{COMMENT1}                  { return COMMENT; }
  {COMMENT2}/{NEWLINE}         { return COMMENT; }
  {COMMENT2}                   { return COMMENT; }

  {VERB}/{ID_START}            { return VERB;}
  {VERB}/-[0-9]                { return VERB;}
  {VERB}                       { return VERB;}
  {DATE}                       { return NUMBER; }
  {TIME}                       { return NUMBER; }
  {STAMP}                      { return NUMBER; }

  "("                          { return OPEN_PAREN; }
  ")"/{ADVERB}                 { yybegin(DERIVED_LAMBDA); return CLOSE_PAREN; }
  ")"/-                        { yybegin(MINUS); return CLOSE_PAREN; }
  ")"                          { return CLOSE_PAREN; }
  ";"                          { return SEMICOLON; }
  "["                          { return OPEN_BRACKET; }
  "]"/{ADVERB}                 { yybegin(DERIVED_LAMBDA); return CLOSE_BRACKET; }
  "]"/-                        { yybegin(MINUS); return CLOSE_BRACKET; }
  "]"                          { return CLOSE_BRACKET; }
  "{"                          { return OPEN_BRACE; }
  "}"/{ADVERB}                 { yybegin(DERIVED_LAMBDA); return CLOSE_BRACE; }
  "}"                          { return CLOSE_BRACE; }

  {SYSTEM_IDENTIFIER}/-        { yybegin(MINUS); return SYSTEM_IDENTIFIER; }
  {SYSTEM_IDENTIFIER}          { return SYSTEM_IDENTIFIER; }
  {USER_IDENTIFIER}/-          { yybegin(MINUS); return USER_IDENTIFIER; }
  {USER_IDENTIFIER}            { return USER_IDENTIFIER; }
  {NUMBER}/-                   { yybegin(MINUS); return NUMBER; }
  {NUMBER}                     { return NUMBER; }
  {CHAR}                       { return CHAR; }
  {CHAR_VECTOR}                { return STRING; }

  ":"                          { return COLON; }
  "'"                          { return TICK; }
  "\\"/{NEWLINE}               { yybegin(ESCAPE); return COMMENT; }
  "\\"                         { return BACK_SLASH; }
  "`"                          { return SYMBOL; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
