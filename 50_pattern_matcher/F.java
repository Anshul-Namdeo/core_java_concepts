import java.util.regex.Pattern;
import java.util.regex.Matcher;

class F 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("mohan");

        Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan scored 90 out of 100");

        if(m.find())
        {
            System.out.println("Group () -> " + m.group() + " start() -> " + m.start() + " end () -> "  + m.end());
        }
    }
}


// D:\javaprac\50_pattern_matcher>javac F.java

// D:\javaprac\50_pattern_matcher>java F
// Group () -> mohan start() -> 0 end () -> 5
