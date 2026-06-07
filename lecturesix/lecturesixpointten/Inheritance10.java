package lecturesix.lecturesixpointten;
class Parent{
int i=10;
void disp(){
    System.out.println("disp of parent");
}
}
class Child extends Parent{
int i=100;
void alpha(){
    System.out.println("alpha");
    System.out.println(i);
    System.out.println(super.i);
   // disp();
    super.disp();
}
void disp(){
   System.out.println("disp of child");
}
}
public class Inheritance10 {
    public static void main(String[] args) {
        //Child c; it creates the reference
        //new Child(); it is also object creation i.e. no name object creation
         // this is used if to run only one task     
        new Child().alpha();
        new Child().disp();// new object created to do another task
    }
}
