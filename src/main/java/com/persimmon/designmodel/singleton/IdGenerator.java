package com.persimmon.designmodel.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author 王跃斌
 * <p>
 * 单例模式
 * 使用场景：1.处理资源访问冲突、2，表示全局唯一类
 * 例子：Id生成器
 * <p>
 * 饿汉式：在类初始化的时候初始化实例,实例的初始化不存在线程安全问题
 */
public class IdGenerator {

    private static final IdGenerator instance = new IdGenerator();

    private AtomicLong id = new AtomicLong(0);

    private IdGenerator() {}

    public static IdGenerator getIdGenerator() {
        return instance;
    }

    public Long getId() {
        return id.incrementAndGet();
    }
}
