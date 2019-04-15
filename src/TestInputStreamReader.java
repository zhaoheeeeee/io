import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Sizhaohe
 * @Date: 2019/4/15 10:07
 * @Description 转换流之IutputstreamReader 由iutputstream字节流转换为Reader字符流
 */

public class TestInputStreamReader {
    public static void main(String[] args) {
        InputStreamReader ist=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ist);
        String s=null;
        try{
            s=br.readLine();
            while (s!=null){
                if (s.equalsIgnoreCase("exit")) break;
                System.out.println(s.toUpperCase());
                s=br.readLine();
            }
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
