package labProgramm_project;

public class Education_institute_App {

	public static void main(String[] args) throws InterruptedException {
		
		Course[] course=new Course[3];
		course[0]=new Course(1, "Mathematics", 1000);
		course[1]=new Course(2, "Science", 1200);
		course[2]=new Course(3, "English", 900);
		
		Offer[] offers=new Offer[2];
		 
		offers[0]=new Offer("pecial discount: Get 20% off on all courses!");
		offers[1]=new Offer("offers[0]=new Offer(\"pecial discount: Get 20% off on all courses!\");");
		
		Education_institute ei=new Education_institute(course, offers);
		
		Student virat=new Student("virat", ei);
		Student dhoni =new Student("dhoni", ei);
		Student sachin =new Student("sachin", ei);
		Student Yogeshwar=new Student("Yogeshwar", ei);
		
		
		Thread t1=new Thread() {
			@Override
			public void run() {
				System.out.println("Available courses and Fess ");
				virat.viewCoursesAndFees();
				virat.viewOffers();
				virat.enrollInCourse(1);
			}
		};
		Thread t2=new Thread() {
			@Override
			public void run() {
				System.out.println("Available courses and Fess ");
				dhoni.viewCoursesAndFees();
				dhoni.viewOffers();
				dhoni.enrollInCourse(3);
			}
		};
		Thread t3=new Thread() {
			@Override
			public void run() {
				System.out.println("Available courses and Fess ");
				sachin.viewCoursesAndFees();
				sachin.viewOffers();
				sachin.enrollInCourse(2);
			}
		};
		Thread t4=new Thread() {
			@Override
			public void run() {
				System.out.println("Available courses and Fess ");
				Yogeshwar.viewCoursesAndFees();
				Yogeshwar.viewOffers();
				Yogeshwar.enrollInCourse(1);
			}
		};
		
		
		
		
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();
		
		
		
		

	}

}
