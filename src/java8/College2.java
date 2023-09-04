package java8;

public interface College2 {
	void subtract();

	default void sendcollege1() {
		System.out.println("this is default1 method interface 2");
	}

	default void sendcollege2() {
		System.out.println("this is default2 method interface 2 ");
	}

	static void recive1() {
		System.out.println("this is static1 method interface 2");

	}

	static void recive2() {
		System.out.println("this is static2 method interface 2");

	}
}