import java.io.*;
import java.util.Date;

/**
 * @Author: Sizhaohe
 * @Date: 2019/4/15 11:45
 */

public class TestPrintStreamTwo {
    public static void main(String[] args) {
        String s=null;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            FileWriter fw=new FileWriter("D:\\sizhaohe\\printstreamtwo.log",true);
            PrintWriter log=new PrintWriter(fw);
            while ((s=br.readLine())!=null){
                if (s.equalsIgnoreCase("exit")) break;
                System.out.println(s.toUpperCase());
                log.println("----");
                log.println(s.toUpperCase());
                log.flush();
            }
            log.println("==="+new Date()+"===");
            log.flush();
            log.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
