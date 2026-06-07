package lecturesix.lecturesixpointeight;
class Alien{
    static{
       System.out.println("SB1");
    }
    static {
     System.out.println("SB2");// can be multiple static block
    }
    {
        System.out.println("non static 1");
    }//static will run first then java initialisation block
    {
        System.out.println("non static 2");
    }// can be multiple java initialisation block
   
}
public class static4{
    public static void main(String[] args)
   {
   // Alien.someStaticMethod();   // just this is enough to load class static will run after calling class only no object creation want
        Alien a1=new Alien();//during constructor call java initialisation block execute first this object is to call non static method for that class is call first thats why static block is executing


        Alien a2=new Alien();// static will execute once only while non static will run 2 times
    }
}