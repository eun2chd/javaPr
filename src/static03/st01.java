package static03;

import java.util.ArrayList;
import java.util.Scanner;

public class st01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("김새싹", "20231001", 1);
		Student st1 = new Student("박지온", "20231002", 1);
		Student st2 = new Student("이은지", "20231002", 1);
		
		System.out.println("---학생정보---");
		System.out.println("이름 : " + st.getName());
		System.out.println("이름 : " + st.getStudentId());
		System.out.println("이름 : " + st.getGrade());
		
		System.out.println("---학생정보---");
		System.out.println("이름 : " + st1.getName());
		System.out.println("이름 : " + st1.getStudentId());
		System.out.println("이름 : " + st1.getGrade());
		
		System.out.println("---학생정보---");
		System.out.println("이름 : " + st2.getName());
		System.out.println("이름 : " + st2.getStudentId());
		System.out.println("이름 : " + st2.getGrade());
		
		System.out.println("총 학생 수 : " + st.getTotalStudents());
		
		
	}

}
