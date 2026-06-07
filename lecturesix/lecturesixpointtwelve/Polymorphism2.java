package lecturesix.lecturesixpointtwelve;
class Aeroplane2{
    public void takingOff(){
        System.out.println("aeroplane must take off in order to fly");
    }
    public void landing(){
        System.out.println("Aeroplane is landing");
    }
}
class Cargoplane2 extends Aeroplane2{
 public void takingOff(){
    System.out.println("cargoplane is taking off ");
 }
 public void fly(){
    System.out.println("cargoplane is flying");
 }
}
class FighterPlane2 extends Aeroplane2{
    public void takingOff(){
        System.out.println("Fighterplane is taking off");
    }

    public void fly(){
        System.out.println("fighter plane is flying");
    }
}
class PassengerPlane1 extends Aeroplane2{
    public void takingOff(){
        System.out.println("Passengerplane is taking off");
    }

    public void fly(){
        System.out.println("Passenger plane is flying");
    }
}
public class Polymorphism2 {
    public static void main(String[] args) {
    Cargoplane2 cp=new Cargoplane2();
    //    cp.landing();
    //    cp.takingOff();// different line doing 
    //    cp.fly();
       
    FighterPlane2 fp=new FighterPlane2();
    //  fp.takingOff();
    //  fp.landing();
    //  fp.fly();

    PassengerPlane1 pp= new PassengerPlane1();
    //    pp.takingOff();
    //    pp.landing();
    //    pp.fly();
       Aeroplane2 ref;// it is only reference 
       ref=cp;
      ref.takingOff();
      ref.landing();
      //ref.fly(); The method fly() is undefined for the type Aeroplane2
      System.out.println("************");
      ref=fp;
      ref.takingOff();//1 is to many-> same line is doing different task-> polymorphism
      ref.landing();
      System.out.println("**************");
      ref=pp;
      ref.landing();
      ref.takingOff();
    }
}
