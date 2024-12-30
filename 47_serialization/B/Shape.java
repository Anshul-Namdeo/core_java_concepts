import java.io.Serializable;

class Shape implements Serializable 
{
    int length;
    int width;
    int height;

    Shape(int length, int width, int height)
    {
        this.length = length;
        this.width = width ;
        this.height = height;
    }
}

// agar hum Shape class ko serialize nhi karenge to jb hum usa ko kissi dusri class mai usa ka object bana ke usa ki property ko serialize krna chahenge (writeObject) method ke throw to hum eaisa nhi kr payenge or (notSerializble Exception bhi aa jayega) isliye hum ne shape class ko serializable mark kiya hai..


// Serializable ek intrface hai jiss ko (sari numerical wrapper class se implements kiya hai) String class se or Hashmap ne bhi ..

// ye ek marker interface hai...