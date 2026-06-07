abstract class P{
    abstract void show();
}
// class R extends P{
//     public void show(){
//         System.out.println("in Show");
//     }
// }
public class Lambda2 {
    public static void main(String[] args) {
    P obj=new P(){
        public void show(){
            System.out.println("show");
        }
    };
        obj.show();
    }
}
