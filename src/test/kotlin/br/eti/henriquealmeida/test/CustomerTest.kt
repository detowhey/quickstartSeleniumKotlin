package br.eti.henriquealmeida.test

import br.eti.henriquealmeida.page.CustomerPage
import br.eti.henriquealmeida.page.HomePage
import org.junit.Test
import kotlin.test.assertEquals

class CustomerTest : BaseTest() {

    private val homePage: HomePage = HomePage(webDriver)
    private val customerPage: CustomerPage = CustomerPage(webDriver)

    @Test
    fun validateLoginCustomer() {
        homePage.clickButtonLoginCustomer()
        assertEquals(customerPage.selectCustomer(), customerPage.checkCustomerNameLogin())
    }
}