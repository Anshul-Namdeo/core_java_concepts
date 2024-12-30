@FunctionalInterface
interface X2 {
    void pro();
}

@FunctionalInterface
interface D1 extends X2 
{
    // void info();
}


// hapily compile ..

// errorisliye nhi aaya kyoki hum ne child ki declared method ko comment kar diya hai to ab sirf usa ke parent ki hi declared method hai  to ab multiple abstract method nhi hai