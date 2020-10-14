package br.eti.henriquealmeida.interaction

import org.openqa.selenium.Alert
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select

class Interaction(private val webDriver: WebDriver) {

    private fun searchWebElement(tipoPesquisa: By): WebElement = webDriver.findElement(tipoPesquisa)

    private fun changeAlert(): Alert = webDriver.switchTo().alert()

    fun getWebElementText(typeResearch: By): String = searchWebElement(typeResearch).text

    fun clickWebElement(typeResearch: By) = searchWebElement(typeResearch).click()

    fun returnAlertText(): String {
        val alertPage = changeAlert()
        val alertText = alertPage.text
        alertPage.accept()
        return alertText
    }

    fun insertWebElementText(typeResearch: By, text: String) = searchWebElement(typeResearch).sendKeys(text)

    fun selectValueVisibleText(typeResearch: By, visibleText: String) =
        Select(searchWebElement(typeResearch)).selectByVisibleText(visibleText)
}
