//Burak Kurt
public class TenToAny {
	 int base10;
	 int newBase;

	public TenToAny(int a, int b) {
		base10 = a;
		newBase = b;
	}

	public int setNum(int a, int b) {
		int num = 0;
		return num;
	}

	public String getNewNum() {
		int a = base10;
		int b = newBase;
		String newNum = "";
		String blank = "";

		while (a > 0) {
			newNum += ("" + a % b);
			a = a / 8;
		}
		int c = newNum.length();
		String temp = newNum;

		while (c > 0) {

			blank += temp.substring(c - 1, c);
			newNum = blank;
			c--;
		}
		return newNum;
	}
}