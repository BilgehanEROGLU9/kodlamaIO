package odevHafta3;

public class UserManager {
	public void logIn(User user) {
		System.out.println("Ho�geldin "+user.getFirstName()+".");
	}
	public void changePass(User user) {
		System.out.println("Yeni �ifre : "+user.getPassword());
	}


}
