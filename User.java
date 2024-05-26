package survey_system;

import java.util.Scanner;

public class User extends Member {
	
	private String department;
	private String phoneNumber;
	private String organization = "(없음)";
	private int point;
	
	public User(String id, String password, String name, String department, String phoneNumber, int point) {
		super(id, password, name);
		this.department = department;
		this.phoneNumber = phoneNumber;
		this.point = point;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
	public void login() {
		System.out.println("===================================");
		System.out.println("id : " + getId());
		System.out.println("password : ****");
		System.out.println("사용자 " + getName() + "님 로그인 성공"); point+=10;
		System.out.println("로그인 포인트 적립 (+10p)"); 
		System.out.println("===================================");
	}

	void registerSurvey() {
		System.out.println("--설문조사 등록하기--");
		if(point >= 500) {
			point -= 500;
			System.out.println("설문대상/기한/보상 선택");
			System.out.println("--등록완료 (-500p)--");
			System.out.println();
		}
		else System.out.println("*포인트 부족으로 등록 실패\n"); 
		
	}
	void searchSurvey() {
		System.out.println("--설문조사 검색하기--");
		System.out.println("검색키워드/주최기관/보상/지급포인트(으)로 필터링");
		System.out.println();
	}
	void participateSurvey() {
		System.out.println("--설문조사 참여하기--");
		System.out.println("--참여완료--"); point+=100;
		System.out.println("100p가 적립되었습니다"); 
		System.out.println();
	}
	
	Scanner sc = new Scanner(System.in);
	void writeReview() {
		System.out.println("--리뷰 작성--");
		System.out.print("내용을 입력하세요 : ");
		sc.nextLine();
		System.out.println("--작성 완료--");
		System.out.println();
	}
	void makeProfile() {
		int option = 0;
		String org = "";
		System.out.println("--프로필 만들기--");
		System.out.println("1.시행자 프로필  2.참여자 프로필  3.취소");
		option = sc.nextInt();
		sc.nextLine();
		if(option==1) {
			System.out.print("기관명 입력하기 : ");
			org = sc.nextLine();
			setOrganization(org);
			System.out.println("--시행자용 프로필 생성 완료--\n");
		}
		else if(option==2) System.out.println("--참여자용 프로필 생성 완료--\n");
		else System.out.println("--프로필 만들기 취소--\n");
	}
	void manageProfile() {
		System.out.println("--내 프로필--");
		System.out.println("<참여자>");
		System.out.println("이름 : " + getName());
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("소속 : " + department);
		System.out.println("포인트 : " + point);
		System.out.println();
		System.out.println("<시행자>");
		System.out.println("기관명 : " + organization);
		System.out.println();
	}
	
}
