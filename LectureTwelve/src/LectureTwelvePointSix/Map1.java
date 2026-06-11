package LectureTwelvePointSix;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
class  Telusko{
	private Integer id;
	private String courseName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Telusko [id=" + id + ", courseName=" + courseName + "]";
	}
	public Telusko() {
		super();
		
	}
	public Telusko(Integer id, String courseName) {
		super();
		this.id = id;
		this.courseName = courseName;
	}
	
	
}
public class Map1 {
public static void main(String[] args) {
//	HashMap hm1=new HashMap();
//	hm1.put(1,"Java");
//	hm1.put(2,"SpringBoot");
//	hm1.put(3,"MicroServices");
//	System.out.println(hm1);
	Telusko telusko=new Telusko(1,"Java");
	//HashMap hm2=new HashMap();
//	LinkedHashMap hm2=new LinkedHashMap();
//	hm2.put("Alien", "Java");
//	hm2.put(telusko, "SpringBoot");
//	hm2.put(4, "MicroServices");
//	//hm2.put(4, "MicroServices"); //keys should be unique
//	hm2.put(5, "MicroServices");//value can be duplicate
//	hm2.put(null,"MicroServices");//key can be null
//	hm2.put(6,null);//value can be null
//	System.out.println(hm2);//no order of insertion is maintained in case of hashmap but in linked hashmap it is maintained
	
	//-------------------------------------------
//	HashMap<Integer,String> hm3=new HashMap<>();
//	hm3.put(1,"Java");//key value pair together is called as Entry
//	hm3.put(2, "JUnit");
//	System.out.println(hm3);
	
	//------------------------------------------------
	
	
	Hashtable ht=new Hashtable();
	ht.put(1, "Alien");
	ht.put(2, "Alien");//key should be unique
//	ht.put(null, "Sb");//key cannot be null
//	ht.put("Hibernate",null);//value cannot be null
	System.out.println(ht);//not maintaining order of insertion
	//------------------------------------------------
	
	TreeMap tm=new TreeMap();
	tm.put(3, "Hibernate");
	tm.put(2,"SB");
	//tm.put(null, "Sb");//key cannot be null
	tm.put(1, null);//value can be null
	System.out.println(tm);//giving output in sorted key
}
}
