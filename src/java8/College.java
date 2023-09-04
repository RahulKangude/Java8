package java8;

@FunctionalInterface
public interface College {

	// void add();
	void subtract();

	default void send1() {
		System.out.println("this is default1 method interface 1");
	}

	default void send2() {
		System.out.println("this is default2 method interface 1");
	}

	static void recive1() {
		System.out.println("this is static1 method interface 1");

	}

	static void recive2() {
		System.out.println("this is static2 method interface 1");

	}
}

