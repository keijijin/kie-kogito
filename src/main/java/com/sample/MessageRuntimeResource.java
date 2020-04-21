package com.sample;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sample.model.Message;

import org.kie.api.runtime.KieSession;
import org.kie.kogito.rules.KieRuntimeBuilder;

@Path("/hello")
public class MessageRuntimeResource {

    @Inject
    KieRuntimeBuilder runtimeBuilder;

    @GET
    @Path("/{message}/{status}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getHello(@PathParam("message") String message, @PathParam("status") int status) {
        KieSession ksession = runtimeBuilder.newKieSession("helloKS");
        Message msg = new Message(message, status);
        ksession.insert(msg);
        ksession.fireAllRules();
        return msg;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postHello(Message msg) {
        KieSession ksession = runtimeBuilder.newKieSession("helloKS");
        ksession.insert(msg);
        ksession.fireAllRules();
        return Response
                .status(Response.Status.OK)
                .entity(msg)
                .build();
    }

}