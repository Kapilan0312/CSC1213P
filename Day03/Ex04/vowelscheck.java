import java.util.Scanner;
class vowelscheck{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a letter :");
		char letter=sc.next().charAt(0);
		
		switch(letter){
			case 'a' :
			case 'A' :System.out.println("this is vowel letter");
			break;
			
			case 'e' :
			case 'E' :System.out.println("this is vowel letter");
			break;
			
			case 'i' :
			case 'I' :System.out.println("this is vowel letter");
			break;
			
			case 'o' :
			case 'O' :System.out.println("this is vowel letter");
			break;
			
			case 'u' :
			case 'U' :System.out.println("this is vowel letter");
			break;
			
			default :System.out.println("this is not vowel letter");
		}
	}
}
			
		