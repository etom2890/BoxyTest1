import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.*;
import org.testng.annotations.*;
import unittesting.UnitTestClassBase;


public class TestClass extends UnitTestClassBase {



    @Test
    public void test() throws GeneralLeanFtException {
        Browser browser = BrowserFactory.launch(BrowserType.CHROME);

        browser.navigate("https://www.boxytest.com/");

    /*   Link sUBSCRIBELink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("SUBSCRIBE")
                .role("")
                .tagName("A").build());
        sUBSCRIBELink.click();

        Button subscribeButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("button")
                .className("action tocart primary")
                .cssSelector("div#subscribe > div > div:nth-child(2) > div > div:nth-child(1) > section > div > div > button")
                .id("")
                .name("        Subscribe    ")
                .tagName("BUTTON")
                .xpath("//DIV[1]/SECTION[1]/DIV[1]/DIV[1]/BUTTON[1]").build());
        subscribeButton.click();

        Image image = browser.describe(Image.class, new ImageDescription.Builder()
                .alt("BoxyCharm")
                .tagName("IMG")
                .type(com.hp.lft.sdk.web.ImageType.LINK).build());
        image.click(); */
        Link sUBSCRIBELink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("SUBSCRIBE")
                .xpath("//a[@class='action subscribe primary button-large']")
                .tagName("A").build());
        sUBSCRIBELink.click();

        Button subscribeButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("button")
                .name("        Subscribe    ")
                .xpath("//button[@class='action tocart primary']")
                .tagName("BUTTON")
                .index(0).build());
        subscribeButton.click();

        Image image = browser.describe(Image.class, new ImageDescription.Builder()
                .alt("BoxyCharm")
                .tagName("IMG")
                .type(com.hp.lft.sdk.web.ImageType.LINK).build());
        image.click();

        Button subscribeButton1 = browser.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityName("")
                .buttonType("button")
                .name("        Subscribe    ")
                .role("")
                .tagName("BUTTON")
                .index(1).build());
        subscribeButton1.click();


        browser.close();
    }

}