import java.util.regex.Pattern;
import java.util.regex.Matcher;

class K2 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("\\d\\d\\d");
        Matcher m = p.matcher("mohan scored 90 out of 100 abd sohan scroed 45 out of 250");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}


// D:\javaprac\50_pattern_matcher>javac K2.java

// D:\javaprac\50_pattern_matcher>java K2
// match: 100 start: 23 end: 26
// match: 250 start: 54 end: 57