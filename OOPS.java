public class OOPS {
    public static void main(String[] args) {
        // System.out.println("Jai Jagannath");


        // Pen p=new Pen();  //WE HAVE CREATED PEN OBJECT WITH NAME "P".

        // TO ACCESS OBJECT PROPERTIES AND FUNCTION WE USE "." OPERATOR
        // p.color="blue";
        
        // p.tip=5;
        // // System.out.println(p.tip);
        // p.color="yellow";
        // // System.out.println(p.color);
        // p.changeColor("red");
        // System.out.println(p.color);


        // USING GETTERS ANSD SETTERS 
        // p.setColor("pink");
        // System.out.println(p.getColor());
        // p.setTip(5);
        // System.out.println(p.getTip());



        // CONSTRUCTOR object 
        Student s=new Student();
        Student s1=new Student("channu");
        Student s3=new Student(23);



    }
}

// CLASS NAME ALWAYS START WITH CAPITAL LETTER 
// ITS NOT GIVE ANY ERROR 

// public class Pen{
//     String color;
//     int tip;

//     void changeColor(String newCOlor){
//         color=newCOlor;
//     }
//     void changeTip(int changeTip){
//         tip=changeTip;
//     }
// }
/* 
public class Pen{
   private String color;
   private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color=newColor;
    }

    void setTip(int Tip){
        this.tip=Tip;
    }

}
*/

//  CONSTRUCTOR : * Constructor is special method in class which is called automatically when object is created.
//                * Constructor have the same name as Class name 
//                * Constructor does not return anyThing (Not Even The void)


/* CONSTRUCTOR HAS 3 TYPES :
    *Parameterized Constructor 
    *Non-Parameterized Constructor 
    *Copy Constructor  
 */
public class Student{
    String name;
    int age;

    Student (){
        System.out.println("constructor is called ...");
    }
    Student(String name ){
        this.name=name;
        System.out.println("name " + this.name);
    }
    Student(int age){
        this.age = age ;
    }
}

