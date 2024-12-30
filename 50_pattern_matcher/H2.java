import java.util.regex.Pattern;
import java.util.regex.Matcher;

class H2 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("mohan");
        Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan scored 90 out of 100");

        System.out.println(m.end());
    }
}


// D:\javaprac\50_pattern_matcher>javac H2.java

// D:\javaprac\50_pattern_matcher>java H2
// Exception in thread "main" java.lang.IllegalStateException: No match available
//         at java.base/java.util.regex.Matcher.end(Matcher.java:522)
//         at H2.main(H2.java:11)