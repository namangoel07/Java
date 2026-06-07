package lectureeight.lectureeightpointtwo;
interface Beta
{
//empty interface is called as marker interface 
}
interface Demo3{
    void disp();
    float pi=3.14f;// we can have a variable inside an interface
    // by default in interface variables have public static final pi=3.14f;
}
interface Demo4 {
    // Demo2{

    // }
 void disp();
} 
class Alpha implements Demo3,Demo4{
    public void disp(){
        System.out.println("Focus is the key");
    }
   
}
public class interface4 {
    public static void main(String[] args) {
        // Demo3 d=new Alpha();
        // d.disp();
       // Demo3.pi=4.5f;//The final field Demo1.pi cannot be assigned
       // also pi can be accessed directly by Demo1.pi; so it is assigned static 
      // System.out.println(Demo1.pi);
    }
}
