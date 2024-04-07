package com.cunnan.model;
import lombok.Data;

/**
 * @author cunnan
 * @Description
 */
@Data
public class DataModel {

    /**
     * 是否生成循环
     */
    private boolean loop  = false;


    /**
     * 作者注释
     */
    private String author  = "cunnan";


    /**
     * 输出信息
     */
    private String outputText  = "sum = ";

}