package lecturesix.lecturesixpointsix;
class Demo{
     int num1,num2;
    Demo(){
        super();
        // it is written or not it is always the first statement it will not be there only in one case if we write this();
        System.out.println("zero param constructor");
    }
    Demo(int num1,int num2){
        this(num1);
        this.num1=num1;
        this.num2=num2;
        System.out.println("2 param constructor");
    }
    Demo(int num1){
        this();// it is not deafault we have to write . super() will be not here
        this.num1=num1;
        num2=44;
        System.out.println("1 param constructor");
    }
    void display(){
        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);
    }
}
public class Const1 {
    public static void main(String[] args) {
     //Demo demo1=new Demo(4);
     demo1.display();// andar hai na class kai isliye accessible h value
     System.out.println("****************************");
     //Demo demo2=new Demo(4,5);
     //demo2.display();
    }
}