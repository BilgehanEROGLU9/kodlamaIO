package odevHafta3;

public class StudenManager {

	public void attendCourse(Student student) {
		System.out.println(student.getAttendedCourses()+" kursuna kaydoldunuz.");
		
	}
	public void adressInfo(Student student) {
		System.out.println("Adres bilgileriniz ''"+student.getStreetAdress()+" "+student.getCity()+"/"+student.getCountry()+"''");
	}
}
