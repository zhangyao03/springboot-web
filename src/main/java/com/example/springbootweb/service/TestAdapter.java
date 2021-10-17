package com.example.springbootweb.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author alfred.zhang
 * @date 2021/10/15
 */
public class TestAdapter extends AbstractHandlerMethodAdapter {

    @Override
    protected boolean supportsInternal(HandlerMethod handlerMethod) {
        return true;
    }


    @Override
    protected ModelAndView handleInternal(HttpServletRequest request,
                                          HttpServletResponse response, HandlerMethod handlerMethod) throws Exception {



        return null;
    }

    @Override
    @SuppressWarnings("deprecation")
    protected long getLastModifiedInternal(HttpServletRequest request, HandlerMethod handlerMethod) {
        return -1;
    }

}
