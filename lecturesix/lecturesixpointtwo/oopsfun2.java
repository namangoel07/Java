package lecturesix.lecturesixpointtwo;
class Calc{
    int num1;
    int num2;
    int o;
    void add(){
        num1=10;
        num2=20;
        int res=num1+num2;
        System.out.println(res);// here num1 and num2 are called as instance varialble and res is called as local variable
    }
    void sub(){
        //int n;
        int res=num1-num2;
        System.out.println(res);
        //System.out.println(n);// it will give eroor as it is local variable
        System.out.println(o);
    }
}

public class oopsfun2 {
    public static void main(String[] args) {
        Calc c=new Calc();
        c.add();
    
    for(int i=0;i<4;i++){
        System.out.println(i);
    }
    //i=20;//error local variable
}
}
