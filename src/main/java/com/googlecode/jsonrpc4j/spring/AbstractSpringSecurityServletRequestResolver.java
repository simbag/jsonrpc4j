package com.googlecode.jsonrpc4j.spring;

import org.springframework.security.concurrent.DelegatingSecurityContextExecutorService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.ExecutorService;

public abstract class AbstractSpringSecurityServletRequestResolver implements SecurityServletRequestResolver {

    @Override
    public void resolveContext(HttpServletRequest request) {
        SecurityContextHolder.getContext().setAuthentication(getContext(request));
    }

    @Override
    public ExecutorService transformExecutorService(ExecutorService batchExecutorService) {
        if (batchExecutorService == null || batchExecutorService instanceof DelegatingSecurityContextExecutorService) {
            return batchExecutorService;
        } else {
            return new DelegatingSecurityContextExecutorService(batchExecutorService);
        }
    }

    public abstract Authentication getContext(HttpServletRequest resourceRequest);
}
