package lecturesix.lecturesixpointfour;
class employee{
    private int id;// according to encapsulation these must be private
    private String name;//this also
    //setter
    void setid(int i){
        id=i;
    }
    void setName(String n) {
        name = n;
    }
    //getter
    int getId(){
        return id;
    }
    String getname(){
        return name;
    }
}
public class employee6 {
    public static void main(String[] args) {
         employee e=new employee();
         e.setid(4);
         e.setName("Naman");
         System.out.println(e.getId());
         System.out.println(e.getname());
    }
}
