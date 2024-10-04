package in.nit.workshop;

public class Person {
	//static variables
	public static String country;
	public static String state;
   
	//instance variable or non-static variables
	public String personName;
	public String qualification;
	public String panCardNumber;
	public int aadharNumber;
	
	
    //methods
	public static void dislayInformation() {
		System.out.println("display method is invoked");
	}

    public void getInformation() {
    	System.out.println("invoking non-static methods");
    }
}