package FileClass;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        //以当前路径创建一个File对象
        File file = new File(".");
        //直接获取文件名，输出“.”
        System.out.println(file.getName());
        //获取相对路径的父路径，可能出错，输出null
        System.out.println(file.getParent());
        //获取绝对路径
        System.out.println(file.getAbsoluteFile());
        //获取上一级路径
        System.out.println(file.getAbsoluteFile().getParent());
        //在当前路径下创建一个临时文件
        File tmpFile = File.createTempFile("aaa", ".txt", file);
        //指定当JVM退出是删除该文件
        tmpFile.deleteOnExit();
        //以系统当前时间作为新文件名来创建新文件
        File newfile = new File(System.currentTimeMillis() + "");
        System.out.println("new file exists or not: " + newfile.exists());
        //以指定newfile对象来创建一个新文件
        newfile.createNewFile();
        //以newfile对象来创建一个目录，因为newfile已经存在，所以此方法返回false
        newfile.mkdir();
        //使用list列出当前路径下的所有文件和路径
        String[] fileList = file.list();
        System.out.println("当前路径下的所有文件");
        for (String filename : fileList) {
            System.out.println(filename);
        }
        //listroots()静态方法列出所有的磁盘根路径
        File[] roots = File.listRoots();
        System.out.println("所有根路径");
        for (File root : roots) {
            System.out.println(root);
        }
    }
}
