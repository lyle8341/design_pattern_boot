package com.lyle.dpb.create.原型模式.序列化_反序列化;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.Date;

/**
 * @author lyle 2024-02-03 21:04
 */
@Getter
@Setter
public class Sheep implements Serializable {

    @Serial
    private static final long serialVersionUID = -7491222853516979080L;
    private String name;

    private Date birthday;


    public static void main(String[] args) throws Exception{
        Sheep s = new Sheep();
        s.setName("山羊");
        s.setBirthday(new Date());
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s);

        byte[] byteArray = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(byteArray);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep o = (Sheep) ois.readObject();
        System.out.println(o);

    }
}