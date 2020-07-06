package com.datacubik.springboot.zuul.filters;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PostFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		HttpSession session = request.getSession();

		System.out.println(
				"POST FILTER : Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
		System.out.println("La session del usuario es : " + session);

		return null;
	}
}
