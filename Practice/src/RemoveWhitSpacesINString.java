
public class RemoveWhitSpacesINString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="   Java    Programming is very  interesting";
		System.out.println("Before trim:"+str);
		//trim removes spaces in a string 
		//while starting and ending of the string
		str=str.trim();
	System.out.println("After trim:"+str);
	
	//remove all the spaces in between in the string
	String str1=str.replaceAll("\\s", "");
	System.out.println(str1);


	}

}
