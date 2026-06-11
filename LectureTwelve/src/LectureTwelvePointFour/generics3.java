package LectureTwelvePointFour;
interface Alpha<T>{//implement krne ko kch hai h nhi isliye integer vala chlra h
	
}
class Generics<T> implements Alpha<String>{//string fix kr diya for interface
	private T ref;
	public Generics(T ref) {
		this.ref=ref;
	}
	public void disp() {
		System.out.println("The type of this is:"+ref.getClass().getName());
	}
	public T getRef() {
		return ref;
	}
}
public class generics3 {
public static void main(String[] args) {
	Generics<Integer> g=new Generics<>(44);
	g.disp();
	System.out.println(g.getRef());
	Generics<String> g1=new Generics<>("Java");
	g1.disp();
	
}
}
