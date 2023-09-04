package predefine_functions;

import java.util.function.Predicate;

public class Predicate_demo2 {
	public static void main(String[] args) {

		int[] x = { 45, 8, 9, 37, 1, 5, 3, 6, 4, 52, 66 };
		Predicate<Integer> p1 = i -> i % 2 == 0;// even number
		Predicate<Integer> p2 = i -> i > 10;// greater than 10

		for (int x1 : x) {
			// if (p1.and(p2).test(x1)) {
			// if (p1.or(p2).test(x1)) {
			if (p1.negate().test(x1)) {
				System.out.println(x1);
			}
		}

	}
}
