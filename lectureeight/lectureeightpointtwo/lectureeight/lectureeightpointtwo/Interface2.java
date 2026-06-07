package lectureeight.lectureeightpointtwo;
interface Calc{
    void add(int a,int b);//by deafult public abstract is written whether we write or not
    public abstract void sub(int a,int b);// 2 abstract methods
}
interface Calc2{
int mul(int a,int b);
int div(int a,int b);
}
class Calculator{
    public void disp(){

        System.out.println("hello");
    }
}
class Calculator2{
    public void disp(){

        System.out.println("hello");
    }
}
//but we cannot extends more then one class in it
class MyCalc1 extends Calculator  implements Calc,Calc2{//implements is same as extends which is used in case of interface
    public void add(int a,int b){
       
        int res=a+b;
        System.out.println(res);
    }
    public void sub(int a,int b){
     int res=a-b;
     System.out.println(res);
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
class MyCalc2 implements Calc,Calc2{
 public void add(int a,int b){
    int n1=a;
    int n2=b;
    int res=n1+n2;
    System.out.println(res);
 }
 public void sub(int a,int b){
    int n1=a;
    int n2=b;
    int res=n1-n2;
    System.out.println(res);
 }
 public int mul(int a,int b){
    int n1=a;
    int n2=b;
    return n1*n2;
 }
 public int div(int a,int b){
    int n1=a;
    int n2=b;
    return n1/n2;
 }
}
class MyCalc3 implements Calc,Calc2{
 public void add(int a,int b){
   if(a>0 && b>0){
    int res=a+b;
    System.out.println(res);
   }
   else{
    System.out.println("negative number");
   }
 }
 public void sub(int a,int b){
    if(a>0 && b>0){
        int res=a-b;
        System.out.println(res);
    }
    else{
        System.out.println("negative number");
    }
 }
 public int mul(int a,int b){
   if(a>0 && b>0){
    int res=a*b;
    return res;
   }
   else{
    return 0;
   }
  
 }
  public int div(int a,int b){
   if(a>0 && b>0){
    int res=a/b;
    return res;
   }
   else{
    return 0;
   }
  
 }
}
// class Algebra{
//     public void cal(Calc c,int a,int b){
//         c.add(a,b);
//          c.sub(a,b);
//     }
// }
public class Interface2 {
    public static void main(String[] args) {
       Calc c1=new MyCalc1();
       c1.add(4,5);
       c1.sub(5, 4);
       Calc c2=new MyCalc2();
       c2.add(4,5);
       c2.sub(5, 4);
       Calc c3=new MyCalc3();
       c3.add(4,5);
       c3.sub(5, 4);
       Calc2 c4=new MyCalc1();
       c4.mul(4,5);
       c4.div(5, 4);
       Calc2 c5=new MyCalc2();
       Calc2 c6=new MyCalc3();
    }
}
