package com.di.classloadertester;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class Base {
    private static final Log log = LogFactory.getLog(Base.class);

    private static int p;
    public int s;

    static {
        System.out.println("【父】类p的默认值为" + Integer.toString(p));
        System.out.println("【父】类静态代码块");
        p = 2;
    }

    {
        log.info("apache.commons.logging.Base");
        System.out.println("【父】类实例代码块" + Integer.toString(s));
        s += 1;
    }

    public Base() {
        System.out.println("【父】类基类构造方法" + Integer.toString(s));
        s += 2;
    }

    public void m1() {
        System.out.println("【父】类实例代码方法 m1. p=" + Integer.toString(s) + " s=" + Integer.toString(s));
    }

}
