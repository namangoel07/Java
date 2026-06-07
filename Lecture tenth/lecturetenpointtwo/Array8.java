class Telusko{
    private String courseName;
    private int courseCost;
    private String city;
    public void setcourseName(String courseName){
        this.courseName=courseName;
    }
    public void setcourseCost(int courseCost){
        this.courseCost=courseCost;
    }
    public void setcity(String city){
        this.city=city;
    }
    public String getcourseName(){
         return courseName;
    }
    public int getcourseCost(){
         return courseCost;
    }
    public String getcity(){
         return city;
    }
   public Telusko(String courseName,int courseCost,String city){
        super();
        this.courseName=courseName;
        this.courseCost=courseCost;
        this.city=city;
    }
    public Telusko(){
        super();
    }
    @Override 
    
    public String toString(){//it is overwriting data as actually toString is having address of telukso but by overriding it we can access the output
        return "Telusko [courseName="+courseName+", courseCost="+courseCost+", city="+city+"]";
    }
    //toString() is simply a method whose job is: Convert an object into a String representation.

}
public class Array8 {
    public static void main(String[] args) {
        Telusko t=new Telusko("SB", 3000, "Pune");
        // System.out.println(t.getcourseName());
        // System.out.println(t.getcourseCost());
        // System.out.println(t.getcity());
        System.out.println(t);//without toString it is giving adress of telusko
    }
}
