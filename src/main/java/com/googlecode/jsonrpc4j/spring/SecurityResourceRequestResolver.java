package com.googlecode.jsonrpc4j.spring;

import javax.portlet.ResourceRequest;

public interface SecurityResourceRequestResolver {

    void resolveContext(ResourceRequest resourceRequest);

}
