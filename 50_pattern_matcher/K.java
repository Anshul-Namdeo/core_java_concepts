import java.util.regex.Pattern;
import java.util.regex.Matcher;

class K 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("\\d\\d");
        Matcher m = p.matcher("mohan scored 9 out of 100");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());       
        }
    }
}

// D:\javaprac\50_pattern_matcher>javac K.java

// D:\javaprac\50_pattern_matcher>java K
// match: 10 start: 22 end: 24
