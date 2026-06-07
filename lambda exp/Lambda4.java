@FunctionalInterface
interface Person{
    int add(int x,int y);
}
// class PersonImpl implements Person{
//     public int add(int x,int y){
//         return x+y;
//     }
//}
public class Lambda4 {
    public static void main(String[] args) {
        Person p=(x,y)->x+y;
        System.out.println(p.add(3, 1));
        // int result=p.add(3, 1);
        // System.out.println(result);
    }
}
