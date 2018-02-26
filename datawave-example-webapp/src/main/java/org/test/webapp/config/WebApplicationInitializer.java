package org.test.webapp.config;

import javax.servlet.Filter;

import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.test.data.data.config.RepositoryConfiguration;
import org.test.webapp.config.profiles.BaseProfileConfiguration;

public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebAppConfiguration.class };
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RepositoryConfiguration.class, DataSourceConfiguration.class,
				BaseProfileConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/*" };
	}
	
	@Override
	protected Filter[] getServletFilters() {
		return new Filter[] { new OpenEntityManagerInViewFilter() };
	}
}
