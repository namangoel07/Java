package lectureeight.lectureeightpointfour;
// class A{
//     public void show(){
//         System.out.println(" a show");
//     }
// }
// class B extends A{
//    public void show(){
//     System.out.println(" B show");
//    }
// }



 
//----------------------------------------------------

 class Person{//we cannot make it static 
  int age;
  String name;
  public void printName(){
    System.out.println("Yashraj");
  }
  static class Phone{
    int price;
    String model;
    public void details(){
        System.out.println("here is details");
    }
}


}
public class Demo {
    public static void main(String[] args) {
       // A obj=new A();
    //    A obj=new B();
    //     obj.show();
    Person obj=new Person();
    obj.printName();
    Person.Phone obj1=new Person.Phone();
    obj1.details();
    //Phone obj1=new Phone();//it will not run as it is inside person
    }
}
