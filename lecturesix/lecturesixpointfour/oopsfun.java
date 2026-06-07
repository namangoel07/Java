package lecturesix.lecturesixpointfour;
class Calc{
   
    int add(int n1,int n2){
        return n1+n2;
    }
    int add(int n1,int n2, int n3){
        return n1+n2+n3;
    }
    double add(int n1,double n2){
        return n1+n2;
    }
    double add(int n1,double n2,double n3){
        return n1+n2+n3;
    }
    double add(double a,double b,double c){
        return a+b+c;
    }
    double add(double n1,double n2){
        return n1+n2;
    }
    // void add(int a,double b, int c){
    //     double res=a+b+c;
    //     System.out.println(res);
    // }

}
public class oopsfun{
    public static void main(String[] args) {
         int x=10;
    int y=20;
    int z=30;
    double a=10.5;
    double b=20.5;
    double c=30.5;
    Calc C=new Calc();
        System.out.println(C.add(x,y));
          System.out.println(C.add(x,y,z));
            System.out.println(C.add(x,a));
              System.out.println(C.add(x,a,b));
                System.out.println(C.add(a,b,c));
                System.out.println(C.add(a,b));
                 // System.out.print(C.add(x,a,y));

    }
}