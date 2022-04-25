package testAutomations.seleniumTests;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author Emre Örs
 * @Date 25.04.2022
 */
public class baseClass extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "element Xpath")
    public WebElement elementVarName;


    @Test
    public void testBaseClass() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Fwait.until(ExpectedConditions.visibilityOf(elementVarName));

        Logger.info("Logluyoruz info");
        try {
            elementVarName.click();
        } catch (Exception e) {
            Logger.warn("Click İşlemi gerçekleşmedi Tıklanamadı.");
        }

        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
