package d.java8;

public class Constructor_and_method_ref {

	public static void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
		}
	}

	public static void main(String[] args) {
		Constructor_and_method_ref cm = new Constructor_and_method_ref();
		Runnable r = Constructor_and_method_ref::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}

	}
}
