package lecturesix.lecturesixpointeleven;
class Plane{
        
    }
class FighterPlane extends Plane{

    }
class Animal{
    
public void eat(String foodtype){
    System.out.println("Animals are required to eat");
}
void sleep(){
    System.out.println("animal is sleeping");//default type
}
// public void running(){
//     System.out.println("animal is running");
// }
public Plane running(){
    System.out.println("animal is running");
    Plane p=new Plane();
    return p;
}
}

class Tiger extends Animal{
//    void eat(){//Cannot reduce the visibility of the inherited method from Animal while overriding
//     System.out.println("tiger hunt");
//    }
public void eat(String foodtype){
    System.out.println("Tiger hunts");
}
public void eat(){
    System.out.println("Tiger hunts and eats");
}
protected void sleep(){
    System.out.println("tiger sleeps");//we can increase the visibility while overriding inherited methods
}
// public int running(){// but the primitive  return types cannot be changed
//     System.out.println("tiger is running");
//     //return 10;// void hai toh error
//     return 10;
// }
// public Plane running(){// co varient return type are type of return having  is-A relationship between 
//     System.out.println("tiger is running");
//    Plane fp=new Plane();
//    return fp;
// }
public FighterPlane running(){// co varient return type as their is is-A relationship between plane and fighter plane
    System.out.println("tiger is running");
   FighterPlane fp=new FighterPlane();
   return fp;
}
}
public class Inheritance11 {
    public static void main(String[] args) {
        Tiger t=new Tiger();
        t.eat();
    }
}
