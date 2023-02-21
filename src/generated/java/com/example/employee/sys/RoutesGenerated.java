package com.example.employee.sys;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.ms3_inc.tavros.extensions.rest.OpenApi4jValidator;

/**
 * Generated routes are based on the OpenAPI document in src/generated/api folder.
 *
 * @author Maven Archetype (camel-oas-archetype)
 */
@Generated("com.ms3_inc.camel.archetype.oas")
@Component
public class RoutesGenerated extends BaseRestRouteBuilder {
    private final String contextPath;

    public RoutesGenerated(@Value("${camel.rest.context-path}") String contextPath) {
        super();
        this.contextPath = contextPath;
    }

    /**
     * Defines Apache Camel routes using the OpenAPI REST DSL.
     * Routes are built using a get(PATH) rest message processor.
     *
     * Make changes to this file with caution.
     * If the API specification changes and this file is regenerated,
     * previous changes may be overwritten.
     */
    @Override
    public void configure() throws Exception {
        super.configure();

        restConfiguration().component("undertow");

        interceptFrom()
            .process(new OpenApi4jValidator("employee-sys-api.yaml", contextPath));

        rest()
            .get("/employees")
                .id("get-employees")
                .produces("application/json")
                .to(direct("get-employees").getUri())
            .post("/employees")
                .id("post-employees")
                .consumes("application/json")
                .produces("application/json")
                .to(direct("post-employees").getUri())
            .get("/employees/{employeeId}")
                .id("get-employees-employeeId")
                .produces("application/json")
                .to(direct("get-employees-employeeId").getUri())
            .delete("/employees/{employeeId}")
                .id("delete-employees-employeeId")
                .produces("application/json")
                .to(direct("delete-employees-employeeId").getUri())
            .patch("/employees/{employeeId}")
                .id("patch-employees-employeeId")
                .consumes("application/json")
                .produces("application/json")
                .to(direct("patch-employees-employeeId").getUri())
        ;
    }
}
