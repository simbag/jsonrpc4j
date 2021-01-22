package com.googlecode.jsonrpc4j.spring;

import org.springframework.security.core.Authentication;

import javax.portlet.ResourceRequest;

public class DefaultSecurityResourceRequestResolver implements SecurityResourceRequestResolver {
    @Override
    public Authentication getContext(ResourceRequest resourceRequest) {
        return null;
    }
}
