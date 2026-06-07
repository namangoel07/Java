package lecturesix.lecturesixpointnine;
class Aeroplane{// if a class is not extending anything it is  always a extends a default class that is object class
 void fly(){
  System.out.println("Aeroplane files");
 }
 void landing(){
    System.out.println("Aeroplane is landing");
 }
}

class CargoPlane extends Aeroplane{
    
}
// class CargoPlane{// extends object

// }
class PassengerPlane extends CargoPlane {

}

public class Inheritance2 {
    public static void main(String[] args) {
        CargoPlane cg=new CargoPlane();
        cg.fly();
        cg.landing();
       
        //write cg. you will see equals,getclass etc. it is due to object class
         PassengerPlane pp=new PassengerPlane();
         pp.fly();
         pp.landing();
    }
}
 