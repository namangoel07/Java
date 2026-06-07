package lecturesix.lecturesixpointsix;

public class ternery3 {
    public static void main(String[] args) {
        int num1=14;
        int num2=4;
        int num3=50;
        // int res=(num1>num2)?num1:num2;
        // System.out.println("Greatest number is:"+res);
        int res=(num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
        System.out.println("Greatest num is:"+res);
    }
}
