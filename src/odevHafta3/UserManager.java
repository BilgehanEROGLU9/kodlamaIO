package odevHafta3;

public class UserManager {
	public void logIn(User user) {
		System.out.println("Hoþgeldin "+user.getFirstName()+".");
	}
	public void changePass(User user) {
		System.out.println("Yeni þifre : "+user.getPassword());
	}


}
