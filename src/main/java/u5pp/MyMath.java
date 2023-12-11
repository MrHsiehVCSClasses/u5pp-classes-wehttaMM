package u5pp;

public class MyMath {

	public double x ;
	public int sqr ;

	/**
	 *
	 * @param x
	 * @return
	 */
	public static int abs(int x) {
		int xx = x;
		if (x < 0) {
			xx = x + (-2 * x);
			return xx;
		}
		else {
			return xx;
		}
	}

	/**
	 *
	 * @param x
	 * @return
	 */
	public static double abs(double x) {
		double xx = x;
		if (x < 0) {
			xx = x + (-2 * x);
			return xx;
		}
		else {
			return xx;
		}
	}

	/**
	 *
	 * @param base
	 * @param exponent
	 * @return
	 */
	public static double pow(double base, int exponent) {
		double x = base;
		if (exponent == 0) {
			x = 1;
		}
		else {
			for (int i = 1; i < exponent; i++) {
				x *= base;
			}
		}
		return x;
	}

	/**
	 *
	 * @param x
	 * @return
	 */
	public static int perfectSqrt(int x) {
		int sqr  = x;
		int y = 1;
		if (x > 4) {
			sqr = x/2;
		}
		while (y < sqr){
			if (x / y == y) { 
				return y;
			}
			y++;
		}
		
		return -1;
		
	}
	
}
