import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5,2,4,3,4,5,6,7,8,9);

        Stream<Integer> greaterThenNumber = stream.takeWhile(number -> number<5);

        greaterThenNumber.forEach(System.out::println);
    }
}
