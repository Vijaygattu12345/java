package in.nit.workshop;

public class ShopNames {

	public static void main(String[] args) {
		String shopNames[] = {"teashop","hotel"};
		for (int index=0; index < shopNames.length;index++){
			System.out.println(shopNames[index]);
			
		}
			System.out.println("reverse array elements");
			for(int index =shopNames.length-1; index>=0;index--) {
				System.out.println(shopNames[index]);
			}
			 boolean isGood =false;
			 if(isGood==true) {
				 System.err.println("is Good is true:"+isGood);
			 }
			 else {
				 System.out.println("else condition");
				 System.err.println("is good is:"+isGood);
			 }
			
			
	   }
	}
