import java.util.*;
public class VowelsOrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Alphabet:");

		char ch = sc.next().charAt(0);
		

		if(ch == 'a' || ch== 'A')
			System.out.println("It is a vowel" );
		else if (ch == 'e' || ch == 'E')
			System.out.println("It is a vowel" );
		else if (ch == 'i' || ch == 'I')
			System.out.println("It is a vowel" );
		else if (ch == 'o' || ch == 'O')
			System.out.println("It is a vowel" );
		else if (ch == 'u' || ch == 'U')
			System.out.println("It is a vowel" );
		else 
			System.out.println("It is a consonant");
		
	}

}