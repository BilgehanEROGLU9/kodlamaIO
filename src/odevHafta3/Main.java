package odevHafta3;

public class Main {

	public static void main(String[] args) {
		Student bilgehan = new Student();
		bilgehan.setId(1);
		bilgehan.setFirstName("Bilgehan");
		bilgehan.setLastName("Ero�lu");
		bilgehan.setEmail("bilghnergl@gmail.com");
		bilgehan.setPassword("usr123");
		bilgehan.setAttendedCourses("Java + React");
		bilgehan.setCountry("T�rkiye");
		bilgehan.setCity("Bursa");
		bilgehan.setStreetAdress("K�l�� mh. Kalkan sk. M�zrak apt.");
		bilgehan.setZipCode(16110);
		
		Instructor engin = new Instructor();
		engin.setId(2);
		engin.setFirstName("Engin");
		engin.setLastName("Demiro�");
		engin.setEmail("engindemirog@gmail.com");
		engin.setPassword("yntc123");
		engin.setCourses("1. Kurs : C# + Angular  --  2. Kurs : Java + React");
		engin.setStudentCount(2500);
		engin.setAdminType("Y�ntetici");
		
		System.out.println("-------------------User-------------------");
		UserManager userManager = new UserManager();
		userManager.logIn(bilgehan);
		userManager.changePass(bilgehan);
		
		System.out.println("-------------------Instructor-------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.viewerCount(engin);
		instructorManager.createTitle(engin);
		
		System.out.println("-------------------Student-------------------");
		
		StudenManager studenManager = new StudenManager();
		studenManager.attendCourse(bilgehan);
		studenManager.adressInfo(bilgehan);
		
		

		
		
		
	}

}
