import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: Sizhaohe
 * @Date: 2019/4/14 20:11
 */

public class TestFileWriter {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream("C:\\Users\\sizhaohe6688\\Desktop\\test.dat");
            for (int i=0;i<50000;i++){
                fileOutputStream.write(i);
            }
            fileOutputStream.close();
        } catch (FileNotFoundException e1) {
            System.out.println("文件未找到！");
        }catch (IOException e2){
            System.out.println("io异常");
        }
    }

}
