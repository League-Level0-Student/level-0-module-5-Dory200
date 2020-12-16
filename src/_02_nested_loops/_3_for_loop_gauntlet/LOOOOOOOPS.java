package _02_nested_loops._3_for_loop_gauntlet;

public class LOOOOOOOPS {
	public static void main(String[] args) {
		for(int i = 0; i<101; i++) {
			System.out.println(i);
		}
		for(int i = 100; i>-1; i--) {
			System.out.println(i);
		}
		for(int i = 2; i<101; i++) {
			System.out.println(i);
		}
		for(int i = 1; i<100; i++) {
			System.out.println(i);
		}
		for(int i = 1; i<501; i++) {
			System.out.println(i);
			if(i%2 == 0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
	}
}
