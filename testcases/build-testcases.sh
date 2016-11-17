#!/bin/bash

# clear out the old testcases
rm -rf binary

WD=$(pwd)
TESTCASEBASE="$WD/TestcaseBase/src/annotations/"

#ASSERTIONS_SOURCE="$WD/TestcaseAssertions/src/CheckAGTExpectations.java"
#ASSERTIONS="$WD/CheckAGTExpectations.class"

ASSERTIONS="$WD/CheckAGTExpectations.jar"
ASSERTIONS_SUMMARY="$WD/assertions-summary.csv"
#javac $ASSERTIONS_SOURCE -d "$WD/"

for TESTCATEGORY in $WD/source/*; 
do
    cd $TESTCATEGORY
    for TESTCASE in *; 
    do
        echo "Building: $TESTCASE"
        BUILD="$WD/binary/$TESTCASE"
        SRC="$BUILD/src"
        mkdir -p "$SRC/annotations"
        find $TESTCASEBASE -name \*.java -exec cp {} "$SRC/annotations/" \;
        mkdir -p "$SRC/testcase"
        find $TESTCASE -name \*.java -exec cp {} "$SRC/testcase/" \;
        SOURCE=""
        for J in `find $SRC -name \*.java`
        do
            SOURCE="$SOURCE $J"
        done
        TEMP="$BUILD/$TESTCASE"
        mkdir -p "$TEMP"
        /usr/bin/javac -d "$TEMP" $SOURCE
        
        # create a manifest file
        MANIFEST="$BUILD/MANIFEST.MF"
        echo "Manifest-Version: 1.0" >> $MANIFEST
        echo "Class-Path: ." >> $MANIFEST
        echo "Main-Class: testcase.$TESTCASE" >> $MANIFEST
        
        # create the executable jar
        cd $TEMP
        CATEGORY=$(basename $TESTCATEGORY)
        mkdir -p "$WD/binary/$CATEGORY"
        /usr/bin/jar cmf $MANIFEST "$WD/binary/$CATEGORY/$TESTCASE.jar" "annotations" "testcase"
        
        # remove build directory
        rm -rf $BUILD
        
        if [ "$CATEGORY" == "AGT" ]; then
            java $ASSERTIONS "$WD/binary/$CATEGORY/$TESTCASE.jar" >> $ASSERTIONS_SUMMARY
        fi

        # reset paths
        cd $TESTCATEGORY
    done
done

