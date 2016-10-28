#!/bin/bash

WD=$(pwd)
TESTCASEBASE="$WD/TestcaseBase/src/annotations/"

for D in ./source/*; 
do
    cd $WD;
    cd $D;
    for TESTCASE in *; 
    do
        echo "Building: $TESTCASE"
        BUILD="$WD/binary/$TESTCASE"
        mkdir -p "$BUILD/src/annotations"
        find $TESTCASEBASE -name \*.java -exec cp {} "$BUILD/src/annotations/" \;
        mkdir -p "$BUILD/src/testcase"
        find $TESTCASE -name \*.java -exec cp {} "$BUILD/src/testcase/" \;
        SOURCE=""
        for J in `find $BUILD/src -name \*.java`
        do
            SOURCE="$SOURCE $J"
        done
        TEMP="$BUILD/$TESTCASE"
        mkdir -p "$TEMP"
        /usr/bin/javac -d "$TEMP" $SOURCE
        
        # manually create manifest file
        #mkdir -p "$TEMP/META-INF"
        #MANIFEST="$TEMP/META-INF/MANIFEST.MF"
        #echo "Manifest-Version: 1.0" >> $MANIFEST
        #echo "Class-Path: ." >> $MANIFEST
        #echo "Main-Class: testcase.$TESTCASE" >> $MANIFEST
        
        # let jar utility create manifest
        /usr/bin/jar cfe "$TESTCASE.jar" "testcase.$TESTCASE" "$TESTCASE/*.class"

        # cleanup temp directory
        rm -rf $TEMP
    done
done

