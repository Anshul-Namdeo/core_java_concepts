import java.util.regex.Pattern;
import java.util.regex.Matcher;

class J 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("\d");

        Matcher m = p.matcher("mohan scored 9 out of 10");

        while(m.find())
        {
            System.out.println("Match: " + m.group() + "start: " + m.start() + "end: " + m.end());
        }
    }
}

// D:\javaprac\50_pattern_matcher>javac J.java
// J.java:8: error: illegal escape character
//         Pattern p = Pattern.compile("\d");
//                                       ^
// 1 error