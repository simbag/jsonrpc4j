package com.googlecode.jsonrpc4j.spring;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.ExecutorService;

public interface SecurityServletRequestResolver {

    void resolveContext(HttpServletRequest servletRequest);

    ExecutorService transformExecutorService(ExecutorService batchExecutorService);
}
