package labProgramm_project;

public class Student {

	private String name;
	private Education_institute educationalInstutute;
	
	public Student(String name,Education_institute educationalInstutute) {
		super();
		this.name = name;
		this.educationalInstutute =educationalInstutute;
	}
	
	
	public void viewCoursesAndFees() {
	Course[] courses=educationalInstutute.getCourses();
	for(Course course:courses) {
		System.out.println(course.getCourse_id()+" : "+course.getCourse_name()+" : "+course.getCourse_fee());
	}
	}
	public void viewOffers(){
		Offer[] offers=educationalInstutute.getOffers();
		for(Offer offer:offers) {
			System.out.println(offer.getOffer_text());
		}
		
	}
	public void enrollInCourse(int courseId) {
		Course[] courses=educationalInstutute.getCourses();
		for(int i=0;i<3;i++) {
			if(courseId==i+1) {
				System.out.println( getName()+  " enroll in  \n"+courses[i]);
			}
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
