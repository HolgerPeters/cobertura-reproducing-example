package reproducingexample;

import java.util.List;
import java.util.stream.Collectors;

public class Foo {
    public static void main(int argc, char[] argv) {
    }

	public static List<Integer> add_const(List<Integer> xs, int i) {
        return xs.stream().map( (x) -> (i + x)).collect(Collectors.toList());
	}
}