package lectureeight.lectureeightpointtwo;
interface Telusko{
    void show();
    default void disp(){
        System.out.println("telusko is ok");
    }
    //static void announcement();
    static void announcement(){
        System.out.println("8 days fastrack spring boot course is announced by telusko ");
    }
}
class Aliens implements Telusko{
public void show(){
    System.out.println("Hello aliens");
}
// public void disp(){
//         System.out.println("telusko is ok ok");
//     }
}
public class Interface5 {
    public static void main(String[] args) {
        Aliens a=new Aliens();
        a.show();
        a.disp();
        
        Telusko.announcement();
    }
}
