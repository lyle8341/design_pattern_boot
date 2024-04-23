package com.lyle.dpb.structural.组合模式.killVirus;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象组件
 * @author lyle 2024-04-20 12:59
 */
public interface AbstractFile {

    void killVirus();
}

//叶子节点
class ImageFile implements AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("---image file: " + name + "，进行扫描");
    }
}

//叶子节点
class TextFile implements AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("---text file: " + name + "，进行扫描");
    }
}

//叶子节点
class VideoFile implements AbstractFile {

    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("---video file: " + name + "，进行扫描");
    }
}

class Folder implements AbstractFile {

    private String name;

    public Folder(String name) {
        this.name = name;
    }

    //定义容器，用来存放本容器构建下的子节点
    private List<AbstractFile> list = new ArrayList<>();

    @Override
    public void killVirus() {
        System.out.println("文件夹 " + name + " 进行扫描");
        for (AbstractFile file : list) {
            file.killVirus();
        }
    }

    public void add(AbstractFile file){
        list.add(file);
    }

    public void remove(AbstractFile file){
        list.remove(file);
    }

    public AbstractFile getChild(int index){
        return list.get(index);
    }
}