

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Main {

    public static void main(String[] args)
    {
        /*提取字符串中数字，并且排序输出*/
        String numStr="ccytc67fc6r6cvui9bvu8vuvub0bib97gvyyb0h0bbp0h9g8c65d";

        //提取数字，把其他字符去掉
        String regEx="\\D";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(numStr);
        numStr=m.replaceAll("").trim();

        /*排序数字字符串*/
        char[] intArrNum = new char[numStr.length()];
        int index = 0;
        for(int i = 0; i< numStr.length(); ++i){
            if(numStr.charAt(i)>=48 && numStr.charAt(i) <= 57){
                intArrNum[index] = numStr.charAt(i);
                index++;
            }
        }

        Arrays.sort(intArrNum);//排序
        for(char a : intArrNum){
            System.out.print(a);
        }

    }
}
