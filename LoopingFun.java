//Burak Kurt
//Period 2
public class LoopingFun {
//------------------------------
	public static boolean isPrime(int n) {
		{
		for ( int i = 2; i <= n - 1; i++ )
		{
		if ( n % i == 0 )
		return false;
		}
		return true;
	    }
	}
//------------------------------
	public static void primeNumberList(int n) {
		for ( int i = 2; i < n; i++ )
		{
		if ( isPrime( i ) )
		System.out.print( i + " " );
		}
	}
//------------------------------
	public static int sumInts(int n) {
		return n * ( 1 + n ) / 2;
	}
//------------------------------
	public static long factorial( int n )
	{
	long product = 1;
	for ( int i = 2; i <= n; i++ )
	{
	product *= i;
	}
	return product;
	}
//------------------------------
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
//------------------------------
	public static int lcm(int a, int b) {
		int n1 = a;
		int n2 = b;
		int lcm;
		    lcm = (n1 > n2) ? n1 : n2;
		    while(true) {
		      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
		        return lcm;
		      }
		      ++lcm;
		    }
		  }
//------------------------------
	public static int gcf(int a, int b) {
		for (int i = Math.min(a, b); i>0; i--) {
			if (a % i == 0 && b %i == 0) {
				return i;
			}
		} return 0;
	}
//------------------------------
	public static int sumDigits(int n) {
		String s = n + "";
		int sum = 0;
		for ( int i = 0; i < s.length(); i++ )
		{
		sum += Integer.parseInt( s.charAt( i ) + "" );
		}
		return sum;
	}
//------------------------------
	public static int reverseNum(int n) {
		int num = n,
				reversed = 0;
		while(num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
			}
			    	    return reversed;
			    	  }
//------------------------------
	public static void coinTrials(int n) {
		int headCount = 0;
		int tailCount = 0;
		for ( int i = 0; i < n; i++ )
		{
		double random = Math.random();
		if ( random < 0.5 )
		headCount++;
		else
		tailCount++;

		}
		System.out.println( "Heads: " + headCount );
		System.out.println( "Tails: " + tailCount );
		}
//------------------------------

	public static int countDigits(int n) {
		String num = n + "";
		if ( num.indexOf( "." ) >= 0 )
		return num.length() - 1;
		else
		return num.length();
		}
//------------------------------
	public static void fibonacci(int n) {
		int second = 1;
		int last = 1;
		System.out.print( "1, 1" );
		for ( int i = 3; i <= n; i++ )
		{
		int num = second + last;
		System.out.print( ", " + num );

		second = last;
		last = num;
		}
		}
//------------------------------
	public static boolean isPerfect(int n) {
		{
		int sum = 0;
		for ( int i = 1; i < n; i++ )
		{
		if ( n % i == 0 )
		sum += i;

		}
		return sum == n;
		}
	}
//------------------------------
	public static void primeFactorization(int n) {
		int a = n;
		int i = 2;
		while (a > 1) {
			i++;
		} System.out.println(i + "");
		a /= 2;
	}
//------------------------------
	public static int binary(int n) {
		return Integer.parseInt(Integer.toBinaryString(n));
	}
//------------------------------
	public static void pyramid(int n) {
		int k = 0;
		for (int i = 0; i < n; i++, k=0) {
			for (int j = 1; j <= n-i; j++) {
				System.out.println(" ");
			}
			while (k != 2 * i-1) {
				System.out.println("* ");
				k++;
			}
		} System.out.println();
	}
//------------------------------
	public static void printFactors1(int n) {
		int i;
		int num = n;
		int total=0;
		for(i=1;i<=num;i++){
			if(num%i==0)
				total++;
			}
		System.out.println(total);
	}
//------------------------------
	public static void printFactors2(int n) {
		int x = n; 
		int i = 1;
		while (i <= x) {
			if (x % i == 0) {
				System.out.print(i + " ");
				}
			++i;
			}
		System.out.print("\n");
		}
//------------------------------
	public static void main(String[] args) {
		System.out.println("Binary of 122:  " + binary(122));
		System.out.println("\nCoin trials:  "); coinTrials(100);
		System.out.println("\nCountDigits of 23456:  " + countDigits(23456));
		System.out.println("\nFactorial of 10:  " + factorial(10));
		System.out.println("\nFibonacci of 10:  "); fibonacci(10);
		System.out.println("\n\ngcf of 32 & 80:  " + gcf(32, 80));
		System.out.println("\nisEven of 62875:  " + isEven(62875));
		System.out.println("isEven of 62878:  " + isEven(62878));
		System.out.println("\nisPerfect of 28:  " + isPerfect(28));
		System.out.println("isPerfect of 30:  " + isPerfect(30));
		System.out.println("\nisPrime of 30:  " + isPrime(30));
		System.out.println("isPrime of 31:  " + isPrime(31));
		System.out.println("\nlcm of 32 & 80:  " + lcm(32, 80));
		System.out.println("\nPrime Factorization of 112:  "); primeFactorization(112);
		System.out.println("\nPrime number list for 34:  "); primeNumberList(34);
		System.out.println("\n\nReverse of 1358642:  " + reverseNum(1358642));
		System.out.println("\nPyramid - 6 high:  "); pyramid(6);
		System.out.println("\n\nsum digits of 24678:  " + sumDigits(24678));
		System.out.println("sum of ints up to 10:  " + sumInts(10));
		System.out.println("\nFactors of 84:  "); printFactors1(84);
		System.out.println("\nFactors of 100:  "); printFactors2(100);
	}
}