package com.example.employee.sys;

import com.datasonnet.document.MediaTypes;
import org.apache.camel.language.datasonnet.DatasonnetExpression;
import org.springframework.stereotype.Component;

/**
 * The RoutesImplementation class holds implementations for the end points configured in RoutesGenerated.
 * These routes are based on operation Ids, that correspond to an API end point:  method+path.
 *
 * @author Maven Archetype (camel-openapi-archetype)
 */
@Component
public class RoutesImplementation extends BaseRestRouteBuilder {

    @Override
    public void configure() throws Exception {
        super.configure();

        // TODO: Replace stubs for each endpoint with real implementation. Implementation defaults to a simple response with operation Id.
        from(direct("get-employees"))
            .setBody(DatasonnetExpression.builder("{opId: 'get-employees'}", String.class)
                    .outputMediaType(MediaTypes.APPLICATION_JSON))
        ;
        from(direct("post-employees"))
            .setBody(DatasonnetExpression.builder("{opId: 'post-employees'}", String.class)
                    .outputMediaType(MediaTypes.APPLICATION_JSON))
        ;
        from(direct("get-employees-employeeId"))
            .setBody(DatasonnetExpression.builder("{opId: 'get-employees-employeeId'}", String.class)
                    .outputMediaType(MediaTypes.APPLICATION_JSON))
        ;
        from(direct("delete-employees-employeeId"))
            .setBody(DatasonnetExpression.builder("{opId: 'delete-employees-employeeId'}", String.class)
                    .outputMediaType(MediaTypes.APPLICATION_JSON))
        ;
        from(direct("patch-employees-employeeId"))
            .setBody(DatasonnetExpression.builder("{opId: 'patch-employees-employeeId'}", String.class)
                    .outputMediaType(MediaTypes.APPLICATION_JSON))
        ;

    }
}
