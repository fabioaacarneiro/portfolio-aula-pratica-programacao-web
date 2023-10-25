package com.fabioaacarneiro.portfoliodesenvolvimentowebanhanguera.resource.exceptions;

import org.springframework.http.HttpStatus;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class StandardError implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private Date timestamp;
    private HttpStatus status;
    private String error;
    private String message;
    private String path;

    public StandardError(){}

    public StandardError(Date timestamp, HttpStatus status, String error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StandardError that = (StandardError) o;
        return Objects.equals(timestamp, that.timestamp) && Objects.equals(status, that.status) && Objects.equals(error, that.error) && Objects.equals(message, that.message) && Objects.equals(path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, status, error, message, path);
    }
}
