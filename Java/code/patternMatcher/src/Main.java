
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Main {

    public static void main(String[] args)
    {
        /*提取字符串中数字，并且排序输出*/
        String a="love23next234csdn3423javaeye";
        String regEx="[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(a);
        System.out.println( m.replaceAll("").trim());

    }
}
