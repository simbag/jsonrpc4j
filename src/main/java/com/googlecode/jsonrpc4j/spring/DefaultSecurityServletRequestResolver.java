package com.googlecode.jsonrpc4j.spring;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.ExecutorService;

public class DefaultSecurityServletRequestResolver implements SecurityServletRequestResolver {
    @Override
    public void resolveContext(HttpServletRequest servletRequest) {
    }

    @Override
    public ExecutorService transformExecutorService(ExecutorService batchExecutorService) {
        return batchExecutorService;
    }
}
