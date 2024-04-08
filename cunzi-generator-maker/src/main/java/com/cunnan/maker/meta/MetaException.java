package com.cunnan.maker.meta;

/**
 * @author CunNan
 * @Description
 */
public class MetaException extends RuntimeException {
    public MetaException(String message) {
        super(message);
    }

    public MetaException(String message, Throwable cause) {
        super(message, cause);
    }
}
