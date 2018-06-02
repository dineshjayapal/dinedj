public class student {
	static String firstname, lastname;
	static String gender, dept;
	static int id;
	public static String getFirstname() {
		return firstname;
	}
	public static void setFirstname(String firstname) {
		student.firstname = firstname;
	}
	public static String getLastname() {
		return lastname;
	}
	public static void setLastname(String lastname) {
		student.lastname = lastname;
	}
	public static String getGender() {
		return gender;
	}
	public static void setGender(String gender) {
		student.gender = gender;
	}
	public static String getDept() {
		return dept;
	}
	public static void setDept(String dept) {
		student.dept = dept;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		student.id = id;
	}
	public static void Display() {
		System.out.println(id);
		System.out.println(firstname + lastname);
		System.out.println(dept);
		System.out.println(gender);

	}
	public static void main(String agrs[]) {
		student s1 = new student();
		s1.setFirstname("Ram");
		s1.setLastname("kumar");
		s1.setId(4123);
		s1.setDept("CSE");
		s1.setGender("Male");
        student.Display();
	}
}