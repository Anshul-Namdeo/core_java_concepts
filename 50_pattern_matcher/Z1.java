import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z1
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile(".*?xx"); // reluctent
        Matcher m = p.matcher("_7$hj#xxrt pq9_xxujw1");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}



// D:\javaprac\50_pattern_matcher>javac Z1.java

// D:\javaprac\50_pattern_matcher>java Z1
// match: _7$hj#xx start: 0 end: 8
// match: rt pq9_xx start: 8 end: 17