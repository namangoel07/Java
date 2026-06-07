package lecturesix.lecturesixpointnine;
class Telusko2{
    Telusko2(){
        System.out.println("Telusko ");
    }
}
class Alien2 extends Telusko2{
//   Alien2(){//whether we write or not constructor is created default having super() when we create a object
//      //super// it is always there whether we write or not 
//      // it refers to parent class
//   }
}
public class Inheritance5 {
    public static void main(String[] args) {
        Alien2 a=new Alien2();//constructor never gets inherited but we see a output it is due to super method
        
    }
}
