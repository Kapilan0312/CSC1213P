class ex03{
	public static void main(String[] args){
	int arrr[][]={{98,12,34,32},{45,54,67,45},{13,14,89,87}};
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				sum=sum+arrr[i][j];
			}
			System.out.println("No "i "Student total marks: "+sum);
		}
	}
}
	