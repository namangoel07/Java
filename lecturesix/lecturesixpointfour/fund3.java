package lecturesix.lecturesixpointfour;
class Mul{
//    int mul(int x,int y){
//     return x*y;
//    }
   double mul(int x,int y,double z){
    System.out.println("2 int 1 double");
    return x*y*z;
    
   }
//    double mul(int x,double y,double z){
//     System.out.println("1 int 2 double");
//     return x*y*z;
//    }
   double mul(double x,double y,double z){
    return x*y*z;
   }
   double mul(int x,double y){
    return x*y;
   }
//    double mul(double x,int y){
//     return x*y;
//    } // it will give error with upper as it cannot choose one
}
public class fund3 {
    public static void main(String[] args) {
        Mul m=new Mul();
        System.out.println(m.mul(4,4));
        System.out.println(m.mul(1,2,3));// 2 int 1 double is getting prefrence
        System.out.println(m.mul(44,44,44));
      



    }
}
