package com.lyle.dpb.behaviour.策略模式;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AFileResolve implements IFileStrategy {
    
    @Override
    public FileTypeResolveEnum gainFileType() {
        return FileTypeResolveEnum.File_A_RESOLVE;
    }

    @Override
    public void resolve(Object objectparam) {
      log.info("A 类型解析文件，参数：{}",objectparam);
      //A类型解析具体逻辑
    }
}