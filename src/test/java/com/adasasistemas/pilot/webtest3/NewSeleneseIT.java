/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adasasistemas.pilot.webtest3;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author joseangel.pellicer
 */
public class NewSeleneseIT {
    public static final String URL = "http://localhost:8085/webtest3";
    public static final String NAVIGATOR = "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";
    @Test
    public void testSimple() throws Exception {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        FirefoxProfile fp = new FirefoxProfile();
        

     //   fp.setPreference("browser.startup.homepage", URL);
       // fp.setPreference("startup.homepage_welcome_url", URL);
        //fp.setPreference("startup.homepage_welcome_url.additional", URL);
        FirefoxBinary fb = new FirefoxBinary(new File(NAVIGATOR));
        WebDriver driver = new FirefoxDriver(fb, fp);

        // And now use this to visit NetBeans
        //  driver.get("http://www.netbeans.org");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.netbeans.org");
        // Check the title of the page
        // Wait for the page to load, timeout after 10 seconds
        driver.navigate().to("http://localhost:8085/webtest3");
       //* driver.navigate().refresh();
     //  driver.get("http://localhost:8085/webtest3");
 //    System.out.println(driver.getPageSource());
        
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver d) {
                System.out.println(d.getPageSource());
                return d.getPageSource().contains("Hello");
            }
        });

        //Close the browser
        driver.quit();
    }
    
    public static void main (String args){
        try {
            new NewSeleneseIT().testSimple();
        } catch (Exception ex) {
            Logger.getLogger(NewSeleneseIT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
