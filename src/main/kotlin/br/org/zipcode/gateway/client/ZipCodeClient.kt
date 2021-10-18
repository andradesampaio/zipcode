package br.org.zipcode.gateway.client

import br.org.zipcode.model.ZipCode
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import org.jboss.resteasy.annotations.jaxrs.PathParam
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/ws/{zipCode}/json")
@RegisterRestClient(configKey = "zipCode-api")
interface ZipCodeClient {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getZipCode(@PathParam("zipCode") zipCode: String): ZipCode
}