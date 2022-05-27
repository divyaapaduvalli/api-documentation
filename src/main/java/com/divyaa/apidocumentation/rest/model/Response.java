package com.divyaa.apidocumentation.rest.model;

import java.util.List;

/**
 * @author Divyaa P
 */
public class Response<T> {

    private String message;
    private T data;
    private List<Error> errors;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }
}
