package com.lyle.dpb.structure.装饰器.applicationScene1.扩展;


import com.lyle.dpb.structure.装饰器.applicationScene1.常规.OfficeService;

import java.util.Map;

/**
 * @author lyle 2024-01-24 22:45
 */
public class OfficeServiceDecorator implements OfficeService {

    private final OfficeService officeServiceImpl;

    public OfficeServiceDecorator(OfficeService officeServiceImpl) {
        this.officeServiceImpl = officeServiceImpl;
    }

    @Override
    public Map<String, Object> listFj() {
        return officeServiceImpl.listFj();
    }
}