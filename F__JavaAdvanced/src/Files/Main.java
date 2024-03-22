package Files;
import java.io.File;
public class Main {
    public static void main(String[] args) {
        File file = new File("hello world.txt");//enter the full path (absolute path)
        if(file.exists()){//check if the file exists
            System.out.println("your file is exist in path :) !");
            System.out.println(file.getAbsolutePath());//get the full path o the file
            System.out.println(file.getPath());//get the minimized file path
            System.out.println(file.isFile());//check if the file if a file not  FOLDER
            file.delete();//delete the file
        }else {
            System.out.println("your file does not exist in path :( !");}}}
