import java.util.List;
import java.util.ArrayList;

class Z1 
{
    public static void main(String args[])
    {
        List<Integer> x = new ArrayList<Integer>();

// Note : List ek interface hai or usa ki childclass ArrayList hai to hum List variavle x ko  ArrayList ke variable y mai holder nhi kr payenge  kyo ArrayList child type hai or List parent type hai .. agar hum ko List variable x ko ArrayList variable y mai hold krna hai to hum ko List ke variable ko type (cast) krna padehga ArrayList mai.

        ArrayList<Integer> y = (ArrayList) x;


    }
}

     //   happily comile and run


     // compile krne par waring ka rahi hai kyoki jo ArrayList hai wo <> typesafe hai isliye jub hum List ke variable x ko (Cast kar rahe hai to hame use bhi <> typesafety ke sath hi Cast krna padhega to waring nhi aayehi )