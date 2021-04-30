package odevHafta3;

public class Student extends User {
	private String attendedCourses;
	private String Country;
	private String City;
	private String streetAdress;
	private int zipCode;
	
	public Student() {
		
	}
	
	public Student(String attendedCourses, String country, String city, String streetAdress, int zipCode) {
		super();
		this.attendedCourses = attendedCourses;
		this.Country = country;
		this.City = city;
		this.streetAdress = streetAdress;
		this.zipCode = zipCode;
	}

	public String getAttendedCourses() {
		return attendedCourses;
	}
	public void setAttendedCourses(String attendedCourses) {
		this.attendedCourses = attendedCourses;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getStreetAdress() {
		return streetAdress;
	}
	public void setStreetAdress(String streetAdress) {
		this.streetAdress = streetAdress;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	

	

}
