package IOStream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("src/IOStream/FileReaderTest.java")) {
            //cbuf的长度决定了输出时候每一行的长度
            char[] cbuf = new char[10];
            int hasRead=0;
            while ((hasRead = fr.read(cbuf)) > 0) {
                System.out.println(new String(cbuf,0,hasRead));
            }
        }
    }
}
