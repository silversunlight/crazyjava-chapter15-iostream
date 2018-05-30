package FileClass;

import java.io.File;
//列出当前目录下，所有以.java结尾的文件
public class FileNameFilter {
    public static void main(String[] args) {
        File file = new File(".");
        //lambda表达式 FileFilter 接口的accept方法
        String[] nameList = file.list((dir, name) -> name.endsWith(".java"));
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
