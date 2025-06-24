import java.util.Scanner;   //import the Scanner class

public class ProvaScanner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine(); // read user input
        myObj.close();
        System.out.println("Username is: " +userName);
        //output user input
        
    }
}
