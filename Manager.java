package survey_system;

import java.util.Scanner;

public class Manager extends Member {
	
	public Manager(String id, String password, String name) {
		super(id, password, name);
	}
	
	public void login() {
		System.out.println("===================================");
		System.out.println("id : " + getId());
		System.out.println("password : ****");
		System.out.println("관리자 " + getName() + "님 로그인 성공");
		System.out.println("===================================");
	}
	
	Scanner sc = new Scanner(System.in);
	void examineReview() {
		System.out.println("--리뷰 관리하기--");
		int option = 0;
		while(true) {
			System.out.println("1.우수리뷰 선정  2.블라인드 처리할 리뷰 검토  3.리뷰관리 종료");
			option = sc.nextInt();
			if(option==1) System.out.println("해당 리뷰를 우수리뷰로 선정합니다.(리뷰 작성자에게 50p 지급)\n");
			else if(option==2) System.out.println("해당 리뷰를 블라인드 처리합니다.\n");
			else { System.out.println("--리뷰관리 종료--\n"); break; }
		}
	}
	void examineUserReport() {
		System.out.println("--이용 신고 검토하기--");
		int option = 0;
		while(true) {
			System.out.println("1.신고 당한 사용자의 잘못이 있음  2.잘못이 없음  3.이용 신고 검토 종료");
			option = sc.nextInt();
			if(option==1) System.out.println("사용자를 정지시킵니다.\n");
			else if(option==2) System.out.println("신고 넘어가기\n");
			else {System.out.println("--검토 완료--\n"); break; }
		}
	}
}
