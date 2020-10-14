package br.eti.henriquealmeida.page

import br.eti.henriquealmeida.interaction.Interaction
import org.openqa.selenium.WebDriver

abstract class BasePage(webDriver: WebDriver) {
     val interaction: Interaction by lazy { Interaction(webDriver) }
}