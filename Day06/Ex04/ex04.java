class ex04{
	public static void main(String[] args){
	int arrr[][]={{98,12,34,32},{45,54,67,45},{13,14,89,87}};
		
		int n=0;
		for(int i=0;i<3;i++)
		{
			int sum=0;
			for(int j=0;j<4;j++)
			{
				sum=sum+arrr[i][j];
			}
			n=i+1;
			System.out.println("No " +n+ " Student total marks: "+sum);
		}
	}
}