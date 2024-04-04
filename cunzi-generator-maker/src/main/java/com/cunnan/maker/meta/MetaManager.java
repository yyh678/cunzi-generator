package com.cunnan.maker.meta;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONUtil;

/**
 * @author CunNan
 * @Description
 */
public class MetaManager {

    // volatile 保证多线程情况的的内存可见性
    private static volatile Meta meta;

    private MetaManager() {// 私有构造，防止被外部侵入
    }

    // 双重检查, 保证线程安全, 不让对象初始化两次
    public static Meta getMetaObject() {
        if (meta == null) {
            synchronized (MetaManager.class) {
                if (meta == null) {
                    meta = initMeta();
                }
            }
        }
        return meta;
    }

    private static Meta initMeta() {
        String metaJson =  ResourceUtil.readUtf8Str("meta.json");
        Meta newMeta =  JSONUtil.toBean(metaJson, Meta.class);
        Meta.FileConfig fileConfig = newMeta.getFileConfig();
        return newMeta;
    }


    public static void main(String[] args) {

    }

}
