package student_object_methods;

public class Students {
	String first_name, last_name, course, section;
	int year;
	float midterm_grade, final_grade, ave;

	Students(String first_name, String last_name, String course, String section, int year, float midterm_grade,
			float final_grade) {

		this.first_name = first_name;
		this.last_name = last_name;
		this.course = course;
		this.section = section;
		this.year = year;
		this.midterm_grade = midterm_grade;
		this.final_grade = final_grade;
	}

	void introduceSelf() {
		System.out.println("Student Name: " + first_name + " " + last_name);
		System.out.println("Course: " + course + "\nSection: " + section + "\nSchool Year: " + year);

	}

	void evaluateGrade() {
		System.out.println("\n");
		System.out.println("Midterm Grade: " + midterm_grade);
		System.out.println("Final Grade: " + final_grade);

		ave = (midterm_grade + final_grade) / 2;
		System.out.println("The Average is: " + ave);

		if ((ave >= 98) && (ave <= 100)) {
			System.out.println("Award: With Highest Honor");
		}else if((ave >= 95) && (ave <= 97.99)) {
			System.out.println("Award: With High Honor");
		}else if((ave >= 90) && (ave <= 94.99)) {
			System.out.println("Award: With Honor");
		}else if((ave >= 75) && (ave <= 89.99)) {
			System.out.println("Passed");
		}else if(ave<=74) {
			System.out.println("Failed");
		}else {
			System.out.println("Invalid Input");
		}
	}
}