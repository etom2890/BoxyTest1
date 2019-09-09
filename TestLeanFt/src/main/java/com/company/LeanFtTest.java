package com.company;

import com.hp.lft.sdk.powerbuilder.ListView;
import com.hp.lft.sdk.stdwin.ListViewDescription;
import com.hp.lft.sdk.web.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;

import sun.plugin.javascript.navig.Window;
import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    @BeforeClass
    public void beforeClass() throws Exception {
    }

    @AfterClass
    public void afterClass() throws Exception {
    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
    }

    @AfterMethod
    public void afterMethod() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException {





        Browser browser = BrowserFactory.launch(BrowserType.CHROME);

        browser.navigate("https://www.boxycharm.com/");

        Link sUBSCRIBELink = browser.describe(Link.class, new LinkDescription.Builder()
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
        image.click();

        browser.close();


    }



}