import java.io.*;

public class R03_NUM03_J {

    public static long getInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println(getInteger(new DataInputStream(new FileInputStream("inputStream.txt"))));
    }

}
