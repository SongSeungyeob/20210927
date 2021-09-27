package co.micol.prj.fortest;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test test = new Test();
		System.out.print("첫 번째 수를 입력하세요 : ");
		test.setN(sc.nextInt());
		System.out.print("두 번째 수를 입력하세요 : ");
		test.setM(sc.nextInt());
		test.run();
	}
}
