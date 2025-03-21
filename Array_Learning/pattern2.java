package Array_Learning;

public class pattern2 {
	public static void main(String[] args) {
		int n = 6;
		int spaces = 0 , stars = (n*2)-1;
		for (int a = 0; a < n; a++) {
			for (int i = 0; i < spaces; i++) {
				System.out.print(" ");
			}
			spaces++;
			for (int i = 0; i < stars; i++) {
				System.out.print("*");
			}
			stars -= 2;
			System.out.println();
		}
	}
}