import java.util.Random;

/**
 * Created by namercx on 2016/11/18.
 */
public class Philosopher extends Thread {
    Waiter waiter = null;
    int seat;

    //设定名字，座位，和公用的服务员
    public Philosopher(String name, int seat, Waiter waiter) {
        super(name);
        this.waiter = waiter;
        this.seat = seat;
    }

    public void run() {
        //服务员类的停止标志，初始为true
        while (waiter.flag) {
            //判断有没有筷子
            if (waiter.judgement(seat)) {
                //判断面有没有
                if (waiter.noodles == 0) {
                    waiter.flag = false;
                    System.out.println(Thread.currentThread().getName() + "拿起了筷子，但面没了");
                } else {
                    System.out.println(Thread.currentThread().getName() + "拿起了筷子，并开始吃面");
                    waiter.noodles--;
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "吃完了,并开始思♂考"+"——"+think());
                    //放下筷子
                    waiter.end(seat);
                    try {
                        Thread.sleep(1100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    //拿来玩的
    public String think() {
        int num = new Random().nextInt(8);
        switch (num) {
            case 0:
                return "啊♂乖乖站♂好";
            case 1:
                return "这个世界太♂乱";
            case 2:
                return "幻♂想♂乡";
            case 3:
                return "吼吼吼♂全给党";
            case 4:
                return "帕秋莉♂GO♂";
            case 5:
                return "Deep♂Dark♂Fantasy";
            case 6:
                return "♂易建联!易建联♂";
            case 7:
                return "Ass♂we♂can";
        }
        return "我是谁？从哪里来？";
    }
}