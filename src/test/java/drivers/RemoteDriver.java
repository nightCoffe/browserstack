package drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

import static config.AppRemote.userRemoteConfig;
import static utils.FileUtils.getAbsolutePath;

public class RemoteDriver implements WebDriverProvider {
    public static URL getRemoteUrl() {
        try {
            return new URL(
                    "https://" + userRemoteConfig.remoteUser() + ":" + userRemoteConfig.remotePassword()
                            + "@selenoid.autotests.cloud/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "android");
        desiredCapabilities.setCapability("version", "8.1");

        desiredCapabilities.setCapability("locale", "en");
        desiredCapabilities.setCapability("language", "en");
        desiredCapabilities.setCapability("appPackage", "org.wikipedia.alpha");
        desiredCapabilities.setCapability("appActivity", "org.wikipedia.main.MainActivity");
        desiredCapabilities.setCapability("app",
                getAbsolutePath("src/test/resources/apk/app-alpha-universal-release.apk"));

        return new AndroidDriver(getRemoteUrl(), desiredCapabilities);
    }
}
