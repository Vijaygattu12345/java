package in.nit.workshop;

public class Subject {
	
	public String subjectName;
	public String subjectCode;
	
	public Subject() {
		System.out.println("default constructor");
	}
	
	//instance methods
	public void getSubjectDetails() {
	System.out.println("this is getSubjectDetails method ");
	}
	public void getSubjectDetails(String subjectName) {
		System.out.println("this is getSubjectDetails method");
		System.out.println("subject name:"+ subjectName);
	}
	//to get length of the given subject
	public void getNumberOfChar(String subjectName) {
		System.out.println("finding the char count");
		System.out.println("subject char count:"+subjectName.length());
	}
	// get the word count
	public void getNumberOfWords(String sentences) {
		System.out.println("sentence is :"+sentences);
		String words[] = sentences.split(" ");
		System.out.println("word count is:"+words.length);
		System.out.println(sentences.toUpperCase());
		System.out.println(sentences.toLowerCase());
	}
	
	 
	}
