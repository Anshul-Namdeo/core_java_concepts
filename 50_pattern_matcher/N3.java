import java.util.regex.Pattern;
import java.util.regex.Matcher;

class N3
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("\\h");
        Matcher m = p.matcher("\ta\u1680ee\u180e67\u2000-\u200a))\u202f\u205f\u3000");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}


// D:\javaprac\50_pattern_matcher>javac N3.java

// D:\javaprac\50_pattern_matcher>java N3
// match:   start: 0 end: 1
// match: ? start: 2 end: 3
// match: ? start: 5 end: 6
// match: ? start: 8 end: 9
// match: ? start: 10 end: 11
// match: ? start: 13 end: 14
// match: ? start: 14 end: 15
// match: ? start: 15 end: 16