
public class Remove_Spcl_CharIn_String {

	public static void main(String[] args) {
		String s="@#$%^&**&^%$#@# lat#in$ stri@ng 01234567890";
		s=s.replaceAll("[^a-zA-Z 0-9]", "");
		System.out.println(s);
	
	}

}
