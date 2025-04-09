import java.util.Scanner;
class arr4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[10];
		
		System.out.println("enter the 10 integer values");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		
		System.out.println("* The output *");
		for(int i=0;i<10;i++)
		{
		    System.out.println(arr[i]);
		}
		System.out.println("***************************");
		
		String Days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		for(String Day:Days)
	    {
		   System.out.println(Day);
	    }
	}
}
		