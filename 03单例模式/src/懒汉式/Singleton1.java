package 懒汉式;

/**
 * @author: GuoZhaoning
 * @description: 不安全的懒汉式
 * @date: 2020/9/6 18:54
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (null == instance) {
            return new Singleton1();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        System.out.println(singleton1);
    }
}
