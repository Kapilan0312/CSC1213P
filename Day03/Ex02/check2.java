import java.util.Scanner;
class check2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int number1,number2,number3;
		
	    System.out.println("Enter the number1 :");
		number1 =sc.nextInt();
		
		System.out.println("Enter the number2 :");
		number2 =sc.nextInt();
		
		System.out.println("Enter the number3 :");
		number3 =sc.nextInt();
		
		if(number1>number2 && number1>number3)
		{
			System.out.println("Maximum number is"+number1);
		}
		else if(number2>number1 && number2>number3)
		{
			System.out.println("Maximum number is "+number2);
		}
		else
		{
			System.out.println("Maximum number is "+number3);
		}
		
	}
}
		
		