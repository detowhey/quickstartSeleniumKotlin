package br.eti.henriquealmeida.page

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class HomePage(webDriver: WebDriver) : BasePage(webDriver) {

    fun clickButtonLoginManager() = interaction.clickWebElement(By.ByCssSelector("button[ ng-click = \"manager()\""))

    fun clickButtonLoginCustomer() = interaction.clickWebElement(By.cssSelector("button[ ng-click = \"customer()\"]"))
}