package com.qagenic.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WikipediaTest extends BaseClass{

    String wikiurl = "https://wikipedia.org";

    @Test
    public void launch_wikipedia(){
        launchApplication(wikiurl);
        Assert.assertEquals(pages.wikipediapage.verifyTitle(), "Wikipedia");
    }

    @Test(dependsOnMethods = "launch_wikipedia")
    public void search_on_wiki(){
        pages.wikipediapage.searchonWikiPage("Selenium");
    }
    
}
