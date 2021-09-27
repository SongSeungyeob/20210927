package co.micol.prj;

public class Calculator {		// Class ���� or Class�� ������.
	private int firstNum;
	private int secondNum;
	
	/*
	 *  Override = ���� �̸��� Method�� return Type�� Ʋ���ų�, ���� ������ Type or ������ 
	 *                   Ʋ���� �ؼ� �����ϴ� ��.
	 */
	public Calculator() {					// �⺻ ������
		
	}
	
	public Calculator(int n, int m) {	// �����ڸ� ���� �� ���� ���
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







