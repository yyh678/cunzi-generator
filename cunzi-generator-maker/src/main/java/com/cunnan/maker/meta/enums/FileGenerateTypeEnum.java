package com.cunnan.maker.meta.enums;

/**
 * @author CunNan
 * @Description
 */
public enum FileGenerateTypeEnum {
    DYNAMIC("动态生成","dynamic"),
    STATIC("静态生成","static");

    private String text;

    private String value;

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }

    FileGenerateTypeEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }
}
