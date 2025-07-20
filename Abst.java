public class Abst{
    public static void main(String args[]){
        // Horse h= new Horse();
        // Chicken c= new Chicken();
        
        // h.walk();

        // INTERFACES

        Horse h = new Horse();
        Chicken c= new Chicken();
        h.walk();
        c.walk();
        

    }
}

// ABSTRACTION := Hiding Internal detail showing only neccessary fuctionality is called "ABSTRACTION"
/*
    * ABSTRACT CLASS :=
    *INTERFACE
 */
// ABSTRACT CLASS 
/* 
abstract class Animal{

    void eat(){
        System.out.println("Animal cat");
    }
    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Horse walk with 4 leg");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("chicken walk with 2 leg");
    }
}
*/


interface Animal{
    void walk();
}

class Horse implements Animal{
    public void walk(){
        System.out.println("Horse Walk with 4 leg");
    }
}
class Chicken implements Animal{
    public void walk(){
        System.out.println("Chicken walk with 2 leg");
    }
}
