/**
 * <p>反射破解单例(不包含枚举)----> 解决方法: 在构造器方法中手动抛出异常控制</p>
 * {@link com.lyle.dpb.create.单例模式.LazySingleton#LazySingleton()}
 * <pre>
 *     {@code
 *          private LazySingleton() {
 *              if(null != instance){
 *                  throw new RuntimeException();
 *              }
 *          }
 *     }
 * </pre>
 *
 * <h2>Usage Examples</h2>
 *
 * <a href="package-summary.html#MemoryVisibility"><i>斜体字书写</i></a>
 *
 * <p>反序列化破解单例(不包含枚举)----> 解决方法: 定义readResolve()防止获得不同对象</p>
 *
 * @author lyle 2024-01-25 23:43
 */
package com.lyle.dpb.create.单例模式.crack;