import java.util.Scanner;
class OtherDetails{
	public static void main(String[] args){
		String Name;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Your Name :");
		Name = sc.nextLine();
		
		System.out.print("Enter Your Age :");
		int Age = sc.nextInt();
		
		System.out.println("Enter Your Reg no :");
		String Regno = sc.next();
		
		System.out.println("Enter Your Sex :");
		char Sex = sc.next().charAt(0);
		
		System.out.println("Enter Your Mobile Number :");
		long MobileNo = sc.nextLong();
		
		System.out.println("Enter Your GPA :");
		double GPA = sc.nextDouble();
		
		System.out.println("Your Full Name :" +Name+"\n"+"Your Registration Number is :"+Regno+"\n"+" Your Age :"+Age+"\n"+"Sex(M/F) :"+Sex+"\n"+"Your Mobile Number :"+MobileNo+"\n"+"Your GPA : "+GPA);
	}
}