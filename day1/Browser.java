package practice.week1.day1;

public class Browser {
	//global variable - used outside the method/inside the class
	int age=32;
	
	public static void main(String[] args) {
		//dataType variableName=value
		//local variable - used inside the method
		float bVersion = 145.43f;
		int tabOpen=5;
		char logo='c';
		boolean appLoaded=true;
		double version=12.324145;
		String name="Chrome";
		
		System.out.println("output: "+bVersion);
		System.out.println(bVersion+"\n"+logo);
	}
}
