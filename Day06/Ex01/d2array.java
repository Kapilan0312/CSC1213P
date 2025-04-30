class d2array{
	public static void main(String[] args){
		int arr[][]=new int[2][2];
		arr[0][0]=75;
		arr[0][1]=90;
		arr[1][0]=85;
		arr[1][1]=100;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}