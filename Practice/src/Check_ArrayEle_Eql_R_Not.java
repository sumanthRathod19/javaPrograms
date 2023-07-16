//checking array length of elements
public class Check_ArrayEle_Eql_R_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4};
int b[]= {1,2,3,5};
/*boolean eql=a.equals(b);
if(eql==true)
	System.out.println("Both array elements are equal");
else
	System.out.println("Both array are not equal");
	*/
	
//Approach 2 to check in array ele are equal are not
boolean st=true;
if(a.length==b.length)
{	for (int i = 0; i < a.length; i++) {
	if(a[i]!=b[i])
		st=false;
	}
}	
else
	st=false;

	if(st==true)
			System.out.println("arrays are equal");
	else
		System.out.println("Arrays are not equal");
	}

}
