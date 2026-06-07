package lecturesix.lecturesixpointsix;
class Finishers{
    private int id;
    private String name;
    private String city;
    public Finishers(){
        super();
        System.out.println("zero param constructor");
    }
    public Finishers(int id,String name, String city){
        super();
        this.id=id;
        this.name=name;
        this.city=city;
        System.out.println("param constructor");
    }
    public int getId(){
        return id;
    }
    public void setid(int id){
        this.id=id;
    }
     public String getname(){
        return name;
    }
     public void setname(String name){
        this.name=name;
    }
     public String getcity(){
        return city;
    }
    public void setcity(String city){
        this.city=city;
    }
    
}
public class const2 {
    public static void main(String[] args) {
        Finishers f1=new Finishers();
        f1.setid(1);
        f1.setname("Yash");
        f1.setcity("sre");
        System.out.println(f1.getId());
        System.out.println(f1.getname());
        System.out.println(f1.getcity());
        System.out.println("*************************************");
        Finishers f2=new Finishers(2,"nmn","sre");
        f2.setid(2);
        f2.setcity("bangkok");
        f2.setname("raj");
        System.out.println(f2.getId());
        System.out.println(f2.getname());
        System.out.println(f2.getcity());
    }
    
}
