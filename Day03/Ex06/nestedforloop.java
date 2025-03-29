import java.util.Scanner;
class nestedforloop{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for counter 01  :");
		int counter01=sc.nextInt();
		
		System.out.println("Enter the value for counter 02  :");
		int counter02=sc.nextInt();
		
		for(int i=0;i<counter01;i++)
		{
			System.out.println("Value For i :"+i);
	       for(int j=0;j<counter02;j++)
		   {
			   System.out.print("Value For j :"+j+" / ");
		   }
		   System.out.println();
		}
	}
}