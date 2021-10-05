

import java.util.function.Predicate;

public class predicateexample {

	public static void main(String[] args) {

		Predicate<Integer> p = (X) -> X >=0;
		System.out.println(p.test(5));
		System.out.println(p.test(-1));
		
		
	}

}
