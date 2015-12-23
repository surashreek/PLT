all: Hello.class
 
HelloParser.java: Hello.g4
	antlr4 Hello.g4
 
Hello.class: HelloParser.java Hello.java HelloWalker.java
	javac Hello*.java
