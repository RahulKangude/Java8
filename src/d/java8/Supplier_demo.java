package d.java8;

import java.util.function.Supplier;

public class Supplier_demo {
	public static void main(String[] args) {
		Supplier<String> s1 = () -> {
			String otp = "";
			for(int i=0;i<=6;i++) {
				
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
	}
}
