package drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static config.AppEmulator.userEmulatorConfig;
import static utils.FileUtils.getAbsolutePath;

public class LocalEmulatorMobileDriver implements WebDriverProvider {
    public static URL getLocalUrl() {
        try {
            return new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

        desiredCapabilities.setCapability("platformName", userEmulatorConfig.emulatorPlatformName());
        desiredCapabilities.setCapability("deviceName", userEmulatorConfig.emulatorDeviceName());
        desiredCapabilities.setCapability("version", userEmulatorConfig.emulatorVersion());

        desiredCapabilities.setCapability("locale", "en");
        desiredCapabilities.setCapability("language", "en");
        desiredCapabilities.setCapability("appPackage", "org.wikipedia.alpha");
        desiredCapabilities.setCapability("appActivity", "org.wikipedia.main.MainActivity");
        desiredCapabilities.setCapability("app",
                getAbsolutePath("src/test/resources/apk/app-alpha-universal-release.apk"));

        return new AndroidDriver(getLocalUrl(), desiredCapabilities);
    }
}
