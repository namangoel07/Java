package lecturesix.lecturesixpointnine;
     
class Aeroplane{// object class
 void fly(){
  System.out.println("Aeroplane flies");
 }
 void landing(){
    System.out.println("Aeroplane is landing");
 }
}

class CargoPlane extends Aeroplane{
    void fly(){//over ridden method
 System.out.println("Passenger plane flies at medium height");
    }
    void takingoff(){//specialised method
        System.out.println("taking off");
    }
}
// class CargoPlane{// extends object

// }

public class Inheritance6 {
    public static void main(String[] args) {
  
        // CargoPlane cg=new CargoPlane();
        // cg.fly();
        // cg.landing();
        // cg.takingoff();
        //-----------------------------------
        //during object creation type of object on both sides should be same mandatory but in one case it is allowed to have different
        //we can write parent name on one side 
        Aeroplane plane=new CargoPlane();//upcasting
        plane.fly();
        plane.landing();
        //plane.takingoff(); it will not work as it is of parent type and taking off is specialised method
        ((CargoPlane) plane).takingoff();//downcasting-> temporarily changing parent type reference to child type so that you can access specialised method of child class is known as downcasting
      
    }
}
 

