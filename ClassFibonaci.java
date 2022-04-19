package week.day1;

public class ClassFibonaci {
	public static void main(String[] args) {
		int a = 8, firstnum = 0, secnum = 1, sum;

		for (int i = 1; i <= a; i++) {
			System.out.println(firstnum);
			sum = firstnum + secnum;
			firstnum = secnum;
			secnum = sum;
		}

	}
}
