import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @Author: Sizhaohe
 * @Date: 2019/4/15 11:21
 * @Description 打印流 第一根管道未fos  第二根管道 ps包裹在第一根上，如若未改变out的值 system.out.print这跟管道指向dos窗口
 * 而通过setOut  将system.out指向指定文件  涉及三根管道
 */

public class TestPrintStreamOne {
    public static void main(String[] args) {
        PrintStream ps = null;
        try{
            FileOutputStream fos=new FileOutputStream("D:\\sizhaohe\\printstream.dat");
            ps=new PrintStream(fos);
        }catch (IOException e){
            e.printStackTrace();
        }
        if (ps!=null){
            System.setOut(ps);
        }
        for (char c=0;c<=60000;c++){
            System.out.print(c+" ");
        }
    }
}
