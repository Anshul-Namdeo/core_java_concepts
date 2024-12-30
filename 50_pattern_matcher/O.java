import java.util.regex.Pattern;
import java.util.regex.Matcher;

class O 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("[abc]");
        Matcher m = p.matcher("Ua yna567_b %Zc");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}



// D:\javaprac\50_pattern_matcher>javac O.java

// D:\javaprac\50_pattern_matcher>java O
// match: a start: 1 end: 2
// match: a start: 5 end: 6
// match: b start: 10 end: 11
// match: c start: 14 end: 15
