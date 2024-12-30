import java.util.regex.Pattern;
import java.util.regex.Matcher;

class O1 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("[abc5]");
        Matcher m = p.matcher("Ua yna567_b %Zc");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}


// D:\javaprac\50_pattern_matcher>javac O1.java

// D:\javaprac\50_pattern_matcher>java O1
// match: a start: 1 end: 2
// match: a start: 5 end: 6
// match: 5 start: 6 end: 7
// match: b start: 10 end: 11
// match: c start: 14 end: 15