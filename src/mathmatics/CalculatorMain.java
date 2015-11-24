package mathmatics;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calTest = new Calculator();
		
		double num1, num2;
		int operatorLocate;
		String calcString; //計算式
		System.out.println("計算式を入力して下さい");
		calcString = sc.nextLine();
		CalcStringAnalytics csa = new CalcStringAnalytics(calcString);
		operatorLocate = csa.operatorAnalitics();
		
		num1 = Double.parseDouble(calcString.substring(0, operatorLocate).trim());
		num2 = Double.parseDouble(calcString.substring(operatorLocate + 1).trim());
		
		System.out.println("X : " + num1);
		System.out.println("Y : " + num2);
		
		switch (csa.getOperatorType()) {
		case 1:
			calTest.add(num1, num2);
			break;
		case 2:
			calTest.subtract(num1, num2);
			break;
		case 3:
			calTest.multiplication(num1, num2);
			break;
		case 4:
			calTest.division(num1, num2);
			break;

		default:
			System.out.println("1~4を入力して下さい");
			break;
		}
	}
}
