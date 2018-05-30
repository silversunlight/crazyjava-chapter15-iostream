package IOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(
                "src/IOStream/FileInputStreamTest.java"
        );
        byte[] bbuf = new byte[1024];
        //用于保存实际读取的字节数
        int hasRead=0;
        while ((hasRead = fis.read(bbuf)) > 0) {
            System.out.println(new String(bbuf,0,hasRead));
        }
        fis.close();
    }
}
