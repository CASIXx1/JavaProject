package mathmatics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalcStringAnalytics {
	private String calcString;
	private int operatorType = 0;
	
	public CalcStringAnalytics(String calcString) {
		this.calcString = calcString;
	}
	
	public int operatorAnalitics(){
		int operatorLocate = 0;
		
		if(this.calcString.indexOf("+") > 0){
			operatorLocate = this.calcString.indexOf("+");
			this.operatorType = 1;
		} else if (this.calcString.indexOf("-") > 0) {
			operatorLocate = this.calcString.indexOf("-");
			this.operatorType = 2;
		} else if (this.calcString.indexOf("*") > 0) {
			operatorLocate = this.calcString.indexOf("*");
			this.operatorType = 3;
		} else if (this.calcString.indexOf("/") > 0) {
			operatorLocate = this.calcString.indexOf("/");
			this.operatorType = 4;
		}
		return operatorLocate;
	}

	public int getOperatorType() {
		return operatorType;
	}
	
	public static Result parseInput(String s) {
		Result r = null;
		String pattern = "^\\s*([+*/-])\\s*([+-]?\\d+\\.?\\d*)\\s*$"; //
		Pattern p = Pattern.compile(pattern);
		Matcher m = null;

		m = p.matcher(s);
		if (m.find()) {
			r = new Result();
			r.setOperator(m.group(1));
			r.setOperand(Double.parseDouble(m.group(2)));
		}
		return r;

	}
	
	public static Result firstInput(String s) {
		Result r = null;
		String pattern = "^\\s*([+-]?\\d+\\.?\\d*)\\s*$"; //
		Pattern p = Pattern.compile(pattern);
		Matcher m = null;

		m = p.matcher(s);
		if (m.find()) {
			r = new Result();
			r.setOperand(Double.parseDouble(m.group(1)));
		}
		return r;
	}
	
}
