/**
 * Created by namercx on 2016/11/18.
 */
public class Main {
    public static void main(String[] args) {
        //公用一个对象，一份面
        Waiter waiter = new Waiter();
        Philosopher ph1 = new Philosopher("哲学家A", 0, waiter);
        Philosopher ph2 = new Philosopher("哲学家B", 1, waiter);
        Philosopher ph3 = new Philosopher("哲学家C", 2, waiter);
        Philosopher ph4 = new Philosopher("哲学家D", 3, waiter);
        Philosopher ph5 = new Philosopher("哲学家E", 4, waiter);
        ph1.start();
        ph2.start();
        ph3.start();
        ph4.start();
        ph5.start();
    }
}
