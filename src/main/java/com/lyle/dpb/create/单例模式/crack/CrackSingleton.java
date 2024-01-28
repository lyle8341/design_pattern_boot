package com.lyle.dpb.create.单例模式.crack;

import com.lyle.dpb.create.单例模式.DraconianSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 破解单例
 *
 * @author lyle 2024-01-25 23:47
 */
public class CrackSingleton {

    public static void main(String[] args) throws Exception {
        DraconianSingleton i1 = DraconianSingleton.getInstance();
        //DraconianSingleton i2 = DraconianSingleton.getInstance();
        //System.out.println(i2 == i1);

        //reflectCrack();
        deserialize(i1);
    }

    /**
     * {@code DraconianSingleton.#readResolve()}
     */
    private static void deserialize(DraconianSingleton i1) throws Exception {
        String dir = "/tmp/serial.txt";
        try (FileOutputStream fos = new FileOutputStream(dir);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(i1);
        }
        try (FileInputStream fis = new FileInputStream(dir);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            DraconianSingleton i2 = (DraconianSingleton) ois.readObject();
            System.out.println(i2 == i1);
        }
    }

    @SuppressWarnings("unchecked")
    private static void reflectCrack() throws Exception {
        Class<DraconianSingleton> clazz = (Class<DraconianSingleton>) Class.forName("com.lyle.dpb.create.单例模式.LazySingleton");
        Constructor<DraconianSingleton> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        DraconianSingleton i3 = constructor.newInstance();
        DraconianSingleton i4 = constructor.newInstance();
        System.out.println(i3 == i4);
    }


}