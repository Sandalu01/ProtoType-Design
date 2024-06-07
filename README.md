# Prototype Design Pattern in Java

## Overview
This project demonstrates the Prototype Design Pattern using a `ComputerShop` class. The Prototype Design Pattern is used to create a duplicate object while keeping performance in mind. This pattern involves implementing a prototype interface which tells to create a clone of the current object.

## Structure
- **ComputerShop**: The main class that includes properties and methods related to the computer shop.
- **Inizilizer**: The class containing the `main` method to demonstrate the prototype pattern.

## Files
- `ComputerShop.java`: Contains the definition of the `ComputerShop` class and implements the `Cloneable` interface.
- `Inizilizer.java`: Contains the `main` method to test the prototype pattern.

## Usage
To run the project, ensure you have Java installed and properly set up.

1. **Compile the Java files**:
    ```sh
    javac ComputerShop.java Inizilizer.java
    ```

2. **Run the main class**:
    ```sh
    java Inizilizer
    ```

## Example
The `main` method in `Inizilizer` demonstrates creating and cloning `ComputerShop` instances.

```java
public class Inizilizer {
    public static void main(String[] args) throws CloneNotSupportedException {
        ComputerShop shop = new ComputerShop();
        shop.setShop("Colombo");
        shop.initializeComputer();
        System.out.println(shop);

        ComputerShop shop1 = new ComputerShop();
        shop1.setShop("Kandy");
        shop1.initializeComputer();
        System.out.println(shop1);

        // Changing instance of clone
        ComputerShop shop2 = (ComputerShop) shop1.clone();
        shop1.setShop("Anuradhapura");
        shop1.setComputer(new ArrayList<>());
        System.out.println(shop1);
    }
}
```

## image for understanding

![Screenshot 2024-06-07 085704](https://github.com/Ran-som/Mobile-selling/assets/108582011/baaeeb95-cdbb-48b4-97da-261c484fc4ff)
