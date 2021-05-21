import java.util.Scanner;

public class Exam44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam44 ex = new Exam44();
		int i = 0;
		ex.method1(i);
		int end = 10;
		System.out.println("sum value from 1 to " + end + " is " + ex.sumN(end));
		end = 100;
		System.out.println("from 1 to " + end + " divide by 12 is");
		ex.finddivide12(end);
		ex.printArray();
		end = 20;
		System.out.println("");
		ex.lap71(end);
		ex.lap72();
		end = 20;
		ex.lab8(end);
	}

	private void lab8(int count) {
		for (int i = count; i > 0; i--) {
			if (i == 11) {
				System.out.println("count is " + i);
				break;
			}
			System.out.println("count is " + i);

		}
	}

	private void lap72() {
		Scanner s_name = new Scanner(System.in);
		do {
//			System.out.println("");
			System.out.print("Enter number:");
			int val1 = s_name.nextInt();
			if (val1 % 2 == 0) {
				System.out.println("number=" + val1 + " เป็นเลขคู่");
			} else {
				System.out.println("number=" + val1 + " เป็นเลขคี่");
				break;
			}
		} while (true);
	}

	private void lap71(int cnt) {
		for (int i = cnt; i > 0; i--) {
			System.out.println("i=" + i);

		}
		int i = cnt;
		do {
			System.out.println("i=" + i--);
		} while (i > 0);

	}

	private void printArray() {
		int[] data = { 1, 2, 3, 4, 5 };
		for (int i : data) {
			System.out.print(i + " ");
		}
	}

	private void finddivide12(int end) {
//		for (int i = 1; i <= end; i++) 
		int i = 1;
		while (i <= end) {
			if (i % 12 == 0)
				System.out.println("divide by 12 is " + i);
			i++;
		}

	}

	private void method1(int i) {
		while (i <= 10) {
			System.out.println("i=" + i);
			i++;
		}
	}

	private int sumN(int end) {
		int sum = 0, i = 1;
		while (i <= end) {
			sum += i;
			i++;
		}
		return sum;
	}
}
