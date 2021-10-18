package br.org.zipcode

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.jupiter.api.Test

@QuarkusTest
class ZipCodeTest {

    @Test
    fun testHelloEndpoint() {
        var zipCode = "03310000"
        given()
            .`when`().get("zipcode/$zipCode")
            .then()
            .statusCode(200)
            .body("logradouro", equalTo("Rua Itapura"))
    }
}