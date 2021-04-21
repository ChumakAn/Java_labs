# Java_labs
Task for lab 7:
Create a console program in Java and write a class from your lab 7:
- Additional 5 private fields that best describe this class (in addition to the fields listed in the table)
- Methods for accessing these fields (for example, for the field name - getName () and setName ())
- Static field (numeric type)
- You must add 2 protected fields for each class.
- The fields in items 3 and 4 must represent the attributes of the described class
- Default constructor, constructor with four parameters (the first four properties according to claim 1) and constructor with all fields. When working with constructors, you should forward the call to one of the constructors using this and avoid copying the code.
Methods
- toString - display information about the object
- Static method printStaticField () - displays information about the value of the static field (where Field - field name)
- The printField () method - displays information about the value of the static field
- resetValues ​​- changes the values ​​of all fields to those passed in the parameters

In the main () method, define 3 objects of type from the task (due to different constructors) and output information about them using the toString () method and output information using the printStaticField () and printField () methods

###TASK FOR LAB 8:
-
 - Write code for Lab 2(UML diagram)
 - Use java code convention
 - CLasses must be distributed in packages
 - Work with console must be minimal
 - Code must contain only that classes that are described in the diagram
 - Sorting must use java built-in methods
 - Sorting must be implemented in separate method
 - No static methods/attributes are allowed (the only exception is a main method)
 - You must use Enums
 - Code must be in a separate branch with PR
 - Comparison must be implemented using lambdas
 - Instead of getters/setters you should use `@Data` annotation from lombok
 - Use maven and Jococo(in build section), FindBugs, PMD, CheckStyle plugins
 - Run `mvn site` and fix errors reported by checkstyle, pmd and findbugs

###TO RUN:
-
 - Clone/download LabNo8 branch
 - If you`re using IntelliJi IDEA: push 'RUN' button. 
 - Else:
 - Open cmd and go to the into repo folder
 - Run `mvn compile`
 - Go into `target/classes` and run `java ua/lviv/iot/shop/App` 
 
 ###USEFUL COMMANDS:
 -
- mvn checkstyle:check
- mvn findbugs:gui
- mvn pmd:pmd
