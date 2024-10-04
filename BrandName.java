package in.nit.workshop;

public class BrandName {

	public static void main(String[] args) {
		String BrandName[] = {"rdstr","h&m","levis","buffalo"};
		for (int index=0; index < BrandName.length;index++){
			System.out.println(BrandName[index]);
			
		}
         int[] numbers = {1,2,3,4};
 	
 		 System.out.println("BrandName="+BrandName.length);
 	    System.out.println("numbers:"+numbers.length);
 	    
 	    System.out.println("displaying array elements");
 	    System.out.println(BrandName[0]);
 	    System.out.println(BrandName[1]);
 	    System.out.println(BrandName[2]);
 	    System.out.println(BrandName[3]);

 	   System.out.println("reverse array elements");
 		for(int index =BrandName.length-1; index>=0;index--) {
 			System.out.println(BrandName[index]);
 		}
	
	}
}

