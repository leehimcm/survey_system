package survey_system;

public class SurveySite {

	static MainProcessor mainprocessor = new MainProcessor();
	static DB db = new DB();
	
	public static void main(String[] args) {
		
		User u1 = new User("lee","aabbcc","이혜인","이화여대 컴퓨터공학","010-5324-7324",0);
		User u2 = new User("dain","qwer","민다인","이화여대 컴퓨터공학","010-1111-1111",0);
		
		Manager m1 = new Manager("hpark","123","박희애");
		
		// 이혜인 회원
		u1.login();
		u1.makeProfile();
		u1.manageProfile();
		u1.searchSurvey();
		u1.participateSurvey();
		u1.writeReview();
		
		// 민다인 회원
		u2.login();
		u2.makeProfile();
		u2.registerSurvey();
		u2.participateSurvey();
		u2.participateSurvey();
		u2.participateSurvey();
		u2.participateSurvey();
		u2.participateSurvey();
		u2.manageProfile();
		u2.registerSurvey();
		
		
		// 박희애 회원
		m1.login();
		m1.examineReview();
		m1.examineUserReport();
		
		
	}
}
