import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Q 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("[e-m]");
        Matcher m = p.matcher("mohan is a good friend of mine");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}

// D:\javaprac\50_pattern_matcher>javac Q.java

// D:\javaprac\50_pattern_matcher>java  Q
// match: m start: 0 end: 1
// match: h start: 2 end: 3
// match: i start: 6 end: 7
// match: g start: 11 end: 12
// match: f start: 16 end: 17
// match: i start: 18 end: 19
// match: e start: 19 end: 20
// match: f start: 24 end: 25
// match: m start: 26 end: 27
// match: i start: 27 end: 28
// match: e start: 29 end: 30