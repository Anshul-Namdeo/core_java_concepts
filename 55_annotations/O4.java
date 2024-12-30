import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
@interface Bheem 
{

}

@Bheem
class O4 
{

    @Bheem
    int a = 90;

    @Bheem
    O4()
    {

    }

    @Bheem
    void pro()
    {

    }
}

// Note :TYPE(constant) sirf or sirf class, interface, enum or annotation par applicable hai

// Note : FIELD(constant) sirf or sirf varibale Declaration par applicable hai..

// Note : CONSTRUCTOR(constant) sirf or sirf Constructor par applicable hai..

// Note : METHOD(constant) sirf or sirf Methods par applicable hai..

// Hapily compile....