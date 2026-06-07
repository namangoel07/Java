package Service;

public class JavaCourse implements ICourses {

	@Override
	public Boolean getTheCourse(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("JavaCourse course is Purchased at a price of:"+amount);
		
		return true;
	}

}
