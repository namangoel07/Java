package lecturesix.lecturesixpointten;
class Alpha2{
    int a,b;
   public Alpha2(){
    a=10;
    b=20;
    System.out.println("alpha zero parameterized ");
   }
   public Alpha2(int a,int b){
    this.a=a;
    this.b=b;
    System.out.println("param alpha");
   }
}
class Beta2 extends Alpha2{
    int x,y;
    public Beta2(){
        this(2,3);
        x=1;
        y=2;
        System.out.println("Beta zero param");
    }
    public Beta2(int x, int y){
        super(10,1);
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
public class Inheritance9 {
    public static void main(String[] args) {
        // Beta2 b2=new Beta2(2,3);
        // b2.disp();
        // Beta2 b=new Beta2();
        // b.disp();
    }
}
