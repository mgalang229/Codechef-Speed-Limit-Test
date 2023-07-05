import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			double a = fs.nextDouble(), x = fs.nextDouble(), b = fs.nextDouble(), y = fs.nextDouble();
			double ans1 = a / x;
			double ans2 = b / y;
			if (ans1 == ans2) {
				System.out.println("Equal");
			} else if (ans1 < ans2) {
				System.out.println("Bob");
			} else {
				System.out.println("Alice");
			}
		}
		fs.close();
	}
}
