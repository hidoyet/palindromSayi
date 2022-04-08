package palindromSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number;
		System.out.print("Palindrom olup olmadığını kontrol etmek istediğiniz sayıyı giriniz: ");
		isPalindrome(number=scanner.nextInt());
		if(isPalindrome(number)==true)
			System.out.println(number+" sayısı palindromdur");
		else System.out.println(number+" sayısı palindrom değildir");
	}
	static boolean isPalindrome(int number) {
		int tempNumber=number,lastNumber,reverseNumber=0;
		while(tempNumber!=0) {
			lastNumber=tempNumber%10;
			reverseNumber=(reverseNumber*10)+lastNumber;
			tempNumber/=10;
		}
		if(reverseNumber==number)
			return true;
		else 
			return false;
	}

}
