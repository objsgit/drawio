package com.mxgraph.online;

import jakarta.servlet.ServletContext;

public class SecretFacade {

	public static String getSecret(String key, ServletContext ctx) {
		return ctx.getInitParameter(key);
	}
}
