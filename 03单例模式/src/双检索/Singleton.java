package 双检索;

/**
 * @author: GuoZhaoning
 * @description: 双检索
 * @date: 2020/9/6 19:04
 */
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance) {
                    return new Singleton();
                }
            }
        }
        return instance;
    }
}
