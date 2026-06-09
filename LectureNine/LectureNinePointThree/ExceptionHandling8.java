public class ExceptionHandling8 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main method started");
        Thread.sleep(5000 );//all exception whose possibility are checked by compiler are called as checked exception
        //exception occur at runtime only
        System.out.println("Main method is completed");
        
    }
}
