package creatadocumenttests;

import basetests.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
    import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CreatADocumentPage;

import static org.testng.Assert.assertEquals;

public class CreatADocumentTests extends BaseTests {
    CreatADocumentPage creatADocumentPage;
    String actualText;

    @BeforeClass
    public void beforeClassCreatADocument(){
        home.navigateToHomePage();
        creatADocumentPage=home.navigateToCreatDoc();
    }
    @Test
    public void testPreliminaryNotice(){
        creatADocumentPage.clickOnPreliminaryNotice();
        actualText=creatADocumentPage.findHeaderOfPreliminaryNotice();
        assertEquals(actualText,"20-Day Preliminary Notice");
        actualText=creatADocumentPage.findPriceOfPreliminaryNotice();
        assertEquals(actualText,"Free");
    }
    @Test
    public void testIntentToLean(){
        creatADocumentPage.clickOnIntentToLien();
        actualText=creatADocumentPage.findHeaderOfIntentToLien();
        assertEquals(actualText,"Notice of Intent to Lien");
        actualText=creatADocumentPage.findPriceOfIntentToLien();
        assertEquals(actualText,"Free");
    }
    @Test
    public void testBondClaim(){
        creatADocumentPage.clickOnBondClaim();
        actualText=creatADocumentPage.findHeaderOfBondClaim();
        assertEquals(actualText,"Lien / Bond Claim");
        actualText=creatADocumentPage.findPriceOfBondClaim();
        assertEquals(actualText,"Free","It's not free");
    }
    @Test
    public void lienWaiverClaim(){
        creatADocumentPage.clickOnLienWaiver();
        actualText=creatADocumentPage.findHeaderOfLienWaiver();
        assertEquals(actualText,"Lien Waiver");
        actualText=creatADocumentPage.findPriceOfLienWaiver();
        assertEquals(actualText,"Free","It's not free");
    }

}
