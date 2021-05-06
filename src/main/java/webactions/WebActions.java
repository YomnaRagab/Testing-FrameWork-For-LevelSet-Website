package webactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions {
    public enum action_enum {
        presence,
        visible
    }
    private WebDriver driver;
    public WebActions(WebDriver driver){
        this.driver = driver;
    }
    public boolean waitUntil(By element, action_enum condition){
        ExpectedCondition<WebElement> cond = null;
        if ("presence".equals(condition)) {
            cond = ExpectedConditions.presenceOfElementLocated(element);
        }
        else if ("visible".equals(condition)){
            cond = ExpectedConditions.visibilityOfElementLocated(element);
        }
        else
        {
            cond = null;
        }

        if(cond != null){
            new WebDriverWait(driver,10).until(cond);
            return (true);
        }
        return (false);
    }
    public boolean clickOn (By element){
        if(waitUntil(element,action_enum.presence)){
            driver.findElement(element).click();
            return true;
        }
        return false;
    }
    public String getText(By element){
        try{
            return driver.findElement(element).getText();
        }
        catch (Exception e){
            return "none";
        }
    }
    public boolean validateClick(By element){
        return waitUntil(element,action_enum.visible);
    }
}
