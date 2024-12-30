import java.util.regex.Pattern;
import java.util.regex.Matcher;

class K1 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("\\d\\d");
        Matcher m = p.matcher("mohan scored 90 out of 100 abd sohan scroed 45 out of 250");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}


// D:\javaprac\50_pattern_matcher>javac K1.java

// D:\javaprac\50_pattern_matcher>java K1
// match: 90 start: 13 end: 15
// match: 10 start: 23 end: 25
// match: 45 start: 44 end: 46
// match: 25 start: 54 end: 56
