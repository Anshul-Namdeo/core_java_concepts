import java.util.regex.Pattern;
import java.util.regex.Matcher;

class L 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("aaa");
        Matcher m = p.matcher("aaaaaaaa");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}


// D:\javaprac\50_pattern_matcher>javac L.java

// D:\javaprac\50_pattern_matcher>java L
// match: aaa start: 0 end: 3
// match: aaa start: 3 end: 6