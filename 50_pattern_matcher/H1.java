import java.util.regex.Pattern;
import java.util.regex.Matcher;

class H1 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("mohan");
        Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan scored 90 out of 100");

        System.out.println(m.start());
    }
}



// D:\javaprac\50_pattern_matcher>javac H1.java

// D:\javaprac\50_pattern_matcher>java H1
// Exception in thread "main" java.lang.IllegalStateException: No match available
//         at java.base/java.util.regex.Matcher.start(Matcher.java:450)
//         at H1.main(H1.java:11)



// NOTE : agar bina find(), matches() or lookingAt() method ke hum start() ko call karenge to exception aa jayega.(Exception -> IllegalstateException)...