package co.micol.prj.fortest;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test test = new Test();
		System.out.print("ù ��° ���� �Է��ϼ��� : ");
		test.setN(sc.nextInt());
		System.out.print("�� ��° ���� �Է��ϼ��� : ");
		test.setM(sc.nextInt());
		test.run();
	}
}
