package lecturesix.lecturesixpointthirteen;

//final abstract class Aeroplane5//illegal
 abstract  class Aeroplane5{
    static{
    System.out.println("Aeroplane");
}
    public abstract void takingOff();
    //public final abstract void takingOff(); //illegal as final method cannot be override
    public abstract void landing();// we only declare in abstract method and implementation will be done by other class
    public void fly(){
        System.out.println("Aeroplane flies");
    } 
    public Aeroplane5(){
        System.out.println("Aeroplane5 parent constructor");
    }
   // abstract int age;//Illegal modifier for the field age; only public, protected, private, static, final, transient & volatile are permitted
}
class Cargoplane5 extends Aeroplane5{
 public void takingOff(){
    System.out.println("cargoplane is taking off ");
 }
 public void fly(){
    System.out.println("cargoplane is flying");
 }
 public void landing(){
    System.out.println("CargoPlane is landing");
 }
}
class FighterPlane5 extends Aeroplane5{
    public void takingOff(){
        System.out.println("Fighterplane is taking off");
    }

    public void fly(){
        System.out.println("fighter plane is flying");
    }
    public void landing(){
        System.out.println("FighterPlane is landing");
    }
}
class PassengerPlane5 extends Aeroplane5{
    public void takingOff(){
        System.out.println("Passengerplane is taking off");
    }

    public void fly(){
        System.out.println("Passenger plane is flying");
    }
    public void landing(){
        System.out.println("PAssengerPlane is landing");
    }
}
public class abstract1 {
    public static void main(String[] args) {
        //Aeroplane5 ar=new Aeroplane5();// we cannot create object/instance of an abstract class
        Cargoplane5 a=new Cargoplane5();
        a.fly();
    }
}

