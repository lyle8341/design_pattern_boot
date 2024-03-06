package com.lyle.dpb.structure.装饰器.applicationScene1;

import com.lyle.dpb.structure.装饰器.applicationScene1.常规.OfficeService;
import com.lyle.dpb.structure.装饰器.applicationScene1.扩展.OfficeServiceWrapper;

import java.util.Map;

/**
 * @author lyle 2024-01-24 23:06
 */
public class OfficeController {

    private OfficeService officeService;

    public Map<String, Object> getFjlist(){
        ///原来使用方式
        //return officeService.listFj();


        //使用装饰器后
        return new OfficeServiceWrapper(officeService).listFj();
    }

}