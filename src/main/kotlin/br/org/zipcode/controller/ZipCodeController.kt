package br.org.zipcode.controller

import br.org.zipcode.model.ZipCode
import br.org.zipcode.service.ZipCodeService
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("zipcode/{zipCode}")
class ZipCodeController(
    @Inject
    private val zipCodeService: ZipCodeService
) {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getCep(@PathParam("zipCode") zipCode: String): ZipCode = zipCodeService.getZipCode(zipCode)
}