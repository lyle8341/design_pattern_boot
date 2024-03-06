package com.lyle.dpb.create.原型模式.序列化_反序列化;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 通过序列化深克隆对象
 *
 * @author lyle 2024-02-05 20:18
 */
public class DeepCloneBySerializableUtil {


    /**
     * serialize_deserialize
     *
     * @param t 需要生成的原型
     */
    @SuppressWarnings("unchecked")
    public static <T> T deepCloneBySerializable(T t) {
        T clone = null;
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            //Output an instance to memory
            oos.writeObject(t);
            oos.flush();

            try (ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                 ObjectInputStream ois = new ObjectInputStream(bis)) {
                //Read instance from memory
                clone = (T) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return clone;
    }
}