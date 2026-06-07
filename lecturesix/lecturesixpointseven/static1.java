package lecturesix.lecturesixpointseven;
class Demo{
static int a,b,c;
//int x,y,z;
static{
    System.out.println("Static int block");
    a=10;
    b=20;
    c=30;
}
static void disp(){
    System.out.println("a:"+a);
    System.out.println("b:"+b);
    System.out.println("c:"+c);
}
}
public class static1 {
    static int a;
    static{
        a=10;
        System.out.println("a:"+a);
        System.out.println("static block");
    }
    public static void main(String[] args) {
        System.out.println("main method");
        Demo.disp();
    }
}
