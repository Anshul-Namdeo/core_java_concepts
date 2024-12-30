import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile(".*xx");
        Matcher m = p.matcher("_7$hj#xxrt pq9_xxujw1");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}

// D:\javaprac\50_pattern_matcher>javac Z.java

// D:\javaprac\50_pattern_matcher>java Z
// match: _7$hj#xxrt pq9_xx start: 0 end: 17