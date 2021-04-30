package odevHafta3;

public class Instructor extends User {
	private String Courses;
	private int studentCount;
	private String adminType;
	public Instructor() {
		
	}
	public Instructor(String courses, int studentCount, String adminType) {
		super();
		this.Courses = courses;
		this.studentCount = studentCount;
		this.adminType = adminType;
	}
	public String getCourses() {
		return Courses;
	}
	public void setCourses(String courses) {
		Courses = courses;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	public String getAdminType() {
		return adminType;
	}
	public void setAdminType(String adminType) {
		this.adminType = adminType;
	}
	

}
