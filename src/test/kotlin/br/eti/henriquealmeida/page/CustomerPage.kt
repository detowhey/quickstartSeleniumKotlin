package br.eti.henriquealmeida.page

import br.eti.henriquealmeida.utilities.RandomData
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class CustomerPage(webDriver: WebDriver) : BasePage(webDriver) {

    fun selectCustomer(): String {
        val customerRegistered = RandomData.registeredCustomerRandom()
        interaction.selectValueVisibleText(By.id("userSelect"), customerRegistered)
        interaction.clickWebElement(By.cssSelector("button[type = \"submit\"]"))
        return customerRegistered
    }

    fun checkCustomerNameLogin(): String =
        interaction.getWebElementText(By.cssSelector("span[class = \"fontBig ng-binding\"]"))
}