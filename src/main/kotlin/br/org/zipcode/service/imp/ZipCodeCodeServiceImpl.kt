package br.org.zipcode.service.imp


import br.org.zipcode.gateway.client.ZipCodeClient
import br.org.zipcode.model.ZipCode
import br.org.zipcode.service.ZipCodeService
import org.eclipse.microprofile.rest.client.inject.RestClient
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ZipCodeCodeServiceImpl(
    @Inject
    @RestClient
    private val zipCodeClient: ZipCodeClient
) : ZipCodeService {
    override fun getZipCode(zipCode: String): ZipCode = zipCodeClient.getZipCode(zipCode)

}