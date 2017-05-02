package com.intesasanpaolo.cos2noc.ws;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ws/*");
	}

	@Bean(name = "cos2noc")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema cos2nocSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("Cos2NocPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://intesasanpaolo.com/cos2noc");
		wsdl11Definition.setSchema(cos2nocSchema);

		// fix for adding soapAction to the dynamic generated wsdl
		//Properties soapActions = new Properties();
		//soapActions.setProperty("getBeer", "http://memorynotfound.com/getBeerRequest");
		//wsdl11Definition.setSoapActions(soapActions);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema cos2nocSchema() {
		return new SimpleXsdSchema(new ClassPathResource("cos2noc.xsd"));
	}
}
