
public class ifCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b= 20;
		float an = 17;
		if(a > b) {
			System.out.println("a is greater " + a);
		}else {
			System.out.println("b is greater " + b);
		}
		div(a,b);
		int x =(int) divFloat(b, an);
		System.out.println("type converstion from float to int " + x);
		

	}
	public static void div(int c, int d) {
		int result = c/d;
		System.out.println("result of div " + result);
	}
	public static float divFloat (int f, float m ) {
		float floatResult = f / m;
		return floatResult;
	}

}
