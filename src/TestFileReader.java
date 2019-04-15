import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;
import sun.nio.cs.ext.GBK;
import sun.text.normalizer.UTF16;

import java.io.*;

/**
 * @Author: Sizhaohe
 * @Date: 2019/4/14 19:28
 */

public class TestFileReader {
    public static void main(String[] args) throws Exception {

        int c=0;

            //fr=new FileReader("D:\\Workspace\\day18\\src\\cn\\itcase\\demo01\\Person.java");
            InputStreamReader inputStreamReader =
                    new InputStreamReader(new FileInputStream(
                            "D:\\Workspace\\day18\\src\\cn\\itcase\\demo01\\Person.java"),"GBK");
            while ((c=inputStreamReader.read())!=-1){
                System.out.print((char)c);
            }
            inputStreamReader.close();

        }
    }
