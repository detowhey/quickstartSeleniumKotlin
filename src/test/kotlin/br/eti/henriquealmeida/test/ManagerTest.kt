package br.eti.henriquealmeida.test

import br.eti.henriquealmeida.page.ManagerPage
import br.eti.henriquealmeida.page.HomePage
import org.junit.Test
import kotlin.test.assertTrue

class ManagerTest : BaseTest() {

    private val homePagina: HomePage = HomePage(webDriver)
    private val managerPage: ManagerPage = ManagerPage(webDriver)

    @Test
    fun validateCustomreMessageCreatedSuccessfully() {
        homePagina.clickButtonLoginManager()
        managerPage.addNewCustomer()

        assertTrue(managerPage.getAlertTextCustomerAdd()
            .contains("Customer added successfully with customer id :"))
    }
}
