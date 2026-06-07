package Main;

import Service.ICourses;

public class Batch {
     private ICourses course;
     public Batch(ICourses course) {
    	 this.course=course;
     }
	 public void setCourse(ICourses course) {
		 this.course = course;
	 }
     public Batch() {
    	 super();
     }
     public Boolean getCourse(Double amount) {
    	 return course.getTheCourse(amount);
     }
}
