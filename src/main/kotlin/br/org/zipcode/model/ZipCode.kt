package br.org.zipcode.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class ZipCode(
    @JsonProperty("cep")
    val zipCode: String,
    @JsonProperty("logradouro")
    val address: String,
    @JsonProperty("complemento")
    val complement: String,
    @JsonProperty("bairro")
    val neighborhood: String,
    @JsonProperty("localidade")
    val location: String,
    val uf: String,
    val ibge: String,
    val gia: String,
    val ddd: String,
    val siafi: String
)