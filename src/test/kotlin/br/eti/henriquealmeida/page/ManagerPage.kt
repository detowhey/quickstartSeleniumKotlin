package br.eti.henriquealmeida.page

import br.eti.henriquealmeida.utilities.RandomData
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class ManagerPage(webDriver: WebDriver) : BasePage(webDriver) {

    fun addNewCustomer() {
        interaction.clickWebElement(By.cssSelector("button[ ng-click = \"addCust()\"]"))

        interaction.insertTextWebElement(
            By.cssSelector("input[ng-model = \"fName\"]"),
            RandomData.firstNameRandom()
        )

        interaction.insertTextWebElement(
            By.cssSelector("input[ng-model = \"lName\"]"),
            RandomData.lastNameRandom()
        )

        interaction.insertTextWebElement(
            By.cssSelector("input[ng-model = \"postCd\"]"),
            RandomData.postalCodeRandom()
        )

        interaction.clickWebElement(By.cssSelector("button[type = \"submit\"]"))
    }

    fun getAlertTextCustomerAdd(): String = interaction.returnAlertText()
}
