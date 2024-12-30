import java.util.regex.Pattern;
import java.util.regex.Matcher;

class I1 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("sohan");
        // Pattern p = Pattern.compile("mohan");

        Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan scored 90 out of 100");

        m.find();

        System.out.println(m.group());
    }
}

// D:\javaprac\50_pattern_matcher>javac I1.java

// D:\javaprac\50_pattern_matcher>java I1
// Exception in thread "main" java.lang.IllegalStateException: No match found
//         at java.base/java.util.regex.Matcher.group(Matcher.java:644)
//         at java.base/java.util.regex.Matcher.group(Matcher.java:603)
//         at I1.main(I1.java:15)