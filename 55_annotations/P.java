import java.lang.annotation.Target;
// import java.lang.annotation.ElementType;
import static java.lang.annotation.ElementType.*;

@Target({TYPE,FIELD,CONSTRUCTOR,METHOD})
@interface Indumati 
{

}

@Indumati 
class P 
{

    @Indumati
    int e = 90;

    @Indumati
    P()
    {

    }

    @Indumati
    void pro()
    {

    }
}

// hapily compile....