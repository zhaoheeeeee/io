import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: Sizhaohe
 * @Date: 2019/4/14 16:24
 */

public class TestFileInputStream {
    public static void main(String[] args) {
        int b=0;
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=new FileInputStream("D:\\Workspace\\day18\\src\\cn\\itcase\\demo01\\Person.java");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            long num=0;
            while((b=fileInputStream.read())!=-1){
                System.out.print((char)b);
                num++;
            }
            fileInputStream.close();
        }catch (IOException e1){
            System.out.println("文件读取错误");
            System.exit(-1);
        }

    }
}
