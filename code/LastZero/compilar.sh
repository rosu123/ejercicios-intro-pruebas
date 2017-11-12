#!/bin/bash

javac LastZero.java
javac -cp .:../junit-4.12.jar LastZeroTest.java
javac -cp .:../junit-4.12.jar AllTests.java
java -cp .:../junit-4.12.jar:../hamcrest-core-1.3.jar AllTests
