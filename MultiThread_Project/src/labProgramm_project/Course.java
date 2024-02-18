package labProgramm_project;

public class Course {

	private int course_id;
	private String course_name;
	private double course_fee;
	public Course(int course_id, String course_name, double course_fee) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_fee = course_fee;
	}
	public int getCourse_id() {
		return course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public double getCourse_fee() {
		return course_fee;
	}
	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_name=" + course_name + ", course_fee=" + course_fee + "]";
	}
	
	
}
