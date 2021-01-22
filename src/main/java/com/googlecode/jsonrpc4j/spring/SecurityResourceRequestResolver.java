package com.googlecode.jsonrpc4j.spring;

import org.springframework.security.core.Authentication;

import javax.portlet.ResourceRequest;

public interface SecurityResourceRequestResolver {

    Authentication getContext(ResourceRequest resourceRequest);

}
