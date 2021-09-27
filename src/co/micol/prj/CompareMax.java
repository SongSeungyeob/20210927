package co.micol.prj;

public class CompareMax {
	
	private int n;
	private int m;
	
	public CompareMax(int n, int m) { // Constructor
		this.n = n;
		this.m = m;
	}
	
	public int getMax() {
		int max = 0;
		if(n > m) {
			max = n;
		} else if(n < m) {
			max = m;
		} 
		return max;
	}
	
	public int getMin() {
		int min = 0;
		if(n < m) {
			min = n;
		} else if(n > m) {
			min = m;
		}
		return min;
	}
}
