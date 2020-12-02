package _01_algorithms._2_fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int z = 7;
		System.out.println(x);
		System.out.println(y);
		for(int i = 0; i < 10; i++) {
			int sum = x + y;
			System.out.println(sum);
			x = y;
			y = sum;
		}
	}
}
