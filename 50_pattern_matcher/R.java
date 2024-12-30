import java.util.regex.Pattern;
import java.util.regex.Matcher;

class R 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("[e-js-w]"); // Range type Pattern
        Matcher m = p.matcher("mohan is a good friend of mine");

        while(m.find())
        {
            System.out.println("Match: " + m.group() + " start: " + m.start() + " end: " + m.end()) ;
        }

    }
}



// D:\javaprac\50_pattern_matcher>javac R.java

// D:\javaprac\50_pattern_matcher>java R
// Match: h start: 2 end: 3
// Match: i start: 6 end: 7
// Match: s start: 7 end: 8
// Match: g start: 11 end: 12
// Match: f start: 16 end: 17
// Match: i start: 18 end: 19
// Match: e start: 19 end: 20
// Match: f start: 24 end: 25
// Match: i start: 27 end: 28
// Match: e start: 29 end: 30
