import java.util.regex.Pattern;
import java.util.regex.Matcher;

class L1
{
    public static void main(String agrs[])
    {
        Pattern p = Pattern.compile("aba");
        Matcher m = p.matcher("ababababbaba");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}


// D:\javaprac\50_pattern_matcher>javac L1.java

// D:\javaprac\50_pattern_matcher>java L1
// match: aba start: 0 end: 3
// match: aba start: 4 end: 7
// match: aba start: 9 end: 12