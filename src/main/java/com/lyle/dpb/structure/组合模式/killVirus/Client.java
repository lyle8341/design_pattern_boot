package com.lyle.dpb.structure.组合模式.killVirus;

/**
 * @author lyle 2024-04-20 17:47
 */
public class Client {

    public static void main(String[] args) {
        AbstractFile f2,f3,f4,f5,f6;
        Folder f1 = new Folder("我的收藏");
        f2 = new ImageFile("高清壁纸.jpg");
        f3 = new TextFile("Hello.java");
        f1.add(f2);
        f1.add(f3);

        //f2.killVirus();

        Folder f11 = new Folder("电影");
        f4 = new VideoFile("你想活出怎样的人生.mkv");
        f5 = new VideoFile("功夫熊猫.mkv");
        f11.add(f4);
        f11.add(f5);

        f1.add(f11);

        f1.killVirus();
    }
}