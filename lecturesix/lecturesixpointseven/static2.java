package lecturesix.lecturesixpointseven;
class Demo2{
       static int a,b,c;
int x,y,z;
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
{
    x=44;
    y=45;
    z=46;
    System.out.println("java initialisation block");
}
Demo2(){
    System.out.println("Constructor");
}
void disp2(){
    System.out.println("non static method");
    System.out.println("a:"+a);
    System.out.println("b:"+b);
    System.out.println("c:"+c);
    System.out.println("x:"+x);
    System.out.println("y:"+y);
    System.out.println("z:"+z);

}

}
public class static2 {
    public static void main(String[] args) {
       // Demo2.disp();
        Demo2 d2=new Demo2();
        d2.disp2();
        Demo2 d3=new Demo2();
        d3.disp2();// static also call as class variables only executes once while non static can run based on the objects
    }
}
