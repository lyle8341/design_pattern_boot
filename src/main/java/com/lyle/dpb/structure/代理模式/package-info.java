/**
 * 应用场景：
 *  - 安全代理：屏蔽对真实角色对直接访问
 *  - 远程代理：通过代理类处理远程方法调用（RMI）
 *  - 延迟加载：先加载轻量级对代理对象，真正需要再加载真实对象
 *    - 比如开发一个大文档查看软件，在打开文件时不可能将所有的图片都显示出来，这样就可以用代理模式？
 * @author lyle 2024-04-18 22:43
 */
package com.lyle.dpb.structure.代理模式;