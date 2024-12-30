import java.util.regex.Pattern;
import java.util.regex.Matcher;

class F1 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("mohan");

        Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan scored 90 out of 100");

        while(m.find())
        {
            System.out.println("Group () -> " + m.group() + " start() -> " + m.start() + " end () -> "  + m.end());
        }
    }
}


// D:\javaprac\50_pattern_matcher>javac F1.java

// D:\javaprac\50_pattern_matcher>java F1
// Group () -> mohan start() -> 0 end () -> 5
// Group () -> mohan start() -> 24 end () -> 29
// Group () -> mohan start() -> 52 end () -> 57