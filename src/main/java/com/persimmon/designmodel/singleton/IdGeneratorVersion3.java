package com.persimmon.designmodel.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author 王跃斌
 * @date 2022/11/4
 *
 * 内部静态类实现单例模式
 */
public class IdGeneratorVersion3 {

    private static IdGeneratorVersion3 instance;

    private AtomicLong id = new AtomicLong(0);

    private static class IdGenerator {
        private static final IdGeneratorVersion3 instance = new IdGeneratorVersion3();
    }

    public IdGeneratorVersion3 getInstance() {
        return IdGenerator.instance;
    }

    public Long getId() {
        return id.incrementAndGet();
    }
}
