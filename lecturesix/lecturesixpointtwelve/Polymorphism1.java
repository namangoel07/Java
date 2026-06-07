package lecturesix.lecturesixpointtwelve;
class Aeroplane{
    public void takingOff(){
        System.out.println("aeroplane must take off in order to fly");
    }
    public void landing(){
        System.out.println("Aeroplane is landing");
    }
}
class Cargoplane extends Aeroplane{
 public void takingOff(){
    System.out.println("cargoplane is taking off ");
 }
 public void fly(){
    System.out.println("cargoplane is flying");
 }
}
class FighterPlane extends Aeroplane{
    public void takingOff(){
        System.out.println("Fighterplane is taking off");
    }
    public void fly(){
        System.out.println("fighter plane is flying");
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
        Aeroplane cp=new Cargoplane();//upcasting
        cp.takingOff();
        cp.landing();
       ((Cargoplane)cp).fly();
        Aeroplane fp=new FighterPlane();//using parent type reference type is called upcasting
        fp.takingOff();
        fp.landing();
        ((FighterPlane)fp).fly();
    }
}
