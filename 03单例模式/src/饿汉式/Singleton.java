package 饿汉式;

/**
 * @author: GuoZhaoning
 * @description: 基于classloader的解决多线程问题
 * @date: 2020/9/6 19:01
 * 缺点：类加载时就会初始化，浪费内存
 * 优点：没有加锁，效率高
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}
