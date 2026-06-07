package lecturesix.lecturesixpointtwelve;
class Aeroplane3{
    public void takingOff(){
        System.out.println("aeroplane must take off in order to fly");
    }
    public void landing(){
        System.out.println("Aeroplane is landing");
    }
}
class Cargoplane3 extends Aeroplane3{
 public void takingOff(){
    System.out.println("cargoplane is taking off ");
 }
 public void fly(){
    System.out.println("cargoplane is flying");
 }
}
class FighterPlane3 extends Aeroplane3{
    public void takingOff(){
        System.out.println("Fighterplane is taking off");
    }

    public void fly(){
        System.out.println("fighter plane is flying");
    }
}
class PassengerPlane2 extends Aeroplane3{
    public void takingOff(){
        System.out.println("Passengerplane is taking off");
    }

    public void fly(){
        System.out.println("Passenger plane is flying");
    }
}
class Airport{
    public void permit(Aeroplane3 aeroplane){
   aeroplane.takingOff();
   aeroplane.landing();
    }
}
public class Polymorphism3 {
    public static void main(String[] args) {
        Cargoplane3 cp=new Cargoplane3();
    //    cp.landing();
    //    cp.takingOff();// different line doing 
    //    cp.fly();
       
    FighterPlane3 fp=new FighterPlane3();
    //  fp.takingOff();
    //  fp.landing();
    //  fp.fly();

    PassengerPlane2 pp= new PassengerPlane2();
    //    pp.takingOff();
    //    pp.landing();
    //    pp.fly();
    //    Aeroplane3 ref;// it is only reference 
    //    ref=cp;
    //   ref.takingOff();
    //   ref.landing();
    //   //ref.fly(); The method fly() is undefined for the type Aeroplane2
    //   System.out.println("************");
    //   ref=fp;
    //   ref.takingOff();//1 is to many-> same line is doing different task-> polymorphism
    //   ref.landing();
    //   System.out.println("**************");
    //   ref=pp;
    //   ref.landing();
    //   ref.takingOff();// in this we have to write 3 times it is not real polymorphism
    Airport a=new Airport();
    a.permit(cp);
     System.out.println("************");
    a.permit(fp);
     System.out.println("************");
    a.permit(pp);
    }
}
