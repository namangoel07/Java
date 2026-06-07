package lecturesix.lecturesixpointnine;
class Parent {//extends Child{//it is called as cyclic inheritance which is not allowed 
void disp(){
    System.out.println("parent class method");
}
}
class Child extends Parent{

}
public class Inheritance4 {
    public static void main(String[] args) {
        Child c=new Child();
        c.disp();
    }
}
