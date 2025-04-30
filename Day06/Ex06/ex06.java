import java.util.Scanner;
class ex06{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arrr[][]=new int[4][3];
		int sum=0;
		for(int i=0;i<4;i++)
		{
	       for(int j=0;j<3;j++)
			{
		    arrr[i][j]=sc.nextInt();
			sum=sum+arrr[i][j];
			}
		}
		System.out.println("The sum of 2Darray: "+sum);
		
		for(int i=0;i<4;i++)
		{
	       for(int j=0;j<3;j++)
			{
		    arrr[i][j]=sc.nextInt();
			sum=sum+arrr[i][j];
			}
		}
	}
}