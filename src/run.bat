@ECHO OFF
set CLASSPATH = %PATH%;MyPackage;MySecondPackage;

javac -encoding UTF-8 Main.java
java Main
pause