package Main;

import Service.DevOps;

public class LaunchBatch {
public static void main(String[] args) {
	Batch b=new Batch(new DevOps());
	//Injecting dependent object/dependency into target class is called as dependency injection
	//If it is done through setter then it is known as setter injection
	//if it is done through constructor then it is known as constructor injection
	//target class/object==> a class where services of other classes are being used
	//eg in this project==>Batch class
	//dependent object/class==> a class whose services will be used in the target class
	//eg in this project==> SpringBoot,Devops,etc.
	b.getCourse(2500.0);
}
}
