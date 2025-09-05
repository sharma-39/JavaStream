import java.util.Arrays;
import java.util.List;

public class VowelsStringStream {

    public static void main(String[] args) {

        String str="abracadabra";
        int countStream = (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
        System.out.println("CountStream:-"+countStream);

    }
}
