package in.nit.workshop;

public class PersonRunner {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Person.country = "india";
		Person.state = "karnataka";
		System.out.println("country is:"+Person.country);
		System.out.println("state is:"+Person.state);
	
	Person person =	new Person();
	person.aadharNumber = 123456;
	person.panCardNumber = "ciupv67";
	person.qualification = "be";
	
	System.out.println("aadharNumber:"+person.aadharNumber);
	System.out.println("panCardNumber:"+person.panCardNumber);
	System.out.println("qualification:"+person.qualification);
	
	
	Person vijay = new Person();
	vijay.aadharNumber = 123456;
	vijay.panCardNumber = "ciupv67";
	vijay.qualification = "be";
	
	System.out.println("aadharNumber:"+vijay.aadharNumber);
	System.out.println("panCardNumber:"+vijay.panCardNumber);
	System.out.println("qualification:"+vijay.qualification);
	
	person.getInformation();
	Person.dislayInformation();
	
	
	}

}
