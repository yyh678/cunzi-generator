package com.cunnan.maker.template.model;

import com.cunnan.maker.meta.Meta;
import lombok.Data;

/**
 * @author CunNan
 * @Description 模板生成器配置
 */
@Data
public class TemplateMakerConfig {

    private Long id;

    private String originProjectPath;

    private Meta meta = new Meta();

    TemplateMakerFileConfig fileConfig = new TemplateMakerFileConfig();

    TemplateMakerModelConfig modelConfig = new TemplateMakerModelConfig();

    TemplateMakerOutputConfig outputConfig = new TemplateMakerOutputConfig();
}
