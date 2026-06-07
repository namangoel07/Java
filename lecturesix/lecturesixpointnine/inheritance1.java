package lecturesix.lecturesixpointnine;
class Telusko{
  int age;
  void disp(){
    age=10;
    System.out.println("Tekusko age is"+age);
  }
}
class Alien extends Telusko// alien is like subclass 
{

}
public class inheritance1 {
    public static void main(String[] args) {
        // Telusko t=new Telusko();
        // t.disp();
        Alien a=new Alien();// parent is telusko
        a.disp();// it is running even it is not there is alien class using extends -> inheritance
    }

}
