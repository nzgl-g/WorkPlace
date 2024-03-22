package FileReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader("C:\\Users\\YOUNES\\eclipse-workspace\\hello wold .txt");
            int data=reader.read();
            while (data != -1){
                System.out.print((char) data);
                data= reader.read();
            }reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
