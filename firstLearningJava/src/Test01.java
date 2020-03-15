import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01 {
    public static void main(String[] args){
        String path = Test01.class.getResource("").getPath();
        File filepath = new File(path + "a.txt");
        try(FileInputStream fi = new FileInputStream(filepath);
            FileOutputStream fo = new FileOutputStream("b.txt");){
            int c = 0;
            while((c = fi.read()) != -1) {
                fo.write(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
