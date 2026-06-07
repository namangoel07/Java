package lecturesix.lecturesixpointnine;
class Telusko{
    private String name="Telusko Edu";
    void disp()
    {
        System.out.println(name);
    }
}
class Alien1 extends Telusko{
    // void disp(){
    //     name="alien";
    // }
}
public class Inheritance3 {
    public static void main(String[] args) {
        Alien1 a=new Alien1();
        a.disp();
    }
}
