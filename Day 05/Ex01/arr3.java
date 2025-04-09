import java.util.Scanner;
class arr3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		
		System.out.println("enter 5 integer numbers");
		int sum=0;
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
	    }
		System.out.println("**********************");
		
		for(int i=0;i<5;i++)
		{
	    System.out.println(arr[i]);
	    }
		System.out.println("The summation of this numbers: "+sum);
}
}	