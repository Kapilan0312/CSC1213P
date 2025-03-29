import java.util.Scanner;
class forloopEx01{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=sc.nextInt();
		
		for(int i=1;i<=number;i++)
		{
			System.out.print(i+"\t");
		}
	}
}