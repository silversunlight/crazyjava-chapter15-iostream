package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//把当前文件写入另外一个文件
public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("src/IOStream/FileOutputStreamTest.java");
             FileOutputStream fos = new FileOutputStream("newfile.txt")) {
            byte[] bbuf = new byte[32];
            int hasRead = 0;
            while ((hasRead = fis.read(bbuf)) > 0) {
                fos.write(bbuf, 0, hasRead);
            }
            fos.flush();
        }
    }
}
