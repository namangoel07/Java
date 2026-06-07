package lecturesix.lecturesixpointtwelve;
class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void running(){
        System.out.println("Animal is running");
    }
}
class Tiger extends Animal{
     public void eat(){
        System.out.println("Tiger is eating");
    }
    public void running(){
        System.out.println("Tiger is running");
    }
}
class Monkey extends Animal{
     public void eat(){
        System.out.println("Monkey is eating");
    }
    public void running(){
        System.out.println("Monkey is running");
    }
}
class Forest{
    public void permit(Animal animal){
        animal.eat();
        animal.running();
    }
}
public class Polymorphism4 {
    public static void main(String[] args) {
        Tiger t=new Tiger();
        Monkey m=new Monkey();
        Forest f=new Forest();
        f.permit(m);
        f.permit(t);
    }
}
