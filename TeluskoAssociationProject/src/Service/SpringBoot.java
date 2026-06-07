package Service;

public class SpringBoot implements ICourses {

	@Override
	public Boolean getTheCourse(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("SpringBoot course is Purchased at a price of:"+amount);
		return true;
	}

}
