public class array3 {
    public static void main(String[] args) {
        // int[][][] student=new int[2][][];
        // student[0]=new int[2][1];
        // student[1]=new int[1][1];
        //----------------------------
        Object[] ar=new Object[3];
        ar[0]=23;
        ar[1]="Alien";
        ar[2]=99.1;
        System.out.println(ar[2]);//working as everything is object in java
        //Because Object is the parent class of every class in Java.
    }
}
