package palindromSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number;
		System.out.print("Palindrom olup olmad���n� kontrol etmek istedi�iniz say�y� giriniz: ");
		isPalindrome(number=scanner.nextInt());
		if(isPalindrome(number)==true)
			System.out.println(number+" say�s� palindromdur");
		else System.out.println(number+" say�s� palindrom de�ildir");
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
