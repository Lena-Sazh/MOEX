package com.moex.tests;

import com.moex.helpers.DriverUtils;
import com.moex.pages.MainPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class MainPageTests extends TestBase {

    @Test
    @Tag("SMOKE")
    @Feature("Main Page")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open main page", () -> open(MainPage.URL));
        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "HIGH";
            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @Test
    @Tag("SMOKE")
    @Feature("Main Page")
    @DisplayName("Open the Main Page")
    public void mainPageTest() {
        step("Open main page", () -> open(MainPage.URL));
        step("Decline notification pop-up", () -> $(byText("Блокировать")).click());
        step("Search for header", () -> $(".header__top").isDisplayed());
        step("Page title should have text 'Московская биржа'", () -> {
            String expectedTitle = "Московская Биржа";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @CsvSource({
            "Участникам торгов",
            "Частным инвесторам",
            "Управляющим активами",
            "Международным инвесторам",
            "Эмитентам"
    })
    @ParameterizedTest()
    @Tag("SMOKE")
    @Feature("Main Page")
    @DisplayName("Main menu tabs are present")
    void menuTabsArePresentTest(String tabName) {
        step("Open main page", () -> open(MainPage.URL));
        step("Decline notification pop-up", () -> $(byText("Блокировать")).click());
        step("Select tab", () -> $$(byText(tabName)).first()
                .shouldBe(visible, Duration.ofSeconds(5))); //debug
    }

    @CsvSource({
            "Акции и облигации",
            "Деривативы",
            "Валюта",
            "РЕПО и депозиты",
            "Драгоценные металлы",
            "Стандартизированные ПФИ",
            "OTC (MOEX Board)" //debug
    })
    @ParameterizedTest()
    @Tag("SMOKE")
    @Feature("Main Page")
    @DisplayName("Sidebar tabs are present")
    void sidebarTabsArePresentTest(String tabName) {
        step("Open main page", () -> open(MainPage.URL));
        step("Decline notification pop-up", () -> $(byText("Блокировать")).click());
        step("Select tab", () -> $$(byText(tabName)).first()
                .shouldBe(visible, Duration.ofSeconds(5)));
    }

    @CsvSource({
            "О бирже",
            "Акционерам",
            "Пресс-центр",
            "Мероприятия",
            "Карьера",
            "Личный кабинет",
            "Вход",
            "Регистрация"
    })
    @ParameterizedTest()
    @Tag("SMOKE")
    @Feature("Main Page")
    @DisplayName("Sidebar tabs are present")
    void headerTabsArePresentTest(String tabName) {
        step("Open main page", () -> open(MainPage.URL));
        step("Decline notification pop-up", () -> $(byText("Блокировать")).click());
        step("Select tab", () -> $$(byText(tabName)).first()
                .shouldBe(visible, Duration.ofSeconds(5)));
    }

}