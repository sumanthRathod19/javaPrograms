
public class Stringbuilder {

	public static void main(String[] args) {
		//string takes more time in these situation 
		//in these case the string obj created every time with variable and deffered at the last 
		String str;
		str="h";
		str=str+"e";//str=he
		str=str+"l";//str=hel
		str= str+"l";//str=hell
		//store in the these string lastly these leads to time cosumption 
		str= str+"o";//str=hello
		System.out.println(str);//hello
		System.out.println();
		//append: to add the string at the end of the string and adds the string inthe same string
		StringBuilder sb1=new StringBuilder("h");
		sb1.append('e');
		sb1.append('l');
		sb1.append('l');
		sb1.append('o');
		System.out.println(sb1);
		//to get length of the string
		System.out.println(sb1.length());
		//so we go for sting builder
		StringBuilder sb=new StringBuilder("Tony");
		System.out.println(sb);//sumanth
		//char at the index 5
		System.out.println(sb.charAt(0));
		//set the char: means replacing that chat by another char
		sb.setCharAt(0, 'P');
		System.out.println(sb);
		//insert of the new char in the string
		sb.insert(2, 'n');
		System.out.println(sb);
		//to delete a substring:from start index to ending index
		sb.delete(0, 4);
		System.out.println(sb);
		//to replace string from starting index to ending index
		sb.replace(0, 4, "Sumanth");
		System.out.println(sb);
		//stringbuilder rev by using for loop
		for(int i=0;i<sb.length()/2;i++)
		{
			int front = i;
			int back=sb.length()-1-i; //5-1-0= > 4
			char frontchar = sb.charAt(front);
			char backchar = sb.charAt(back);
			sb.setCharAt(front, backchar);
			sb.setCharAt(back, frontchar);
		}
		System.out.println(sb);
		System.out.println(sb1.reverse());
		System.out.println(sb.reverse());

		System.out.println(sb.hashCode());
		System.out.println(sb.toString());//it is returning rev of the string
		
		
	}
}
