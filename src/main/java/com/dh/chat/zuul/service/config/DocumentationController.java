package com.dh.chat.zuul.service.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Santiago Mamani
 */
@Component
@Primary
public class DocumentationController implements SwaggerResourcesProvider {
    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        resources.add(swaggerResource("users-api", "/api/users/v2/api-docs?group=users-api"));
        resources.add(swaggerResource("contact-api", "/api/contact/v2/api-docs?group=contact-api"));
        resources.add(swaggerResource("file-api", "/api/binaries/v2/api-docs?group=file-api"));
        /*Swagger del sales-service*/
        resources.add(swaggerResource("sales-api", "/api/sales/v2/api-docs?group=sales-service-api"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);

        return swaggerResource;
    }
}
