public class Inhe{
    public static void main(String args[]){
        // System.out.println("Ram");
        // Dog d = new Dog();
        // d.eat();

        // METHOD OVELOADING EX
        Calculator c= new Calculator();
        // System.out.println(c.add(2,2));
        // System.out.println(c.add(10,20,30));

        // METHOD OVERRIDING EX
        Animal a1= new Dog();
        // a1.makeSound();
        Animal a2=new Cat();
        // a2.makeSound();

    }
}

//   *** INHERITANCE IN JAVA ***
/*
    * one or more classes aquire all properties and methods from another class using "EXTENDS" keyword is called inheritance 
    types :=  
        1. Single-level Inheritance 
        2. Multi-level Inheritance
        3. Hierachial Inheritance
        4. Hybrid Inheritance 
 */
public class Animal{
    
    void makeSound(){
        System.out.println("Animal make sound...");
    }
    void Drink(){
        System.out.println("Driking Water...");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog Barking...");
    }
    void eat(){
        System.out.println("Animal can Eat...");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat meows...");
    }
}

// POLYMORPHISM 
/*
    *Polymorphism means "many forms"
    *if one task is performed in many ways is called Polymorphism
    *Types :=  
        1.method overloading := means a method or function in a class with same name but different parameter
        2.method overriding := means redefining method of super class in subclass is called method overloading
 */

// METHOD OVERLOADING 
class Calculator {
    int add(int a, int b) { // Method with 2 parameters
        return a + b;
    }
    int add(int a, int b, int c) { // Same method name, 3 parameters
        return a + b + c;
    }
}

