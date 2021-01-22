package com.googlecode.jsonrpc4j.spring;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public class DefaultSecurityServletRequestResolver implements SecurityServletRequestResolver {
    @Override
    public Authentication getContext(HttpServletRequest servletRequest) {
        return null;
    }
}
