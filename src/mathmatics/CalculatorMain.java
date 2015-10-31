package mathmatics;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calTest = new Calculator();
		
		int num1, num2, calcType;
		System.out.print("計算の種類は何ですか？");
		calcType = sc.nextInt();
		
		System.out.print("X : ");
		num1 = sc.nextInt();
		System.out.print("Y : ");
		num2 = sc.nextInt();
		
		switch (calcType) {
		case 1:
			calTest.add(num1, num2);
			break;

		default:
			calTest.subtract(num1, num2);
			break;
		}
	}
}
