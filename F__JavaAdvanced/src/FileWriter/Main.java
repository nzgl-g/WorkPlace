package FileWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter writer = new FileWriter("hello world.txt");
            writer.write("string");
            writer.close();
        }catch (IOException e){}
    }
}
