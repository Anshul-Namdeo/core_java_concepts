import java.util.regex.Pattern;
import java.util.regex.Matcher;

class H 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("mohan");
        Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan scored 90 out of 100");

        System.out.println(m.group());
    }
}


// D:\javaprac\50_pattern_matcher>javac H.java

// D:\javaprac\50_pattern_matcher>java H
// Exception in thread "main" java.lang.IllegalStateException: No match found
//         at java.base/java.util.regex.Matcher.group(Matcher.java:644)
//         at java.base/java.util.regex.Matcher.group(Matcher.java:603)
//         at H.main(H.java:11)


// NOTE : agar bina find(), matches() or lookingAt() method ke hum Group() ko call karenge to exception aa jayega.(Exception -> IllegalstateException)...