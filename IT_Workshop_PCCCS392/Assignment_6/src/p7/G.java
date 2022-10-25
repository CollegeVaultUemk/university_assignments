package p7;

import java.io.IOException;

public class G {
    void method() throws IOException
    {
        throw new IOException("Device Error.");
    }
}

class H {
    public static void main(String[] args) throws IOException{
        G m = new G();
        m.method();
    }
}