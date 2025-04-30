class ex05{
	public static void main(String[] args){
	int arrr[][]={{54,2,45},{67,54,87},{76,46,89},{9,10,65}};
	int n=0;
		for(int i=0;i<4;i++)
		{
	   int Max=arrr[i][0];
	    for(int j=0;j<3;j++)
			{
				
				if(Max<arrr[i][j])
				{
					Max=arrr[i][j];
				}
			}
			n=i+1;
			System.out.println("The Maximum of "+n+" row: "+Max);
		}
	}
}