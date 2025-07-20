public class Abst{
    public static void main(String args[]){
        
        //LEARNING SUPER KEYWORD
        Dog dg=new Dog(); //created object of dog 
        dg.eat(); // 1.Animal eats 2.Dog eat
        System.out.println(dg.color); //Brown
        dg.printColor();//Black

    }
}

class Animal{
    String color="black";
    void eat(){
        System.out.println("Animal eats");
    }
}  

class Dog extends Animal{
    String color="Brown";
    void printColor(){
        System.out.println(super.color);
    }
    void eat(){
        super.eat();
        System.out.println("Dog eat");
    }
}