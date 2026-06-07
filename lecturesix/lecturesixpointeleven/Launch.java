package lecturesix.lecturesixpointeleven;
// final class Plane1{
//     public void fly(){
//         System.out.println("plane is flying");
//     }
// }
class Plane1{
    final int age=10;// it work as constant
    final public void fly(){
      //  age=20;//The final field Plane1.age cannot be assigned
        System.out.println("plane is flying");
    }
}
class FighterPlane1 extends Plane1{//showing error
    // public void fly(){//Cannot override the final method from Plane1
    //     System.out.println("fighter planwe");
    // }
}
public class Launch {
    public static void main(String[] args) {
        FighterPlane1 f=new FighterPlane1();
        f.fly();
    }
}
