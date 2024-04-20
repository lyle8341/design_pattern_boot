package com.lyle.dpb.structure.桥接模式.未使用桥接模式;

/**
 * @author lyle 2024-04-19 21:44
 */
public interface Computer {

    void sale();
}

class DeskTop implements Computer {

    @Override
    public void sale() {
        System.out.println("销售台式机");
    }
}

class Laptop implements Computer {

    @Override
    public void sale() {
        System.out.println("销售笔记本");
    }
}

class Pad implements Computer {

    @Override
    public void sale() {
        System.out.println("销售pad");
    }
}

class LenovoDesktop extends DeskTop {
    @Override
    public void sale() {
        System.out.println("销售联想台式机");
    }
}

class LenovoLaptop extends Laptop {
    @Override
    public void sale() {
        System.out.println("销售联想笔记本");
    }
}

class LenovoPad extends Pad {
    @Override
    public void sale() {
        System.out.println("销售联想pad");
    }
}

class ShenzhouDesktop extends DeskTop {
    @Override
    public void sale() {
        System.out.println("销售神舟台式机");
    }
}

class ShenzhouLaptop extends Laptop {
    @Override
    public void sale() {
        System.out.println("销售神舟笔记本");
    }
}

class ShenzhouPad extends Pad {
    @Override
    public void sale() {
        System.out.println("销售神舟pad");
    }
}

class DellDesktop extends DeskTop {
    @Override
    public void sale() {
        System.out.println("销售戴尔台式机");
    }
}

class DellLaptop extends Laptop {
    @Override
    public void sale() {
        System.out.println("销售戴尔笔记本");
    }
}

class DellPad extends Pad {
    @Override
    public void sale() {
        System.out.println("销售戴尔pad");
    }
}