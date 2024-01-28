package com.lyle.dpb.create.单例模式;

import java.util.concurrent.CountDownLatch;

/**
 * @author lyle 2024-01-26 22:57
 */
public class CompareTest {

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        int threadNum = 10;
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100000; j++) {
                    //Object o = LazySingleton.getInstance();
                    //Object o = DclSingleton.getInstance();
                    //Object o = EarlyInitSingleton.getInstance();
                    //Object o = EnumSingleton.INSTANCE;
                    Object o = NSCSingleton.getInstance();
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();

        long end = System.currentTimeMillis();
        System.out.println("耗时: " + (end - start) + "ms");
    }
}