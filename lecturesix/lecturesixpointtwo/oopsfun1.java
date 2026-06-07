package lecturesix.lecturesixpointtwo;
class student{
    String name;
    int age;
    int id;
    void studying(){
        System.out.println("Student is studying");
    }
    void playing(){
        System.out.println("Student is playing");
    }// not to save this with student name save this it with oopsfun1
}
public class oopsfun1 {
    public static void main(String[] args) {
    student st=new student();// to create new object in class it is compulsury// it is also known as intanceciation
    st.playing();
    st.studying();
    }
}
