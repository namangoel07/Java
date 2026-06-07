class A{
    void show(){
        System.out.println("in A show");
    }
    void display(){
        System.out.println("in display");
    }

}
class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}
public class Lambdaexpression {
    public static void main(String[] args) {
        A obj =new A(){// Anonymous inner class
        public void show(){//drawbag is we can only use it once or we have to rewrite this
            System.out.println("in new show");
        }
        public void display(){
            System.out.println("in new display");
        }
        public void getData(){
            System.out.println("in new data");//cannot access as it is not inside A
        }
    };//.getData() compile time error
    obj.show();
    obj.display();
    new B().show();//anonymous object
       new A(){
          public void show(){//drawbag is we can only use it once or we have to rewrite this
            System.out.println("in new show");
        }
        public void display(){
            System.out.println("in new display");
        }
        public void getData(){
            System.out.println("in new data");//cannot access as it is not inside A
        }
       }.getData();//now can access
    }
}
