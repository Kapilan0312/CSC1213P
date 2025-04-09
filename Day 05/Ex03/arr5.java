import java.util.Scanner;
class arr5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[5];
		
		System.out.println("enter the 10 integer values");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
	  int largest=arr[0];
	  int smallest=arr[0];
	  for(int i=0;i<5;i++)
	  {
		  if(arr[i]>largest)
		  {
			  largest=arr[i];
			 		  }
		  if(arr[i]<smallest)
		  {
			 smallest=arr[i];
		  }
	  }
	  System.out.println("The largest value is:"+largest);
	  System.out.println("The smallest value is:"+smallest);
}
}