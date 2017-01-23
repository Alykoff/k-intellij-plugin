#!/usr/bin/env bash

IDEA_PATH=~/dev/projects/idea-community
IDEA_LEXER_PATH=${IDEA_PATH}/tools/lexer
FLEX_FILE_PATH=../src/com/appian/intellij/k/k.flex
FLEX_OUTPUT=../gen/com/appian/intellij/k

java -Xmx512m -Dfile.encoding=UTF-8 \
    -jar  ${IDEA_LEXER_PATH}/jflex-1.7.0-SNAPSHOT.jar \
    -skel ${IDEA_LEXER_PATH}/idea-flex.skeleton \
    -d ${FLEX_OUTPUT} \
    ${FLEX_FILE_PATH}