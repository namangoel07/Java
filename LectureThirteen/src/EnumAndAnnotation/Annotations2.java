package EnumAndAnnotation;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)//till when u want this annotation
@Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.METHOD,ElementType.LOCAL_VARIABLE})//TYPE-> used for class or interface

//annotation which are used to create annotations are called as meta annotations like retention and target


@interface CricketPlayer{//own annotation
	
	//single valued multi valued annotation
	
	
	String country() default "India";//if na likha user ne toh toh default vala mana jaayega
	int age() default 52;//just like this
	
	
}

//@ this specifies compiler that annotation type is being created


//whenever annotation is craeted two things to specify target and till when u want that annotation


//Virat Kohli is a cricketer who lives in India and play for India

@CricketPlayer(country="India")
class ViratKohli{
	//@CricketPlayer-> error as it is only for class or interface before declaring in ElementType
	@CricketPlayer
	private int innings;
	@CricketPlayer
	public ViratKohli() {
		
	}
	@CricketPlayer
	public int getInnings() {
		return innings;
	}
	@CricketPlayer
	public void setInnings(int innings) {
		this.innings = innings;
	}
	
}

public class Annotations2 {
public static void main(String[] args) {
	ViratKohli vk=new ViratKohli();
	vk.setInnings(344);
	System.out.println(vk.getInnings());
	System.out.println("****************");
	Class<? extends ViratKohli> c=vk.getClass();
	Annotation an=c.getAnnotation(CricketPlayer.class);//parent of all annotation in java is annotation
	CricketPlayer cp=(CricketPlayer)an;
	int age=cp.age();
	String co=cp.country();
	System.out.println("Info of attrib of annotaation "+age+" "+co);
	
}
}
