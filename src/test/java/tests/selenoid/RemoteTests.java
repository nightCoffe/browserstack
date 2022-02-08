package tests.selenoid;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class RemoteTests extends TestBase{

    @Test
    @Tag("selenoid")
    @DisplayName("Поиск browserstack через поисковую строку")
    void searchTest() {
        step("скипаем выбор языка", () -> {
            back();
        });
        step("Переходим в поле поиска", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
        });
        step("Вводим слово BrowserStack", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("BrowserStack");
        });
        step("Проверка что ответов в поиской выдачи больше 0", () -> {
            $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0));
        });
    }

    @Test
    @Tag("selenoid")
    @DisplayName("Поиск Cat через поисковую строку")
    void searchCat() {
        step("скипаем выбор языка", () -> {
            back();
        });
        step("Переходим в поле поиска", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
        });
        step("Вводим слово BrowserStack Cat", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Cat");
        });
        step("Проверка что в поисковой выдачи есть слово Cat и оно видимо", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldBe(visible).shouldHave(text("Cat"));
        });
    }
}
