package 懒汉式;

/**
 * @author: GuoZhaoning
 * @description: 加锁安全的懒汉式
 * @date: 2020/9/6 18:57
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {

    }

    public static synchronized Singleton2 getInstance() {
        if (null == instance) {
            return new Singleton2();
        }
        return instance;
    }
}
