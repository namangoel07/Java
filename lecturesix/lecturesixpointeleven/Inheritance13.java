package lecturesix.lecturesixpointeleven;
class Demo4{
 static int a;
 public static void disp(){
    a=10;
    System.out.println(a+"parent class");
 }
}
class Demo5 extends Demo4{
public static void disp(){// method hiding it act as a specialised method as static method is not overriden
    a=10;
    System.out.println(a+"child class");
 }
}
public class Inheritance13 {
    public static void main(String[] args) {
        Demo4 d=new Demo5();//demo4 is refernce here
        d.disp();
    //     Demo4.disp();
    // Demo5.disp();
    System.out.println("**************");
    Demo5 d2=new Demo5();
    d2.disp();
    }
}
