package IOStream;

import java.io.FileWriter;
import java.io.IOException;

//直接输出字串内容
public class FIleWriterTest {
    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("poem.txt")) {
            fw.write("呀儿呦\r\n");
            fw.write("横眉冷对撒子欧，\r\n");
            fw.write("俯首甘为呀儿呦。\r\n");
        }
    }
}
