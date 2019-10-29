import java.lang.Long;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Long> ll = new ArrayList<>();
        List<Long> n = ll.stream().distinct().collect(Collectors.toList());

        System.out.println("This is DeLang`s first java jar!");
        Test.test();
        Long a = 0L;
    }
}
