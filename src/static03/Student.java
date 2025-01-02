package static03;

public class Student {
	// 필드 정의
	private String name;
	private String studentId;
	private int grade;
    private static int totalStudents = 0;

    public Student(String name, String studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
        totalStudents++; 
    }
	
	public String getName() {
		return name;
	}
	public static int getTotalStudents() {
		return totalStudents;
	}

	public static void setTotalStudents(int totalStudents) {
		Student.totalStudents = totalStudents;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	

}
