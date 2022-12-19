# JavaFX-Template-Method
This project is a JavaFX template for building a GUI application that generates either a gaming or office computer, using the template method design pattern.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
Java 8 or later
JavaFX 8 or later

### Running the Application
To run the application, follow these steps:

1. Clone the repository to your local machine:
```
git clone https://github.com/miranmember/JavaFX-Template-Method.git
```
2. Navigate to the project directory:
```
cd JavaFXTemplate
```
3. Compile the code using maven and run it
```
mvn clean
mvn compile
mvn exec:java
```

## Using the Application
When the application starts, you will see a welcome screen with two buttons: "Gaming Computer" and "Office Computer". Clicking on either of these buttons will generate a random computer configuration and display it in a list view. You can go back to the welcome screen by clicking the "Back" button.

## Design
This project uses the template method design pattern to generate the computer configurations. The Computer class is the abstract base class with a template method makeComputer() that defines the skeleton of the algorithm for generating a computer configuration. The GamingComputer and OfficeComputer classes are concrete subclasses that override some of the steps in the makeComputer() method to provide specific behavior for gaming and office computers.
