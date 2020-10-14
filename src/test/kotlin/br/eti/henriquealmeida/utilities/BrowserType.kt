package br.eti.henriquealmeida.utilities

import io.github.bonigarcia.wdm.WebDriverManager

class BrowserType {
    companion object {
        fun useChrome() = WebDriverManager.chromedriver().setup()
        fun useFirefox() = WebDriverManager.firefoxdriver().setup()
        fun useEdge() = WebDriverManager.edgedriver().setup()
    }
}
