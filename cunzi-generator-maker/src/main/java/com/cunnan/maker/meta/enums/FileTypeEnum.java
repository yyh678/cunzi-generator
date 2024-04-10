package com.cunnan.maker.meta.enums;

import java.nio.file.attribute.GroupPrincipal;

/**
 * @author CunNan
 * @Description
 */
public enum FileTypeEnum {
    DIR("目录","dir"),
    FILE("文件","file"),
    GROUP("文件组","group");

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }

    private final String text;

    private final String value;

    FileTypeEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }
}
