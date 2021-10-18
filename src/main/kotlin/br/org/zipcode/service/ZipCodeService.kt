package br.org.zipcode.service

import br.org.zipcode.model.ZipCode


interface ZipCodeService {
    fun getZipCode(zipCode: String): ZipCode
}