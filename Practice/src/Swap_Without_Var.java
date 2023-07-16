
public class Swap_Without_Var {
	static int x=10;
	static int y=20;
	public static void main(String[] args) {
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		System.out.println(y);
	}

}
