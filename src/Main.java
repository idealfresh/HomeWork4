import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// �������� ��������, ����� ����� ������ ����� (0-9) � � ������� � ���� (�� ����. ����)

		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
        
        switch (number) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("tree");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println(" five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("eith");
			break;
		case 9:
			System.out.println("nine");
			break;

		}

	}
}