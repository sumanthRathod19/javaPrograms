
public class Swapp_With_Var {
static int x=10;
static int y=20;
public static void main(String[] args) {
	int temp=x;//temp x y
	x=y;
	y=temp;
	System.out.println(x);
	System.out.println(y);
	
}
}
