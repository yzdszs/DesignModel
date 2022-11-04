package com.persimmon.designmodel.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author 王跃斌
 * @date 2022/11/4
 *
 * 懒汉式: 支持延迟加载，但是有性能问题，因为给getInstance加了一把大锁。
 */
public class IdGeneratorVersion1 {

    private static IdGeneratorVersion1 instance;

    private AtomicLong id = new AtomicLong(0);

    private IdGeneratorVersion1() {}

    public static synchronized IdGeneratorVersion1 getInstance() {
        if (instance == null) {
            instance = new IdGeneratorVersion1();
        }
        return instance;
    }

    public Long getId() {
        return id.incrementAndGet();
    }
}
