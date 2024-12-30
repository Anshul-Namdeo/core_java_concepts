import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(ElementType.TYPE)
@interface Indraverma 
{

}

@Indraverma
class O1 
{

}

@Indraverma
interface EE 
{

}

@Indraverma
enum FF 
{

}


/// hapily compile....