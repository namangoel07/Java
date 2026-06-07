package lecturesix.lecturesixpointeight;
class Demo2{
    //int a;
    // static int a;
    // static{
    //     a=10;//error when only int
    // }
    // static{
    //     //a=10;//no error as i can assign value
    //     System.out.println(a);//error that is compile time error as i am printing it first declaring later

    // }
    // static int a;//will 
    static{
        disp();
    }
    static int a=10;
    public static void disp(){
        System.out.println(a);// it will run having value 0
    }
}
public class static5 {
    public static void main(String[] args) {
          Demo2 d=new Demo2();
         // Demo2.disp();// 0 10
         d.disp();// 0 10
    }
}
