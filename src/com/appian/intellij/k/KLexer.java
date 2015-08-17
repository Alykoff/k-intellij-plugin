/* The following code was generated by JFlex 1.4.3 on 8/16/15 10:01 PM */

package com.appian.intellij.k;

import static com.appian.intellij.k.psi.KTypes.*;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 8/16/15 10:01 PM from the specification file
 * <tt>/Users/antonio.andrade/ae/k-intellij-plugin/src/com/appian/intellij/k/k.flex</tt>
 */
class KLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\22\1\20"+
    "\4\22\1\24\1\25\1\26\1\22\1\16\1\22\1\16\1\14\1\4"+
    "\1\13\1\34\1\35\1\36\1\37\1\40\1\41\3\7\1\23\1\27"+
    "\5\22\4\10\1\15\3\10\1\17\4\10\1\17\14\10\1\30\1\5"+
    "\1\12\1\22\1\11\1\21\3\10\1\6\1\50\1\43\1\10\1\46"+
    "\1\42\2\10\1\47\1\10\1\33\1\44\7\10\1\45\3\10\1\31"+
    "\1\22\1\32\1\22\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\4\1\6"+
    "\1\7\1\5\2\6\1\10\1\1\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\6\5\2\4\1\3\1\20"+
    "\1\1\1\21\1\0\1\22\2\0\1\5\1\23\2\24"+
    "\1\25\1\26\1\5\1\27\1\24\1\0\1\24\2\0"+
    "\1\30\2\31\1\0\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\4\1\0\2\20\1\0\1\21\2\41"+
    "\2\5\2\0\2\42\2\0\1\31\1\4\2\0\2\41"+
    "\1\30\2\43\1\0\1\31\1\4\1\0\2\41\1\0"+
    "\1\43\1\0\1\44\1\45\3\43\1\31\1\0\2\43";

  private static int [] zzUnpackAction() {
    int [] result = new int[105];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\366\0\u011f"+
    "\0\u0148\0\122\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215\0\122"+
    "\0\122\0\122\0\122\0\122\0\122\0\122\0\u023e\0\u0267"+
    "\0\u0290\0\u02b9\0\u02e2\0\u030b\0\u0334\0\u035d\0\u0386\0\u03af"+
    "\0\u03d8\0\u0401\0\u042a\0\u011f\0\u0453\0\u047c\0\u04a5\0\u04ce"+
    "\0\u04f7\0\u01c3\0\122\0\u04ce\0\u0520\0\122\0\u019a\0\u0549"+
    "\0\u0572\0\u059b\0\u05c4\0\122\0\u05ed\0\u0616\0\u063f\0\122"+
    "\0\122\0\122\0\122\0\122\0\122\0\u011f\0\u0668\0\u03d8"+
    "\0\u0691\0\122\0\u06ba\0\u06e3\0\u070c\0\u0735\0\u075e\0\u0787"+
    "\0\u07b0\0\u07d9\0\122\0\u059b\0\u0802\0\u082b\0\u0854\0\u087d"+
    "\0\u08a6\0\u08cf\0\u08f8\0\u0520\0\u07b0\0\u0921\0\u094a\0\u0973"+
    "\0\u099c\0\u09c5\0\u09ee\0\u0a17\0\u0a40\0\u0a69\0\u0854\0\u0a92"+
    "\0\u011f\0\u0abb\0\u0ae4\0\u0b0d\0\u0b36\0\u0ae4\0\u0b5f\0\u0b88"+
    "\0\u0bb1";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[105];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\5\2\3\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\10\1\15\1\10\1\16\1\17"+
    "\1\15\1\20\1\3\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\10\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\2\10\1\36\3\10\1\3\2\4\1\37\1\40"+
    "\1\41\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\10\1\15\1\10\1\16\1\17\1\15\1\20\1\3"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\10\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\2\10\1\36"+
    "\3\10\52\0\2\4\51\0\1\5\1\40\50\0\2\42"+
    "\4\10\1\0\3\10\1\43\1\10\2\0\1\43\1\0"+
    "\1\42\6\0\11\10\1\44\4\10\3\0\1\45\3\0"+
    "\1\7\3\0\1\7\1\46\1\47\16\0\6\7\6\0"+
    "\1\47\4\0\2\42\4\10\1\0\3\10\1\43\1\10"+
    "\2\0\1\43\1\0\1\42\6\0\16\10\4\0\2\42"+
    "\3\50\1\51\1\0\1\50\1\51\1\50\1\52\1\50"+
    "\2\0\1\52\1\53\1\42\6\0\1\54\15\50\3\0"+
    "\1\45\10\0\1\46\1\47\1\0\1\55\3\0\1\56"+
    "\7\0\1\55\6\0\1\55\5\0\1\47\4\0\2\42"+
    "\3\10\1\57\1\0\1\10\1\57\1\10\1\52\1\10"+
    "\2\0\1\52\1\53\1\42\6\0\16\10\4\0\2\42"+
    "\1\60\1\0\1\60\1\61\2\0\1\61\1\60\1\52"+
    "\1\60\2\0\1\52\1\53\1\42\6\0\1\60\6\0"+
    "\7\60\5\62\1\63\12\62\1\64\30\62\1\0\3\65"+
    "\2\0\4\66\1\0\3\66\1\0\1\66\1\67\12\0"+
    "\16\66\3\0\1\45\3\0\1\7\3\0\1\7\1\46"+
    "\1\47\5\0\1\70\10\0\6\7\6\0\1\47\3\0"+
    "\1\45\3\0\1\7\3\0\1\7\1\46\1\47\5\0"+
    "\1\71\10\0\6\7\6\0\1\47\3\0\1\45\3\0"+
    "\1\7\3\0\1\7\1\46\1\47\5\0\1\72\10\0"+
    "\6\7\6\0\1\47\3\0\1\45\3\0\1\7\3\0"+
    "\1\7\1\46\1\47\5\0\1\73\10\0\6\7\6\0"+
    "\1\47\3\0\1\45\3\0\1\7\3\0\1\7\1\46"+
    "\1\47\5\0\1\74\10\0\6\7\6\0\1\47\3\0"+
    "\1\45\3\0\1\7\3\0\1\7\1\46\1\47\5\0"+
    "\1\75\10\0\6\7\6\0\1\47\4\0\2\42\4\10"+
    "\1\0\3\10\1\43\1\10\2\0\1\43\1\0\1\42"+
    "\6\0\10\10\1\76\5\10\4\0\2\42\4\10\1\0"+
    "\3\10\1\43\1\10\2\0\1\43\1\0\1\42\6\0"+
    "\13\10\1\77\2\10\3\0\1\37\1\40\1\100\43\0"+
    "\1\40\1\101\1\102\46\40\6\0\1\103\46\0\2\42"+
    "\15\0\1\104\1\42\30\0\2\42\1\60\1\0\2\60"+
    "\2\0\2\60\1\43\1\60\2\0\1\43\1\0\1\42"+
    "\6\0\1\60\6\0\7\60\3\0\1\45\3\0\1\105"+
    "\3\0\1\106\20\0\6\105\16\0\1\107\3\0\1\107"+
    "\20\0\6\107\12\0\1\45\3\0\1\110\3\0\1\110"+
    "\2\0\1\110\15\0\6\110\13\0\2\42\4\50\1\0"+
    "\3\50\1\43\1\50\2\0\1\43\1\0\1\42\6\0"+
    "\16\50\4\0\2\42\3\50\1\51\1\0\1\50\1\51"+
    "\1\50\1\52\1\50\2\0\1\52\1\53\1\42\6\0"+
    "\16\50\3\0\1\45\51\0\2\42\4\60\1\0\3\60"+
    "\1\43\1\60\2\0\1\43\1\0\1\42\6\0\16\60"+
    "\4\0\2\42\3\60\1\61\1\0\1\60\1\61\1\60"+
    "\1\52\1\60\2\0\1\52\1\53\1\42\6\0\16\60"+
    "\5\111\1\112\12\111\1\113\35\111\1\112\12\111\1\114"+
    "\30\111\1\0\3\65\15\0\1\115\35\0\4\66\1\0"+
    "\3\66\1\0\1\66\1\0\1\115\11\0\16\66\5\67"+
    "\1\116\12\67\1\117\30\67\4\0\2\42\4\10\1\0"+
    "\3\10\1\43\1\10\2\0\1\43\1\0\1\42\6\0"+
    "\7\10\1\120\6\10\2\0\1\102\51\0\1\121\51\0"+
    "\2\42\16\0\1\42\27\0\1\45\3\0\1\105\3\0"+
    "\1\105\1\122\1\123\16\0\6\105\6\0\1\123\3\0"+
    "\1\45\10\0\1\122\1\123\1\0\1\124\13\0\1\124"+
    "\6\0\1\124\5\0\1\123\3\0\1\45\3\0\1\107"+
    "\3\0\1\107\1\0\1\47\16\0\6\107\6\0\1\47"+
    "\3\0\1\45\3\0\1\110\3\0\1\110\20\0\6\110"+
    "\7\0\5\111\1\112\12\111\1\64\35\111\1\112\12\111"+
    "\1\125\30\111\1\0\3\126\2\0\4\127\1\0\3\127"+
    "\1\0\1\127\1\130\12\0\16\127\5\67\1\116\12\67"+
    "\1\131\30\67\21\0\1\115\33\0\2\42\4\10\1\0"+
    "\3\10\1\43\1\10\2\0\1\43\1\0\1\42\6\0"+
    "\14\10\1\132\1\10\3\0\1\121\2\0\4\133\1\0"+
    "\3\133\1\0\1\133\13\0\16\133\7\0\1\134\3\0"+
    "\1\134\20\0\6\134\12\0\1\45\3\0\1\135\3\0"+
    "\1\135\2\0\1\135\15\0\6\135\10\0\3\126\15\0"+
    "\1\115\35\0\4\127\1\0\3\127\1\0\1\127\1\0"+
    "\1\115\11\0\16\127\5\130\1\136\12\130\1\137\30\130"+
    "\5\67\1\116\12\67\1\117\1\140\27\67\4\0\2\42"+
    "\4\10\1\0\3\10\1\43\1\10\2\0\1\43\1\0"+
    "\1\42\6\0\15\10\1\141\1\0\3\142\2\0\4\133"+
    "\1\0\3\133\1\0\1\133\13\0\16\133\3\0\1\45"+
    "\3\0\1\134\3\0\1\134\1\0\1\123\16\0\6\134"+
    "\6\0\1\123\3\0\1\45\3\0\1\135\3\0\1\135"+
    "\20\0\6\135\7\0\5\130\1\136\12\130\1\143\30\130"+
    "\1\67\3\144\1\67\1\116\4\145\1\67\3\145\1\67"+
    "\1\145\1\146\12\67\16\145\1\0\3\142\45\0\5\130"+
    "\1\136\12\130\1\137\1\147\27\130\1\67\3\144\1\67"+
    "\1\116\12\67\1\117\1\140\34\67\1\116\4\145\1\67"+
    "\3\145\1\67\1\145\1\117\1\140\11\67\16\145\1\130"+
    "\3\150\1\130\1\136\4\151\1\130\3\151\1\130\1\151"+
    "\1\143\12\130\16\151\1\130\3\150\1\130\1\136\12\130"+
    "\1\137\1\147\34\130\1\136\4\151\1\130\3\151\1\130"+
    "\1\151\1\137\1\147\11\130\16\151";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3034];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\6\1\1\11\5\1\7\11\14\1\1\0"+
    "\1\1\2\0\4\1\1\11\2\1\1\11\1\1\1\0"+
    "\1\1\2\0\1\11\2\1\1\0\6\11\2\1\1\0"+
    "\1\1\1\11\1\0\5\1\2\0\1\11\1\1\2\0"+
    "\2\1\2\0\5\1\1\0\2\1\1\0\2\1\1\0"+
    "\1\1\1\0\6\1\1\0\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[105];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  KLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 128) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      if (zzMarkedPosL > zzStartRead) {
        switch ((zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL-1] : zzBufferL.charAt(zzMarkedPosL-1))) {
        case '\n':
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = (zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL] : zzBufferL.charAt(zzMarkedPosL)) != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = (zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL] : zzBufferL.charAt(zzMarkedPosL)) != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 10: 
          { return OPEN_PAREN;
          }
        case 38: break;
        case 32: 
          { return IF;
          }
        case 39: break;
        case 37: 
          { return DIRECTORY;
          }
        case 40: break;
        case 11: 
          { return CLOSE_PAREN;
          }
        case 41: break;
        case 12: 
          { return SEMICOLON;
          }
        case 42: break;
        case 28: 
          { return THREECOLON;
          }
        case 43: break;
        case 21: 
          { return COMPOSED_MONAD;
          }
        case 44: break;
        case 25: 
          { return SYMBOL;
          }
        case 45: break;
        case 2: 
          { return NEWLINE;
          }
        case 46: break;
        case 5: 
          { return NUMBER;
          }
        case 47: break;
        case 31: 
          { return SIXCOLON;
          }
        case 48: break;
        case 6: 
          { return VERB;
          }
        case 49: break;
        case 29: 
          { return FOURCOLON;
          }
        case 50: break;
        case 14: 
          { return OPEN_BRACE;
          }
        case 51: break;
        case 15: 
          { return CLOSE_BRACE;
          }
        case 52: break;
        case 16: 
          { return COMMENT;
          }
        case 53: break;
        case 13: 
          { return OPEN_BRACKET;
          }
        case 54: break;
        case 9: 
          { return COLON;
          }
        case 55: break;
        case 34: 
          { return CHAR;
          }
        case 56: break;
        case 19: 
          { return IDENTIFIER_SYS;
          }
        case 57: break;
        case 8: 
          { return QUOTE;
          }
        case 58: break;
        case 18: 
          { return DO;
          }
        case 59: break;
        case 35: 
          { return SYMBOL_VECTOR;
          }
        case 60: break;
        case 33: 
          { return NUMBER_VECTOR;
          }
        case 61: break;
        case 36: 
          { return WHILE;
          }
        case 62: break;
        case 27: 
          { return TWOCOLON;
          }
        case 63: break;
        case 22: 
          { return NIL;
          }
        case 64: break;
        case 24: 
          { return STRING;
          }
        case 65: break;
        case 30: 
          { return FIVECOLON;
          }
        case 66: break;
        case 3: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 67: break;
        case 4: 
          { return IDENTIFIER;
          }
        case 68: break;
        case 26: 
          { return ONECOLON;
          }
        case 69: break;
        case 7: 
          { return CLOSE_BRACKET;
          }
        case 70: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 71: break;
        case 17: 
          { return DERIVED_VERB;
          }
        case 72: break;
        case 23: 
          { return ZEROCOLON;
          }
        case 73: break;
        case 20: 
          { return COMPOSED_VERB;
          }
        case 74: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
