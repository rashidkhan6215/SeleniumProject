package practiceConstractor;

public class Teacher {
	
	String name,gender;
	int phoneNom;
	
	Teacher(String n,String g,int p){//this is constructor
		
		name=n;
		gender=g;
		phoneNom=p;
	}
	
	void displayinfo() {//this is method(coz it has return)
	
		System.out.println("name:" + name);
		System.out.println("gender:" + gender);
		System.out.println("phoneNOm:" + phoneNom);
		
		
	}
	
	public static void main(String[] args) {
		Teacher teacher = new Teacher("Khan","Male",1234567890);
		teacher.displayinfo();
		
		
	}

}
			
		
	
		

	 
    