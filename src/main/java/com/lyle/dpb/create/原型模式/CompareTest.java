package com.lyle.dpb.create.原型模式;

import com.lyle.dpb.create.原型模式.序列化_反序列化.DeepCloneBySerializableUtil;

import java.io.Serial;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/**
 * 比较测试
 *
 * @author lyle 2024-02-05 19:29
 */
public class CompareTest {

    public static void main(String[] args) {
        testNew(1000);
        testClone(1000);
        testSerializeClone(1000);
    }

    private static void testSerializeClone(int size) {
        Laptop laptop = new Laptop();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Laptop ignore = DeepCloneBySerializableUtil.deepCloneBySerializable(laptop);
        }
        long end = System.currentTimeMillis();
        System.out.println("testSerializeClone 耗时: " + (end - start) + " 毫秒");
    }

    private static void testNew(int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Laptop ignore = new Laptop();
        }
        long end = System.currentTimeMillis();
        System.out.println("testNew 耗时: " + (end - start) + " 毫秒");
    }

    private static void testClone(int size) {
        Laptop laptop = new Laptop();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Laptop ignore = laptop.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("testClone 耗时: " + (end - start) + " 毫秒");
    }

    static class Laptop implements Cloneable, Serializable {
        @Serial
        private static final long serialVersionUID = 234264543844118076L;

        public Laptop() {
            try {
                //模拟创建对象耗时过程
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public Laptop clone() {
            try {
                return (Laptop) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }
}