package strings;

public class CountingVowelsInString {
	
	
	public static void main(String[] args) {
		
		String str= "India";
		String st= str.toLowerCase();
		
		char[] ch = st.toCharArray();
		int vcount=0;
		int ccount=0;
		for(int i=0; i<ch.length; i++)
		{
		
			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u')
			{
				vcount++;	
			}
			
			else
			{
				ccount++;
			}
		}
		System.out.println("Total Vowels Are: "+vcount);
		System.out.println("Total Consonants Are: "+ccount);
	}

}
