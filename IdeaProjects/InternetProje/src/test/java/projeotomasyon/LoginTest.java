package projeotomasyon;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    By consultantButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ImageView");
    By apartmanadiButton = By.id("com.example.intprogramlama:id/textInputApartmanKayit");
    By dairenoButton = By.id("com.example.intprogramlama:id/textInputDaireKayit");
    By adsoyadButton = By.id("com.example.intprogramlama:id/textInputAdSoyadKayit");
    By tlfnumberButton = By.id("com.example.intprogramlama:id/textInputTelKayit");
    By mailButton = By.id("com.example.intprogramlama:id/textInputPostaKayit");
    By registerButton= By.id("com.example.intprogramlama:id/registerBtn");

    By kullaniciAraButton= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout");
    By aptAraButton = By.id("com.example.intprogramlama:id/textInputApartmanAra");
    By daireAraButton= By.id("com.example.intprogramlama:id/textInputDaireAra");
    By aramaButton = By.id("com.example.intprogramlama:id/kullaniciAraBtn");

    By yakitAnaEkranButton= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout");
    By aptBorcAraButton = By.id("com.example.intprogramlama:id/textInputApartmanBorcAra");
    By daireBorcAraButton = By.id("com.example.intprogramlama:id/textInputDaireBorcAra");
    By tarihBorcAraButton= By.id("com.example.intprogramlama:id/textInputTarihBorcAra");
    By sorgulaButton = By.id("com.example.intprogramlama:id/btnBorcAra");

    By yakitBorcTanimlamaButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.ImageView");
    By ybsMakbuzButton = By.id("com.example.intprogramlama:id/btnMakbuz");
    By ybtAptAdiButton = By.id("com.example.intprogramlama:id/textInputApartmanBorcKayit");
    By ybtDaireNoButton = By.id("com.example.intprogramlama:id/textInputDaireBorcKayit");
    By ybtTarihButton = By.id("com.example.intprogramlama:id/textInputTarihBorcKayit");
    By ybtBorcMiktarButton = By.id("com.example.intprogramlama:id/textInputTutarBorcKayit");
    By ybtBorcTanimlaButton = By.id("com.example.intprogramlama:id/textInputBorcTanimlaKayit");

    By myAnaEkranButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridLayout/android.widget.FrameLayout[5]/android.widget.LinearLayout");
    By myMakbuzButton = By.id("com.example.intprogramlama:id/btnMakbuz");
    By myMakbuzYazButton = By.id("com.example.intprogramlama:id/btnMakbuzBas");

    By yboAnaEkranButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridLayout/android.widget.FrameLayout[6]/android.widget.LinearLayout");
    By yboAptAdiButton = By.id("com.example.intprogramlama:id/textInputApartmanBorcOde");
    By yboDaireNoButton = By.id("com.example.intprogramlama:id/textInputDaireBorcOde");
    By yboTarihButton = By.id("com.example.intprogramlama:id/textInputTarihBorcOde");
    By yboBorcSorgulaButton = By.id("com.example.intprogramlama:id/BtnBorcOdeSor");
    By yboBorcOdeButton = By.id("com.example.intprogramlama:id/BtnBorcOde");

    By kullaniciSilButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.Button");

    By duyuruOlusturButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridLayout/android.widget.FrameLayout[7]/android.widget.LinearLayout");
    By duyuruKonuButton = By.id("com.example.intprogramlama:id/textInputDuyuruKonusu");
    By duyuruButton = By.id("com.example.intprogramlama:id/textInputDuyuruMetin");
    By duyuruOlusturTıklaButton = By.id("com.example.intprogramlama:id/duyuruOlusturBtn");

    By duyuruPanoButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridLayout/android.widget.FrameLayout[8]/android.widget.LinearLayout");
    By kullaniciKaldirButton = By.id("com.example.intprogramlama:id/btnKaldır");
    By evetButton = By.id("android:id/button1");
    By hayirButton = By.id("android:id/button2");
    By duyuruYenileButton = By.id("com.example.intprogramlama:id/duyuruYenileBtn");

    public AppiumDriver<WebElement> driver;
    public WebDriverWait wait;

    @BeforeTest
    public void beforeTest(){
        try{


            DesiredCapabilities cap;
            cap = new DesiredCapabilities();

            cap.setCapability( "deviceName", "Pixel 4 API 30");
            cap.setCapability( "platformName", "Android");
            cap.setCapability("udid", "emulator-5554");
            cap.setCapability( "appPackage", "com.example.intprogramlama");
            cap.setCapability( "appActivity", "com.example.intprogramlama.MainMenu");


            driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
            wait = new WebDriverWait(driver,10);

        }catch(MalformedURLException mx){

            System.out.println("Hatalı olusturulmuş URL istisnası!");
        }


    }

    
    @Test
    public void test(){


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement consultantSelect = driver.findElement(consultantButton);
        consultantSelect.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement apartmanadiDnm1Select = driver.findElement(apartmanadiButton);
        apartmanadiDnm1Select.sendKeys("");

        WebElement dairenoDnm1Select = driver.findElement(dairenoButton);
        dairenoDnm1Select.sendKeys("1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement adsoyadDnm1Select = driver.findElement(adsoyadButton);
        adsoyadDnm1Select.sendKeys("Bekir Kırat");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement tlfnumberDnm1Select = driver.findElement(tlfnumberButton);
        tlfnumberDnm1Select.sendKeys("425184520");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement mailDnm1Select = driver.findElement(mailButton);
        mailDnm1Select.sendKeys("b.kirat@gmail.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement registerDnm1Btn = driver.findElement(registerButton);
        registerDnm1Btn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement apartmanadiSelect = driver.findElement(apartmanadiButton);
        apartmanadiSelect.sendKeys("Yüzügülmeyenler");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        apartmanadiSelect.sendKeys("12345");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        apartmanadiSelect.sendKeys("Yasemin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement dairenoSelect = driver.findElement(dairenoButton);
        dairenoSelect.sendKeys("Selamm");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dairenoSelect.sendKeys("45");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dairenoSelect.sendKeys("1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement adsoyadSelect = driver.findElement(adsoyadButton);
        adsoyadSelect.sendKeys("Hüdaverdi Şehmeranoğulları");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        adsoyadSelect.sendKeys("Hüdaverdi12345");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        adsoyadSelect.sendKeys("Bekir Kırat");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement tlfnumberSelect = driver.findElement(tlfnumberButton);
        tlfnumberSelect.sendKeys("4251as520");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tlfnumberSelect.sendKeys("425184520284038");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tlfnumberSelect.sendKeys("425184520");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement mailSelect = driver.findElement(mailButton);
        mailSelect.sendKeys("b.kirat@gmail.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement registerBtn = driver.findElement(registerButton);
        registerBtn.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement kullaniciAra=driver.findElement(kullaniciAraButton);
        kullaniciAra.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement aptAraDnm1= driver.findElement(aptAraButton);
        aptAraDnm1.sendKeys("");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement daireAraDnm1= driver.findElement(daireAraButton);
        daireAraDnm1.sendKeys("1");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement aramaDnm1= driver.findElement(aramaButton);
        aramaDnm1.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement aptAra= driver.findElement(aptAraButton);
        aptAra.sendKeys("Yasemin");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement daireAra= driver.findElement(daireAraButton);
        daireAra.sendKeys("1");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement arama= driver.findElement(aramaButton);
        arama.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement yakitAnaEkran=driver.findElement(yakitAnaEkranButton);
        yakitAnaEkran.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement aptBorcAra= driver.findElement(aptBorcAraButton);
        aptBorcAra.sendKeys("Yasemin");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement daireBorc=driver.findElement(daireBorcAraButton);
        daireBorc.sendKeys("1");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement tarihBorc= driver.findElement(tarihBorcAraButton);
        tarihBorc.sendKeys("11/2022");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement sorgula = driver.findElement(sorgulaButton);
        sorgula.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement myMakbuz0 = driver.findElement(myMakbuzButton);
        myMakbuz0.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().back();

        WebElement yakitBorcTanimlama = driver.findElement(yakitBorcTanimlamaButton);
        yakitBorcTanimlama.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement ybtAptAdi = driver.findElement(ybtAptAdiButton);
        ybtAptAdi.sendKeys("Yasemin");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement ybtDaireNo = driver.findElement(ybtDaireNoButton);
        ybtDaireNo.sendKeys("1");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement ybtTarih = driver.findElement(ybtTarihButton);
        ybtTarih.sendKeys("11/2022");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement ybtBorcMiktar = driver.findElement(ybtBorcMiktarButton);
        ybtBorcMiktar.sendKeys("850");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement ybtBorcTanimla = driver.findElement(ybtBorcTanimlaButton);
        ybtBorcTanimla.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement myAnaEkran= driver.findElement(myAnaEkranButton);
        myAnaEkran.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement aptBorcAra1= driver.findElement(aptBorcAraButton);
        aptBorcAra1.sendKeys("Yasemin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement daireBorc1=driver.findElement(daireBorcAraButton);
        daireBorc1.sendKeys("1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement tarihBorc1= driver.findElement(tarihBorcAraButton);
        tarihBorc1.sendKeys("11/2022");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement sorgula1 = driver.findElement(sorgulaButton);
        sorgula1.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement myMakbuz = driver.findElement(myMakbuzButton);
        myMakbuz.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement myMakbuzYaz = driver.findElement(myMakbuzYazButton);
        myMakbuzYaz.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement yboAnaEkran=driver.findElement(yboAnaEkranButton);
        yboAnaEkran.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement yboAptAdi= driver.findElement(yboAptAdiButton);
        yboAptAdi.sendKeys("Yasemin");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement yboDaireNo=driver.findElement(yboDaireNoButton);
        yboDaireNo.sendKeys("1");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement yboTarih= driver.findElement(yboTarihButton);
        yboTarih.sendKeys("11/2022");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement yboBorcSorgula = driver.findElement(yboBorcSorgulaButton);
        yboBorcSorgula.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement yboBorcOde = driver.findElement(yboBorcOdeButton);
        yboBorcOde.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().back();

    }




    @Test
    public void test1(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement consultant1Select = driver.findElement(consultantButton);
        consultant1Select.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement apartmanadi1Select = driver.findElement(apartmanadiButton);
        apartmanadi1Select.sendKeys("Menekse");

        WebElement daireno1Select = driver.findElement(dairenoButton);
        daireno1Select.sendKeys("2");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement adsoyad1Select = driver.findElement(adsoyadButton);
        adsoyad1Select.sendKeys("Faruk Salman");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement tlfnumber1Select = driver.findElement(tlfnumberButton);
        tlfnumber1Select.sendKeys("123456789");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement mail1Select = driver.findElement(mailButton);
        mail1Select.sendKeys("f.salman@gmail.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement register1Btn = driver.findElement(registerButton);
        register1Btn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement kullanici1Ara=driver.findElement(kullaniciAraButton);
        kullanici1Ara.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement apt1Ara= driver.findElement(aptAraButton);
        apt1Ara.sendKeys("Menekse");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement daire1Ara= driver.findElement(daireAraButton);
        daire1Ara.sendKeys("2");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement arama1= driver.findElement(aramaButton);
        arama1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /*

        WebElement kullaniciSil = driver.findElement(kullaniciSilButton);
        kullaniciSil.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement evet1 =driver.findElement(evetButton);
        evet1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement kullanici2Ara=driver.findElement(kullaniciAraButton);
        kullanici2Ara.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement apt2Ara= driver.findElement(aptAraButton);
        apt2Ara.sendKeys("Menekse");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement daire2Ara= driver.findElement(daireAraButton);
        daire2Ara.sendKeys("2");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement arama2= driver.findElement(aramaButton);
        arama2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         */

        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement duyuruOlustur=driver.findElement(duyuruOlusturButton);
        duyuruOlustur.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement duyuruKonu= driver.findElement(duyuruKonuButton);
        duyuruKonu.sendKeys("Apartman Kuralları");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement duyuru= driver.findElement(duyuruButton);
        duyuru.sendKeys("Apartman sakinlerinin dikkatine!!" +
                "Apartmanımızın kuralları aşağıdaki gibidir:" +
                "1) Apartman içerisinde özellikle akşam saatlerinde yüksek sesle konuşmayınız" +
                "2) Lütfen merdivenleri temiz kullanalım ve bırakalım" +
                "3) Balkondan aşağıya herhangi bir şey atmayınız" +
                "4) Dış kapıyı kapatılı tutunuz" +
                "5) Çöplerinizi sabah 9 dan önce kapıya bırakınız");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement duyuruOlusturTıkla= driver.findElement(duyuruOlusturTıklaButton);
        duyuruOlusturTıkla.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement duyuruPano=driver.findElement(duyuruPanoButton);
        duyuruPano.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement kullaniciKaldir =driver.findElement(kullaniciKaldirButton);
        kullaniciKaldir.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement hayir =driver.findElement(hayirButton);
        hayir.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement duyuruYenile =driver.findElement(duyuruYenileButton);
        duyuruYenile.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement kullaniciKaldir1 =driver.findElement(kullaniciKaldirButton);
        kullaniciKaldir1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement evet =driver.findElement(evetButton);
        evet.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement duyuruYenile1 =driver.findElement(duyuruYenileButton);
        duyuruYenile1.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }



    @AfterTest
    public void teardown(){
    }
}
