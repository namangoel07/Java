package Service;

public class DevOps implements ICourses {

	@Override
	public Boolean getTheCourse(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("DevOps course is Purchased at a price of:"+amount);
		
		return true;
	}

}
