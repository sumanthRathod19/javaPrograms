package Assignment3;

public class AddUnmbersInString {
	
	public static void main(String[] args) {
		
		String s = "b2c3d1";
		int sum=0;
		
//		for(int i=0; i<s.length(); i++)
//		{
//			if(s.charAt(i)>='0'  && s.charAt(i)<='9')
//			{
//				sum = sum+(s.charAt(i)-'0');
//			}
//			
//		}		
//		System.out.println(sum);
		
		
		
		//2nd way
		
		char[] st= s.toCharArray();
  		for(int i=0; i<st.length; i++)
		{
			if(st[i]>=48  && st[i]<57)
			{
				sum = sum + (st[i]-48);
			}
		}
		System.out.println(sum);
		
	}

}
