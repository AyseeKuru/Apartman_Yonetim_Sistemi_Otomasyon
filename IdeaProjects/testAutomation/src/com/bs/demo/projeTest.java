package com.bs.demo;

import io.appium.java_client.remote.MobileCapabilityType;
import java.net.URL;

public class projeTest {
    public static void main(String args[]){

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, value: "emulator-5554");
        dc.setCapability(capabilityName: "platformName", value: "Android");
        dc.setCapability(capabilityName: "appPackage", value: "com.example.intprogramlama");
        dc.setCapability(capabilityName: "appActivity", value: "com.example.intprogramlama.MainMenu");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL(spec "http://127.0.0.1:4723/wd/hub"),dc);

        MobileElement el4 = (MobileElement) driver.findElementById("com.example.intprogramlama:id/textInputApartmanKayit");
        el4.click();
        el4.sendKeys("asdfghjklşiüğpoıuyt");
        el4.click();
        el4.sendKeys("12345");
        el4.click();


    }
}
