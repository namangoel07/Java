package lectureeight.lectureeightpointtwo;
interface Demo1{
    void disp();
}
interface Demo2 extends Demo1{//implements Demo1 {  we cannot implement a interface and dont give its working we can extend it
 void show();
 
}// it is illogical in java 
class Alpha implements Demo2{
    public void disp(){
        System.out.println("Focus is the key");
    }
    public void show(){
        System.out.println("show");
    }
}
public class Interface3 {
    public static void main(String[] args) {
     Demo1 d=new Alpha();
     d.disp();
      Demo2 d1=new Alpha();
     d1.disp();
     d1.show();
    }
}
