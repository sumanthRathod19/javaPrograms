import java.util.ArrayList;

public class SortingNumberinSentenceinWord {
	public String sortSentence(String s) {
        int n = s.length();
        ArrayList<String>li = new ArrayList<>();
        
        String str = "";
        for(int i=0; i<n; i++){
            if(s.charAt(i)!=' '){
                str+=s.charAt(i);
            }else{
                li.add(str);
                str = "";
            }
        }
        li.add(str);
        String ans = "";
        int lisize = li.size();
        String a[] = new String[lisize];
        for(int i=0; i<li.size(); i++){
            String x = li.get(i);
            int xl = x.length()-1;
            a[x.charAt(xl)-'1']= x.substring(0,xl);
            //a[x.charAt(xl)-'1']= x.substring(0,xl); we have to change here 
        }
        for(int i=0; i<lisize-1; i++){
            ans+=a[i]+" ";
        }
        ans+=a[lisize-1];
        // System.out.println(ans);
        return ans;
}
public static void main(String[] args) {
	SortingNumberinSentenceinWord sb=new SortingNumberinSentenceinWord();
	String str="h1appy y3all! coding2";
	sb.sortSentence(str);
}
}