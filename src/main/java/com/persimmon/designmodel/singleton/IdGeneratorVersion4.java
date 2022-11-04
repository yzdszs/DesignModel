package com.persimmon.designmodel.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author 王跃斌
 * @date 2022/11/4
 *
 * 枚举实现单例模式
 */
public enum IdGeneratorVersion4 {
    /**
     * 实例
     */
    INSTANCE;

    private AtomicLong id = new AtomicLong(0);

    public Long getId() {
        return id.incrementAndGet();
    }
}
