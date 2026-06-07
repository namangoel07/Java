package lectureeight.lectureeightpointtwo;
interface Calc{
    void add(int a,int b);//by deafult public abstract is written whether we write or not
    public abstract void sub(int a,int b);// 2 abstract methods
}
class MyCalc1 implements Calc{//implements is same as extends which is used in case of interface
    public void add(int a,int b){
       
        int res=a+b;
        System.out.println(res);
    }
    public void sub(int a,int b){
     int res=a-b;
     System.out.println(res);
    }
}
class MyCalc2 implements Calc{
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
}
class MyCalc3 implements Calc{
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
}
class Algebra{
    public void cal(Calc c,int a,int b){
        c.add(a,b);
        c.sub(a,b);
    }
}
public class interface1 {
public static void main(String[] args){
  //Calc calc1 = new MyCalc1();
//   calc1.add(4,44);
//   calc1.sub(44,4);
  //Calc calc2=new MyCalc2();
//   calc2.add(4,5);
//   calc2.sub(5,4);
MyCalc1 calc1=new MyCalc1();
MyCalc2 calc2=new MyCalc2();
MyCalc3 calc3=new MyCalc3();
Algebra a=new Algebra();
a.cal(calc1,10,20);
a.cal(calc2,5,4);
a.cal(calc3,6,3);
//Calc c=new Calc(); // we cannot create object of interface  
  

}
}
