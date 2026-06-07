package lecturesix.lecturesixpointseven;
class Student{
 int id;
 String name;
 String city;
 //int count;//sb ke liye alg(separate) count hoga isliye 1 1 1 output hai
 static int count;// sbke liye common hai isliye total objects bta dega(as ek baar hi execute hota h)
 {
    count++;//sb constructor ke liye likh dega khud har jgh nhi likhna pdega separate
 }
 Student(){
    System.out.println("Zero param cons");
    //count++;
 }
 Student(int id,String name,String city){
    this.id=id;
    this.name=name;
    this.city=city;
    //count++;
 }// constructor cannot be static
}
public class static3 {
    public static void main(String[] args) {
        Student st=new Student(1,"rohan","bengaluru");
        System.out.println("no. of objects created :"+st.count);
        Student st1= new Student(2,"rohit","mumbai");
         System.out.println("no. of objects created :"+st1.count);
        Student st2=new Student(3,"ramesh","chennai");
         System.out.println("no. of objects created :"+st2.count);
    }
}
