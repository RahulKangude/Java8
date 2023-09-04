package d.java8;

import java.util.function.Consumer;

public class Consumer_chaining {
	public static void main(String[] args) {

		Consumer<Movie> c1 = m -> System.out.println("Release date " + m.name);
		Consumer<Movie> c2 = m -> System.out.println("Superhit movie " + m.name);
		Consumer<Movie> c3 = m -> System.out.println("Floop" + m.name);

		Consumer<Movie> c4 = c1.andThen(c2).andThen(c3);// is consumer chaining

		Movie m1 = new Movie("Dangal");
		c4.accept(m1);
	}
}

class Movie {
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}

}