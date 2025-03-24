import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Lab11 {
	public static int balance = 3000;
	
	//------------Task2----------// //WithdrawException
	public static void withDraw(int amount) throws Exception { 
		//---Put your code here---//
	   
		if (amount < 0) {
            throw new Exception("You must enter amount > 0");
        }
        if (amount > balance) {
            throw new Exception("Insufficient amount to withdraw");
        }
		
		//-------------------------//
	    balance -= amount;
	    System.out.println("withdraw: "+amount);
	    System.out.println("balance: "+balance);
	    
	}
	
	public static void main(String[] args) {
		
		//--------------Task1--------------//
		//task1.1
//		try {
//			System.out.println(3/0);
//		} catch (ArithmeticException e) {
//            System.out.println("Cannot divide by 0");
//        }
//		
//		
//		//task1.2
//		int x;
//		Scanner reader = new Scanner(System.in);
//        try {
//        System.out.print("Enter number: ");
//        x = reader.nextInt();   //possibly run-time error 
//        System.out.println("Your number is " + x);
//    } catch(InputMismatchException e) {
//        System.out.println("Exception occurred.");
//        reader.next();
//    }
//		//task1.3
//		String[] list = {"$123", "456"}; 
//        try {
//            double amount = Double.parseDouble(list[2]); // This will cause an exception
//            System.out.println("The amount at index 2: " + amount);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Index out of bounds.");
//        } catch (NumberFormatException e) {
//            System.out.println("Number format exception.");
//        } finally {
//            System.out.println("Program Ended");
//        }
//		
//		
		//--------------Task2--------------//
		
        try {
			int balance = 3000;
			Scanner reader2 = new Scanner(System.in);
	        System.out.print("Enter amount: ");
	        int bal = reader2.nextInt(); 
	        withDraw(bal);
	        //WithdrawException
		}catch (Exception e){
			e.printStackTrace();
			
		}
	}

}
//class WithdrawException extends Exception {
//    public WithdrawException(String message) {
//        super(message);
//    }
//}