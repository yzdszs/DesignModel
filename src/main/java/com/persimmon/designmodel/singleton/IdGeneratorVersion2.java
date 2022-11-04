package com.persimmon.designmodel.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author 王跃斌
 * @date 2022/11/4
 *
 * 双重检测：懒汉式获取实例时的锁的力度太大，有性能问题，可以使用双重检测，减小锁的力度
 */
public class IdGeneratorVersion2 {

    private static IdGeneratorVersion2 instance;

    private AtomicLong id = new AtomicLong(0);

    private IdGeneratorVersion2() {}

    public static IdGeneratorVersion2 getInstance() {
        if (instance == null) {
            synchronized (IdGeneratorVersion2.class) {
                if (instance == null) {
                    instance = new IdGeneratorVersion2();
                }
            }
        }
        return instance;
    }

    public Long getId() {
        return  id.incrementAndGet();
    }


}
