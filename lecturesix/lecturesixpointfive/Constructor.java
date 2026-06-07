package lecturesix.lecturesixpointfive;
class Dog{
    private int cost;
    private String name;
    private String Color;
    Dog(int cost,String name,String Color){// it is constructor and in constructor there is no need to specify int/void etc.// same name as of class name will not create problem
        this.cost=cost;
        this.name=name;
        this.Color=Color;
    }
    Dog(){// now there will be no error as we have created 2nd constructor
        System.out.println("zero param constructor");
        cost=4545;
        name="kutta";
        Color="white";
    }
    //setter and getter
    public int getcost(){
        return cost;
    }
//    public void setcost(int cost){
//       this.cost=cost;
//     }
    public String getname(){
        return name;
    }
    // public void setname(String name){
    //     this.name=name;
    // }
    public String getcolor(){
        return Color;
    }
    // public void setcolor(String Color){
    //     this.Color=Color;
    // }
    
   
   
    
}
public class Constructor {
    public static void main(String[] args) {
        Dog d1=new Dog(4,"Sheru","white");//setters bina define kre hogyi set value
    System.out.println(d1.getcost());
    
    System.out.println(d1.getcolor());
    System.out.println(d1.getname());
    //d1.setcost(300); // setter is now use to update values
    //when to use constructor and when to use setter& getter will be taught later
    Dog d2=new Dog();// without new constructor it will give error
    //it will not give error now as new constructor is also created
   System.out.println(d2.getcost());  
    System.out.println(d2.getname());
   System.out.println( d2.getcolor());

    //it is giving error as 1 Constructor is there and java will not add default constructor
   //as when Dog constructor is not there then java create a default constructor if and only if java programmer is not specified any constructor
   //that default constructor is like Dog() which is 0 parameterise only
   // if programmer has made a constructor parameterise of 0 parameterise java will not create default constructor
    }
}
