import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        int[][] marks=new int[3][];
        marks[0]=new int[3];
        marks[1]=new int[2];
        marks[2]=new int[1];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.println("Kindly enter marks of class"+i+"Student"+j);
                marks[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
    }
}
