package com.mxgraph.online;

import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.spi.CachingProvider;

public class CacheFacade {

	public static Cache<String, String> createCache() {
		CachingProvider cachingProvider = Caching.getCachingProvider();
		CacheManager cacheManager = cachingProvider.getCacheManager();
		MutableConfiguration<String, String> config
		  = new MutableConfiguration<>();
		return cacheManager
		  .createCache("simpleCache", config);
	}
}
