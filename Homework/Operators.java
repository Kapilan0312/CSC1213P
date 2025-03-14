class Operators{
    public static void main(String args[]){
	    //01.unaryOperator
        int a=10;
        int b=~a;
        System.out.println(b+"\n");
    
		//02.logicalOperators
		boolean q=true,k=false;
		boolean c=(q||k);
		System.out.println(c+"\n");
		
		//03.relationalOperator
		int d=20,e=10;
		boolean f=(d<e);
		System.out.println(f+"\n");
		
		//04.asignmentOperator
		long g=200L;//Simple assignment
		g+=50;//Compound assignment
		System.out.println(g+"\n");
		
		//05.ternaryOperator
		short i=76,j=102,max;
		max=(i>j)?i:j;
		System.out.println(max);
	}
}