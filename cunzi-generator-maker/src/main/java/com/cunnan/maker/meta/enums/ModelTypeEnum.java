package com.cunnan.maker.meta.enums;

/**
 * @author CunNan
 * @Description
 */
public enum ModelTypeEnum {
    SRTING("字符串","string"),
    BOOLEAN("布尔","boolean");

    private String text;

    private String value;

    ModelTypeEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }
}
