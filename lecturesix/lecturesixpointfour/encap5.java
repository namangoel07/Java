package lecturesix.lecturesixpointfour;
class book{
    private int pagenum;//private:-now pagenum is note accessible outside this class
    void setpagenum(int pgno){
        //setter
        if(pgno>0){
         pagenum=pgno;
        }
        else{
            System.out.println("kindly add non zero page number");
        }
     }
     //getter
     int  getPagenum() {
         return pagenum;
     }
    void display(){
        System.out.println("java and inheritance is present in page number:"+pagenum);
    }
}
public class encap5 {
    public static void main(String[] args) {
        book b=new book();
       // b.pagenum=4;
       b.setpagenum(4);// ab negative n lega
        //  System.out.println(b.pagenum);
          b.display();
          System.out.println(b.getPagenum());
    }
}

