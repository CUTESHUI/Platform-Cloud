package com.shui.swagger;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Swagger
 *
 *
 */
@Primary
@Component
public class SwaggerProvider implements SwaggerResourcesProvider {
    /**
     * Swagger2默认的url后缀
     */
    private static final String API_URI = "/v2/api-docs";

    @Autowired
    private SwaggerRoute swaggerRoute;

    /**
     * 聚合其他服务接口
     */
	@Override
	public List<SwaggerResource> get() {
        List<SwaggerResource> swaggerResourceList = new ArrayList<>();
		swaggerRoute.getRoutes().forEach(route -> swaggerResourceList.add(swaggerResource(route)));
		return swaggerResourceList;
	}

	private SwaggerResource swaggerResource(SwaggerRouteProperties route) {
		SwaggerResource swaggerResource = new SwaggerResource();
		swaggerResource.setName(route.getName());
		swaggerResource.setLocation(route.getLocation().concat(API_URI));
		swaggerResource.setSwaggerVersion("0.x");
		return swaggerResource;
	}

}