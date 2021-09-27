package co.micol.prj.member;

public class Member {
	private String id;
	private String password;
	private String name;
	private String address;
	
	public Member(String id, String password, String name, String address) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
	}
	
	private void memberPrint() {
		System.out.print("아이디 : " + id + " ");
		System.out.print("패스워드 : " + password + " ");
		System.out.print("이 름 : " + name + " ");
		System.out.println("주 소 : " + address);
	}
	
	public void run() {
		memberPrint();
	}
}
