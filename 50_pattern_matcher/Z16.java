import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z16
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("^[A-Za-z0-9\\._%+\\-]+@[A-Za-z0-9\\.\\-]+\\.[A-Za-z]{2,}$");
        Matcher m = p.matcher("mohan-das23@gmail.com is my mail id");

        // if(m.matches())
        if(m.find())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }else{
            System.out.println("NO match");
        }
    }
}



// D:\javaprac\50_pattern_matcher>javac Z16.java

// D:\javaprac\50_pattern_matcher>java Z16
// NO match                                (matches() method ka output)

// D:\javaprac\50_pattern_matcher>javac Z16.java

// D:\javaprac\50_pattern_matcher>java Z16
// NO match                                  (find() method ka output)