/**
 * Created by rober on 1/27/2016.
 */
public class MultiThreadDemo {
    public static void main(String args[]){
        new NewThread3("One");
        new NewThread3("Two");
        new NewThread3("Three");
        try{
            //Wait for other threads to end
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
