package config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class TestConfig {
    public TestConfig() {
        Configuration.browser = "Firefox";

    }
}
