package lecturesix.lecturesixpointfive;
class Learner{
   private int id;
   private String name;
   private String city;
   //setter
   public void setid(int id){
    this.id=id;// we have given instance and local variable different so that confusion is not there in jvm it is called shadowing
    // to use same variable name we have to use this keyword to resolve shadowing
   }
   public void setname(String name){//we should use public also so that we can call the method anywhere
    this.name=name;
   }
   public void setcity(String city){
    this.city=city;// this is used to avoid shadowing used inside setter so toh differentiate between instance and local variable


   }
   //getter
   public int getid(){
    return id;
   }
   public String getname(){
    return name;
   }
   public String getcity(){
    return city;
   }
}
public class Encapsulation{
    public static void main(String[] args) {
        Learner l=new Learner();
        l.setid(1);
        l.setname("YashRaj");
        l.setcity("null");
        System.out.println("Id is:"+l.getid());
        System.out.println("Name is:"+l.getname());
        System.out.println("city is:"+l.getcity());
        System.out.println("**********************************");
         Learner l2=new Learner();
        l2.setid(2);
        l2.setname("Naman");
        l2.setcity("karachi");
        System.out.println("Id is:"+l2.getid());
        System.out.println("Name is:"+l2.getname());
        System.out.println("city is:"+l2.getcity());

    }
}
