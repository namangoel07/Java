import java.util.Arrays;

class Telusko{
    String courseName;
    int courseCost;
    String City;
}
public class Array6 {
    public static void main(String[] args) {
        Telusko t=new Telusko();
        System.out.println(t);//gets address
        System.out.println(t.getClass().getName());
        System.out.println("******************");
        int a[]=new int[3];
        System.out.println(a);//gets address
        System.out.println(a.getClass().getName());
        System.out.println("*********************");
        int ar[][]=new int[2][2];
        System.out.println(ar);
        System.out.println(ar.getClass().getName());
        //-----------------------------------
        int arr[]={9,2,3};
        Arrays.sort(arr);
        for(int elem:arr){
            System.out.print(elem+" ");
        }
    }
}
