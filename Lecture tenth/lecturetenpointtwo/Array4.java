class Alien{
    int id;
    String name;
    String course;
}
public class Array4 {
    public static void main(String[] args) {
        Alien[] ar=new Alien[3];
        ar[0]=new Alien();
        ar[1]=new Alien();
        ar[2]=new Alien();
        // for(int i=0;i<arr.length;i++){
        //     ar[i]=new Alien();
        // }
        ar[0].id=1;
        ar[0].name="YashRaj";
        ar[0].course="Java";
        System.out.println(ar[0].id);
        System.out.println(ar[0].name);
        System.out.println(ar[0].course);
        System.out.println(ar[0]);//gives adress of ar at 0
    }
}
