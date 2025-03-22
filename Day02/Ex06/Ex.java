import java.util.Scanner;

class Ex{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Input the side length value : ");
		double l=s.nextDouble();
		System.out.printf("Square :%.2f\n",l*l);
		System.out.printf("Cube :%.2f\n",l*l*l);
		System.out.printf("Fourth power :%.2f\n",Math.pow(l,4));
	}
}