# RomanNumbers Coding Kata  

![alt text](http://static.tumblr.com/5nbl396/VRomeu5l2/read-write-roman-numerals-200x200.jpg "Roman Numbers") 


This is a simple coding kata originally put together back in 2012 as a sample project for teach my team how to collaborate and contribute changes using [Git](https://git-scm.com/) for distributed version control.

The purpose of the Maven project is to convert a regular arab number into it's Roman numeral representation.

## Building the project

The project is a really simple Maven project. To build the whole project, just run ```mvn build``` from the root directory or ```mvn verify``` to see the project build and run all tests.

## Running the tests

The project includes a csv file of test data: a list of arab numbers and their known Roman equivalents.  
To see what the tests execute, run `mvn test` and watch the test output in the console.

## Manually running acceptance tests

For now, the only way to run a manual acceptance test is to generate the jar and run from the command line.
From the root directory, run `mvn package` , the JUnit tests will run and Maven will package the jar file to the "target" directory.
Once Maven has finished, CD to /target and run `java -jar romanNumbers-1.0.jar #` where "#" is the arab number you wish to convert.

