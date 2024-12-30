import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z12 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("[6-9][0-9]{9}");
        Matcher m = p.matcher("1234567890");

        if(m.matches())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }else{
            System.out.println("no match");
        }
    }
}


// D:\javaprac\50_pattern_matcher>javac Z12.java

// D:\javaprac\50_pattern_matcher>java Z12
// no match