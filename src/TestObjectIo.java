import java.io.*;

/**
 * @Author: Sizhaohe
 * @Date: 2019/4/15 13:27
 * @Description ObjectIO 用于将object对象写入或者输出
 * 在T类中实现了Serializable接口 即实现了对象序列化（将对象转化为字节流，写入硬盘或者网络）
 * 将T类中l用transient修饰 表示序列化暂时不考虑这个成员变量 将值改为0
 */

public class TestObjectIo {
    public static void main(String[] args) throws Exception{
        T t=new T();
        t.l=1;
        FileOutputStream fos=new FileOutputStream("D:\\sizhaohe\\testIo.dat");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(t);
        oos.flush();
        oos.close();

        FileInputStream fis=new FileInputStream("D:\\sizhaohe\\testIo.dat");
        ObjectInputStream ois=new ObjectInputStream(fis);
        T tReader = (T)ois.readObject();
        System.out.println(tReader.d+" "+tReader.l+" "+tReader.j+" "+tReader.k);
    }
}
class T implements Serializable {
    int j=10;
    int k=9;
    int l=8;
    transient double d=2.3;
}
