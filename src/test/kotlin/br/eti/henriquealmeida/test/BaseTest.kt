package br.eti.henriquealmeida.test

import br.eti.henriquealmeida.utilities.BrowserType
import org.junit.After
import org.junit.Before
import org.junit.BeforeClass
import org.openqa.selenium.chrome.ChromeDriver
import java.util.concurrent.TimeUnit

abstract class BaseTest {

    val webDriver = ChromeDriver()

    companion object {
        @BeforeClass
        @JvmStatic
        fun setup() = BrowserType.useChrome()
    }

    @Before
    fun initSetup() {
        webDriver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login")
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS)
        webDriver.manage().window().maximize()
    }

    @After
    fun closeBrowser() = webDriver.quit()
}
