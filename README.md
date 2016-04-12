# Thought Works -Rails
Programming language : Java 7. Thus, I zipped the src file in form of Eclipse environment

main function is in main package. Driver.java
This class takes two parameters
$java Driver graph.txt commands.txt 

or set up on eclipse and run Driver.java

I have used factory pattern and singleton pattern.
I have modelled the application in the form of Model-View-Controller architecture pattern. So, the data and the view are seperated and modularized.

I have used the graph data structure to represent the Rail network

There are three kinds of custom exceptions that can be thrown by the application
NoSuchPathException
NoSuchVertexException
WrongInputException

There are seven packages
Graph and model package contains the core graph data structure that represents the rail network
Exception package that contains the types of custom exceptions
View package that contains the parser which is responsible for parsing the input and giving it to the controller
Controller package reads the incoming commands and routes it to the appropriate methods and handlers. It can be graph generation or execution of a command

Following is the sample of the input file
Graph.txt
AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7

Commands.txt
Distance: A-B-C
Distance: A-D
Distance: A - D - C
Distance: A - E - B - C - D 
Distance: A - E - D
Paths: MAX_STOPS , 3 ,C - C
Paths: EXACT_STOPS , 4 , A-C 
Shortest: A-C
Shortest: B - B
Paths: MAX_DISTANCE , 30 , C- C

Please follow the same format of the commands.

Due to time constraints, could not write test cases. Ideally, we should write junit testcase covering all the methods on model/controller


