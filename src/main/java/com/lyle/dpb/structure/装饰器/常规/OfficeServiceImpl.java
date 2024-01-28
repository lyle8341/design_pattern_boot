package com.lyle.dpb.structure.装饰器.常规;


import java.io.Serial;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lyle 2024-01-24 22:38
 */
public class OfficeServiceImpl implements OfficeService {

    /**
     * 两级机构
     */
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
                put("value","330112");
            }});
        }});
        return response;
    }


}