package labProgramm_project;

public class Education_institute {

	
	public Course[] courses;
	public Offer[] offers;
	public Education_institute(Course[] courses, Offer[] offers) {
		super();
		this.courses = courses;
		this.offers = offers;
	}
	public Course[] getCourses() {
		return courses;
	}
	public  Offer[] getOffers() {
		return offers;
	}
	public void enrollStudentInCourse(int course_id, String Student_name) {
		
	}
	
	
}
