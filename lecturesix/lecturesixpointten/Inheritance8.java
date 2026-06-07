package lecturesix.lecturesixpointten;
class Alpha1{
    int a,b;
   public Alpha1(){
    a=10;
    b=20;
    System.out.println("alpha zero parameterized ");
   }
   public Alpha1(int a,int b){
    this.a=a;
    this.b=b;
    System.out.println("param constructor");
   }
}
class Beta1 extends Alpha1{
    int x,y;
    public Beta1(){
        x=1;
        y=2;
        System.out.println("Beta zero param");
    }
    public Beta1(int x, int y){
        this.x=x;
        this.y=y;
        System.out.println("param Beta");

    }
    void disp(){
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }
}
public class Inheritance8 {
    public static void main(String[] args) {
        Beta1 b1=new Beta1(4,5);
        b1.disp();
    }
}
