import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z9 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("[0-9]{10}");
        Matcher m = p.matcher("1234567890");

        if(m.matches())
        {
            System.out.println("match: " + m.group() + " start: " + m.start() + " end: " + m.end());
        }else{
            System.out.println("No match");
        }
    }
}


// D:\javaprac\50_pattern_matcher>javac Z9.java

// D:\javaprac\50_pattern_matcher>java Z9
// match: 1234567890 start: 0 end: 10


// NOTE : 1234567890 eaisa to koi no. hota nhi hai jitne bhi no. hai wo may be(6,7,8,9) se start hote hai to usa ke liye hame ek logic likh na padhega.