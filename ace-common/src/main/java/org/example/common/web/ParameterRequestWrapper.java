package org.example.common.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class ParameterRequestWrapper extends HttpServletRequestWrapper {
    public ParameterRequestWrapper(HttpServletRequest request) {
        super(request);
    }
}
