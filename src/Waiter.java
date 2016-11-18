/**
 * Created by namercx on 2016/11/18.
 */
public class Waiter {
    boolean flag=true;
    boolean[] chopsticks=new boolean[]{true, true, true, true, true};
    int noodles = 30;

    public synchronized boolean judgement(int num){
        if (num == 4) {
            if (chopsticks[4] && chopsticks[0]) {
                chopsticks[4] = false;
                chopsticks[0] = false;
                return true;
            }
        }else if(chopsticks[num] && chopsticks[num + 1]) {
                chopsticks[num] = false;
                chopsticks[num + 1] = false;
                return true;
            }
        return false;
    }

    public void end(int num){
        if (num == 4) {
            chopsticks[4] = true;
            chopsticks[0] = true;
        }else{
            chopsticks[num] = true;
            chopsticks[num + 1] = true;
        }
    }
}
