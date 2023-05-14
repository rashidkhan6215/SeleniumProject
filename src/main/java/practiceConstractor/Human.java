package practiceConstractor;

public class Human {
	String name,gender;//only variable
	int idNo;
	
	Human() {  //non parameter Constructor(without argument)
	System.out.println("no data");
		
		}
	
	Human(String n,String g){  //Parameter Constructor(single data type)
	
	name=n;
	gender=g;
	}

    Human(String n,String g, int i){  //2 type data
    	name=n;
    	gender=g;
    	idNo=i;
    	
	}

    void displayinfo(){
    	System.out.println("name: " +name);
    	System.out.println("gender: "  +gender);
    	System.out.println("idNo: " +idNo);
    }
	public static void main(String[] args) { //create main method
		
		Human human = new Human(); //
		human.displayinfo();
		
		Human human1=new Human("Mosaddik","Male"); // single data typ(parameter Constructor)
		human1.displayinfo();
		
		Human human2 = new Human("Rubel","Male",123456); // 2 type of data(Parameter Constractructor)
		human2.displayinfo();


}
}