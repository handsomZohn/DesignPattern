package celuemoshi.duck;

import celuemoshi.fly.FlyWithWings;
import celuemoshi.quack.Quack;

/**
 * 正常的鸭子 会飞 会叫的 鸭子
 * Created by zohn on 2017/11/10.
 */
public class MallarDuck extends Duck {
    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("I'm really Mallard duck");
    }
}
