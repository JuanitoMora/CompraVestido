package com.sophossolutions.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.petuniaropa.com/")
public class HomePage extends PageObject {

    public static final Target WOMEN = Target.the("Seccion Ropa").located(By.linkText("ROPA"));
    public static final Target DRESS = Target.the("Sub seccion Mujer").located(By.linkText("Vestidos Largos"));
}
