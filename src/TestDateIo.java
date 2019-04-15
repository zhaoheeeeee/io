import java.io.*;

/**
 * @Author: Sizhaohe
 * @Date: 2019/4/15 10:44
 * @Description DateIo 数据流 帮助我们用于转换java原始数据类型
 * double 8个字节 boolean一个字节  所以bais.available()共9个字节  注意读写顺序（队列）
 */

public class TestDateIo {
    public static void main(String[] args) {
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        DataOutputStream dos=new DataOutputStream(baos);
        try{
            dos.writeDouble(Math.random());
            dos.writeBoolean(true);
            //队列中的内容转换成字节数组
            ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
            System.out.println(bais.available());
            DataInputStream dis=new DataInputStream(bais);
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            dos.close();
            dis.close();;
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
