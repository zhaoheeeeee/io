import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: Sizhaohe
 * @Date: 2019/4/14 19:12
 */

public class TestFileOutputStream {
    public static void main(String[] args) {
        int b=0;
        FileInputStream in=null;
        FileOutputStream out=null;
        try{
            in=new FileInputStream("D:\\Workspace\\day18\\src\\cn\\itcase\\demo01\\Person.java");
            out=new FileOutputStream("D:\\Workspace\\day18\\src\\cn\\itcase\\demo01\\PersonCopy.java");
            while ((b=in.read())!=-1){
                out.write(b);
            }
            in.close();
            out.close();
        }catch (FileNotFoundException e2){
            System.out.println("找不到指定文件");
            System.exit(-1);
        }catch (IOException e1){
            System.out.println("文件复制错误");
            System.exit(-1);
        }
        System.out.println("文件已复制！");
    }
}
