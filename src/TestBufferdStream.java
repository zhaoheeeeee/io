import java.io.*;

/**
 * @Author: Sizhaohe
 * @Date: 2019/4/14 20:49
 */
//见微信图片
//bufferdReader/Writer相当于给FileReader/Writer包装
public class TestBufferdStream {
    public static void main(String[] args) {
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\sizhaohe6688\\Desktop\\test2.dat"));
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\sizhaohe6688\\Desktop\\test2.dat"));
            String s=null;
            for(int i=0;i<=100;i++){
                s=String.valueOf(Math.random());
                bw.write(s);
                bw.newLine();
            }
            bw.flush();
            while ((s=br.readLine())!=null){
                System.out.println(s);
            }
            bw.close();
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
