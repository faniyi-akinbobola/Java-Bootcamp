import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

       // See detailed instructions on Learn the Part.
       System.out.println("Pick a number to count by: ");
       int count = scan.nextInt();
       System.out.println("Pick a number to counting from: ");
       int start = scan.nextInt();
       System.out.println("Pick a number to count to: ");
       int stop = scan.nextInt();

       for(int i = start; i <= stop; i+=count){
        System.out.print(i + " ");
       }

        scan.close();
    }
}
