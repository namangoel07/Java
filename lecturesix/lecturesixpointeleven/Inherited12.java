package lecturesix.lecturesixpointeleven;
class Animal4{
    

//  void sleep(){
//     System.out.println("animal is sleeping");
// }
void sleep(){
    System.out.println("animal is sleeping");//default type
}

}
class Tiger4 extends Animal4 {

protected void sleep(){// private methods never get inherited so it is specialised method
    System.out.println("tiger sleeps");//we can increase the visibility while overriding inherited methods
}
// protected void sleep(){//if inheritance is not there and both method have same name then that will run of which object is
//     System.out.println("tiger sleeps");
// }

}

public class Inherited12 {
    public static void main(String[] args) {
        Tiger4 t=new Tiger4();
        t.sleep();// tiger sleeps output as in case of different classes of animal and tiger
    }
}
