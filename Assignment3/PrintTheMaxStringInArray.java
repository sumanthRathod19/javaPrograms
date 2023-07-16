package Assignment3;

public class PrintTheMaxStringInArray {
	
	public static void main(String[] args) {
		
		String[] s = {"abcdef","avbc","qfq","ab","ewree"};
		
		String maxl=s[0];
		
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()>maxl.length())
			{
				maxl=s[i];
			}
		}
		
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()==maxl.length())
			{
				System.out.println(s[i]);
			}
		}
		
		
		//For Numbers in the array
		
//        String[] s = {"10","123456","avbc","qfq","ab","ewree", "1"};
//		
//		String maxl=s[0];
//		
//		for(int i=0; i<s.length; i++)
//		{
//			if(s[i].length()>maxl.length())
//			{
//				maxl=s[i];
//			}
//		}
//		
//		for(int i=0; i<s.length; i++)
//		{
//			if(s[i].length()==maxl.length())
//			{
//				System.out.println(s[i]);
//			}
//		}
	}

}
