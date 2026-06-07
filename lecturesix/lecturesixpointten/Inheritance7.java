package lecturesix.lecturesixpointten;
class Alpha{
    int a,b;
   public Alpha(){
    a=10;
    b=20;
    System.out.println("alpha zero parameterized ");
   }
//    public Alpha(int a,int b){
//     this.a=a;
//     this.b=b;
//     System.out.println("param constructor");
//    }
}
class Beta extends Alpha{
    int x,y;
    public Beta(){
        x=1;
        y=2;
        System.out.println("Beta zero param");
    }
    public Beta(int x, int y){
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
public class Inheritance7 {
    public static void main(String[] args) {
        Beta b=new Beta(4,5);
          b.disp();
    }
}
