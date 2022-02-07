package tests.local;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.MobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static helpers.Attach.getSessionId;
import static io.qameta.allure.Allure.step;

public class TestBase {
    public static String deviceHost = System.getProperty("deviceHost");

    @BeforeAll
    public static void setup() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Configuration.browser = MobileDriver.class.getName();
        Configuration.startMaximized = false;
        Configuration.browserSize = null;
        Configuration.timeout = 10000;
    }

    @BeforeEach
    public void startDriver() {
        step("Открыть браузер", () -> {
            Selenide.open();
        });
    }

    @AfterEach
    public void afterEach() {
        String sessionId = getSessionId();
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.attachVideo(sessionId);


        step("Закрыть браузер", () -> {
            Selenide.closeWebDriver();
        });
    }
}
