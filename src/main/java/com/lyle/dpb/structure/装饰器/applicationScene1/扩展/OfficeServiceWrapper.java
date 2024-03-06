package com.lyle.dpb.structure.装饰器.applicationScene1.扩展;

import com.lyle.dpb.structure.装饰器.applicationScene1.常规.OfficeService;

import java.io.Serial;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lyle 2024-01-24 22:47
 */
public class OfficeServiceWrapper extends OfficeServiceDecorator {

    public OfficeServiceWrapper(OfficeService officeServiceImpl) {
        super(officeServiceImpl);
    }

    @Override
    public Map<String, Object> listFj() {
        Map<String, Object> response = new HashMap<>();
        response.put("label", "杭州市");
        response.put("value", "3301");
        response.put("children", new ArrayList<Map<String, Object>>() {
            @Serial
            private static final long serialVersionUID = -8940333104102708377L;

            {
                add(new HashMap<>() {
                    @Serial
                    private static final long serialVersionUID = 1223393612817110232L;

                    {
                        put("label", "余杭区");
                        put("value", "330112");
                        put("children", new ArrayList<>() {
                            @Serial
                            private static final long serialVersionUID = -1434228718478467643L;

                            {
                                add(new HashMap<>() {
                                    @Serial
                                    private static final long serialVersionUID = -3883191576085326223L;

                                    {
                                        put("label", "天上人间");
                                        put("value", "3301129899");
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
        return response;

    }
}