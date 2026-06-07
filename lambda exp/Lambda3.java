@FunctionalInterface
interface lam{
    void show();//functional interface i.e. having only one abstract method
    //void getData();
}
public class Lambda3{
    public static void main(String[] args) {
        lam obj=()-> 
        {System.out.println("in show");//work only for one abstract method
    };
        obj.show();
    }
}