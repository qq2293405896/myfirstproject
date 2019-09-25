impot java.util.Scanner;

public class Grade{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input （0-100）");
		int grade = scan.nextlntt();
		Grade /=10;
		switch(grade){
			case 10:
			case 9:
			System.out.println("A");
			break;
			case 8:
			System.out.println("B");
			break;
			case 7:
			System.out.println("C");
			case 6:
			System.out.println("D");
			break;
			default:
			System.out.println("F");
			break;
		}
	}
}