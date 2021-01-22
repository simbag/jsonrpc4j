package com.googlecode.jsonrpc4j.spring;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface SecurityServletRequestResolver {

    Authentication getContext(HttpServletRequest servletRequest);

}
