package EnumAndAnnotation;
class Animal{
	public void animalUsuallyHuntsAndEat() {
		System.out.println("Animal is eating");
	}
}
class Tiger extends Animal{
	@Override //annotation
	public void animalUsuallyHuntsAndEat() {
		System.out.println("Tiger hunts and eat");
	}
}
public class LaunchAnnotation1 {
public static void main(String[] args) {
	Tiger t=new Tiger();
	t.animalUsuallyHuntsAndEat();
}
}
