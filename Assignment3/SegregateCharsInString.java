package Assignment3;

public class SegregateCharsInString {

	public static void main(String[] args) {
		
		String st= "a$#1sv%2";           //op-  asv 12 $#%
		
		String alpha=" ";
		String num=" ";
		String spc=" ";
			
		for(int i=0; i<st.length(); i++)
		{
			if(st.charAt(i)>='a'  && st.charAt(i)<='z'  || st.charAt(i)>='A'  && st.charAt(i)<='Z' )
			{
				alpha=alpha+st.charAt(i);
			}
			
			else if(st.charAt(i)>='0'  && st.charAt(i)<='9')
			{
				num= num+st.charAt(i);
			}
			
			else
			{
				spc=spc+st.charAt(i);
			}
		    }
		
		System.out.println(alpha+num+spc);

	}
}
