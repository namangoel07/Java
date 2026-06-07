package lecturesix.lecturesixpointfour;

public class fund4 {
    public static void main(String[] args) {
        System.out.println("main method with string of args[]");// only this will run
        main(44);
        main("nmn",99);// main m bulane ke baad chle
    }
    public static void main(int arg) {
        System.out.println("main method with int of args[]");
    }
    public static void main(String name, int age) {
        System.out.println("main method with string and int of args[]");
    }
}
