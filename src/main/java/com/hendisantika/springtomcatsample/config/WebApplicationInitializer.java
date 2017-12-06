package com.hendisantika.springtomcatsample.config;

import com.hendisantika.springtomcatsample.SpringTomcatSampleApplication;
import org.h2.server.web.WebServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-tomcat-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/12/17
 * Time: 06.27
 * To change this template use File | Settings | File Templates.
 */
public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer

    {

        @Override
        protected Class<?>[] getRootConfigClasses() {
            return null;
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class[] {SpringTomcatSampleApplication.class};
        }

        @Override
        protected String[] getServletMappings() {
            return new String[] { "/" };
        }

        @Override
        public void onStartup(ServletContext servletContext)
			throws ServletException {
            super.onStartup(servletContext);
            ServletRegistration.Dynamic servlet = servletContext.addServlet(
                    "h2-console", new WebServlet());
            servlet.setLoadOnStartup(2);
            servlet.addMapping("/console/*");
        }
}
