import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     Thread thread = new Thread(new Runnable() {
         @Override
         public void run() {
             for(int i = 0;i < 10_0000_000;i++){
                 System.out.println(i);
                 try {
                     double doubleI = Math.pow(i,i);
                     Thread.sleep((int) doubleI);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
         }
     });
     thread.start();
    }
}