package odevHafta3;

public class InstructorManager {
	public void viewerCount(Instructor instructor) {
		System.out.println("Kursunuza "+instructor.getStudentCount()+" kiþi katýldý.");
	}
	public void createTitle(Instructor instructor) {
		System.out.println("Yeni baþlýk oluþturuldu.");
	}

}
