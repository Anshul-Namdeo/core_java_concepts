import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Y
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("a.b");
        Matcher m = p.matcher("a_bxma b*Ya#b");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}

// Note : (.)dot ka mtlb hai ki any character 
// ex : (a_b) (a?b) etc..




// D:\javaprac\50_pattern_matcher>javac Y.java

// D:\javaprac\50_pattern_matcher>java Y
// match: a_b start: 0 end: 3
// match: a b start: 5 end: 8
// match: a#b start: 10 end: 13