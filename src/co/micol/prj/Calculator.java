package co.micol.prj;

public class Calculator {		// Class 정의 or Class를 만들자.
	private int firstNum;
	private int secondNum;
	
	/*
	 *  Override = 같은 이름의 Method를 return Type이 틀리거나, 전달 인자의 Type or 갯수를 
	 *                   틀리게 해서 구현하는 것.
	 */
	public Calculator() {					// 기본 생성자
		
	}
	
	public Calculator(int n, int m) {	// 생성자를 통한 값 전달 방법
		this.firstNum = n;
		this.secondNum = m;
	}
	
	public Calculator(int n) {
		this.firstNum = n;
	}
	
	public void setFirstNum(int n) {
		this.firstNum = n;
	}
	
	public int getFirstNum() {
		return firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public int sum() {
		return firstNum + secondNum;
	}
	
	public int sub() {
		return firstNum - secondNum;
	}
	
}







