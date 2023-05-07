package com.di.classloadertester;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author liudi
 */
public class Child extends Base {
    Logger logger = Logger.getLogger(Child.class.getName());

    private static int p;
    public int s;

    static {
        System.out.println("【子】类p的默认值为" + Integer.toString(p));
        System.out.println("【子】类静态代码块");
        p = 2;
    }

    {
        logger.setLevel(Level.ALL);
        System.out.println("【子】类实例代码块" + Integer.toString(s));
        s = 1;
    }

    public Child() {
        logger.info("logger info test");
        System.out.println("【子】类构造方法" + Integer.toString(s));
        s = 2;
    }

    @Override
    public void m1() {
        System.out.println("【子】类实例代码方法 m1. p=" + Integer.toString(s) + " s=" + Integer.toString(s));
    }


}
