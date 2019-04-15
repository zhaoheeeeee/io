import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Author: Sizhaohe
 * @Date: 2019/4/15 9:44
 * @Description: 转换流之OutputstreamWriter 由outputstream字节流转换为Writer字符流
 */

public class TestOutputStreamWriter {
    public static void main(String[] args) {
        try{
            OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("D:\\sizhaohe\\test.txt"));
            osw.write("todayisAprilfifteen");
            System.out.println(osw.getEncoding());
            osw.close();
            //true这枚参数表示继续在光标位置写，没有true则表示新建test.txt文件重写
            osw=new OutputStreamWriter(new FileOutputStream("D:\\sizhaohe\\test.txt",true));
            osw.write("enjoy today");
            osw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
