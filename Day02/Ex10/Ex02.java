import java.util.Scanner;

class Ex02{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input the value : ");
		boolean val01 = s.nextBoolean();
		System.out.println("Output :"+val01);
		
		System.out.println("Input the value : ");
		byte val02 = s.nextByte();
		System.out.println("Output :"+val02);
		
		System.out.println("Input the value : ");
		short val03 = s.nextShort();
		System.out.println("Output :"+val03);
		
		System.out.println("Input the value : ");
		int val04 = s.nextInt();
		System.out.println("Output :"+val04);
		
		System.out.println("Input the value : ");
		float val05 = s.nextFloat();
		System.out.println("Output :"+val05);
		
		System.out.println("Input the value : ");
		double val06 = s.nextDouble();
		System.out.println("Output :"+val06);
		
		System.out.println("Input the value : ");
		long val07 = s.nextLong();
		System.out.println("Output :"+val07);
	}
}