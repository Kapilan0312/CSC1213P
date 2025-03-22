import java.util.Scanner;

class Ex{
	public static void main(String args[])
	{
		 Scanner s=new Scanner(System.in);
		 System.out.println("Input a number : ");
		 int val=s.nextInt();
		 
		 if(val%2==0)
			  System.out.println("It is a even number");
		 else
              System.out.println("It is a odd number");			 
	}
}	