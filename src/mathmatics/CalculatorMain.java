package mathmatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorMain {

	public static void main(String[] args) {
		double x = 0;
		Calculator calcTest = null;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
			String s;
			while(!(s = reader.readLine()).equals("exit")) { //最初の数値を入力
				Result r = CalcStringAnalytics.firstInput(s);
				if (r != null) {
					x = r.getOperand();
					calcTest = new Calculator(x);
					break;
				} else {
					System.out.println("正しく入力してください");
				}
			}
			
			while(!(s = reader.readLine()).equals("exit")) {
				Result r = CalcStringAnalytics.parseInput(s);
				if (r != null) {
					x = r.getOperand();
					double oldAns = calcTest.getAns();
					
					switch (r.getOperator()) {
					case "+":
						calcTest.add(x);
						System.out.printf("%.3f + %.3f = %.3f\n",oldAns,x,calcTest.getAns());
						break;
					case "-":
						calcTest.subtract(x);
						System.out.printf("%.3f - %.3f = %.3f\n",oldAns,x,calcTest.getAns());
						break;
					case "*":
						calcTest.multiplication(x);
						System.out.printf("%.3f * %.3f = %.3f\n",oldAns,x,calcTest.getAns());
						break;
					case "/":
						calcTest.division(x);
						System.out.printf("%.3f / %.3f = %.3f\n",oldAns,x,calcTest.getAns());
						break;
					}
				} 
				else {
					System.out.println("正しく入力してください");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
