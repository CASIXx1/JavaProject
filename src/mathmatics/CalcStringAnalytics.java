package mathmatics;

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
	
}
