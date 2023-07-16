  package Assignment3;

public class PrintTheShortStringInArray {
	
	public static void main(String[] args) {
		
		String[] s = {"abcdef","avbc","qfq","ab","ewree"};    // op= ab
		
		String minl=s[0];
		
		for(int i=0; i< s.length; i++)
		{
			if(s[i].length()<minl.length())
			{
				minl=s[i];
			}
		}
		
		
		for(int i=0; i< s.length; i++)
		{
			if(s[i].length()==minl.length())
			{
				System.out.println(s[i]);
			}
	}
		
		
		
		//for numbers in the array
		
//        String[] s = {"10","123456","avbc","qfq","ab","ewree", "1"};
//        String minl=s[0];
//		
//		for(int i=0; i< s.length; i++)
//		{
//			if(s[i].length()<minl.length())
//			{
//				minl=s[i];
//			}
//		}
//		
//		
//		for(int i=0; i< s.length; i++)
//		{
//			if(s[i].length()==minl.length())
//			{
//				System.out.println(s[i]);
//			}
//		}
	}

}
