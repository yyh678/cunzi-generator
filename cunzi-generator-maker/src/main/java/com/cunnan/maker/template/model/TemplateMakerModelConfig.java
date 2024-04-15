package com.cunnan.maker.template.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.lang.model.element.NestingKind;
import java.util.List;

/**
 * @author CunNan
 * @Description
 */
@Data
public class TemplateMakerModelConfig {

    private List<ModelInfoConfig> models;

    private ModelGroupConfig modelGroupConfig;

    @Data
    @NoArgsConstructor
    public static class ModelInfoConfig {

        private String path;

        private String type;

        private String description;

        private Object defaultValue;

        private String abbr;

        private String replaceText;
    }

    @Data
    public static class ModelGroupConfig {

        private String condition;

        private String groupKey;

        private String groupValue;
    }
}
