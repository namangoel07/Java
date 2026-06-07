import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] marks=new int[5];
        // marks[0]=90;
        // marks[1]=91;
        // marks[2]=80;
        // marks[3]=89;
        // marks[4]=99;
        // marks[5]=88;
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++){
        
            System.out.println("Kindly enter matks of the student"+i);
            marks[i]=in.nextInt();        
        }
        System.out.println("Marks of student are:");
        for(int i=0;i<5;i++){
            System.out.println(marks[i]);
        }
        




    }
}
