package org.example;

import com.codeborne.selenide.Selenide;

public class HomePage {

    public void openPage(){
        Selenide.open("https://magento.softwaretestingboard.com/");
    }



}