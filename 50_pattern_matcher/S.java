import java.util.regex.Pattern;
import java.util.regex.Matcher;

class S 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("[a-z&&[def]]");  //intersection 
        Matcher m = p.matcher("mohan is a good friend of mine");

        while(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }
    }
}

// Note : intersection (means) : jo a-z or [def] dono mai common ho  to yaha par ({"def"}) dono mai common hai..

// D:\javaprac\50_pattern_matcher>javac S.java

// D:\javaprac\50_pattern_matcher>java S
// match: d start: 14 end: 15
// match: f start: 16 end: 17
// match: e start: 19 end: 20
// match: d start: 21 end: 22
// match: f start: 24 end: 25
// match: e start: 29 end: 30