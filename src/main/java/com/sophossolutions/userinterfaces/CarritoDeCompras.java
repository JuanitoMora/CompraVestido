package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoDeCompras {

   public static final Target RESULT_DRESS = Target.the("Resultado de la búsqueda").locatedBy("/html/body/div[3]/div[2]/main/div/div/section/ul/li[3]/a/div/img[2]");
   public static final Target SELECT_DRESS = Target.the("Selección del vestido").locatedBy("/html/body/div[3]/div[2]/main/div/div/section/ul/li[3]/a/div/img[2]");
   public static final Target SELECT_SIZE = Target.the("Seleccionar la talla").locatedBy("(//div[@class='variable-item-contents'])[2]");
   public static final Target DELETE_QUANTITY = Target.the("Borrar la cantidad").located(By.name("quantity"));
   public static final Target WRITE_QUANTITY = Target.the("Diligenciar las cantidades").located(By.name("quantity"));
   public static final Target ADD_SHOPPING_CAR = Target.the("Validar carrito de compras").locatedBy(".single_add_to_cart_button");
   public static final Target VIEW_SHOPPING_CAR = Target.the("Validar carrito de compras").located(By.linkText("Ver Carrito"));
   public static final Target VIEW_TOTAL = Target.the("Validar el total").locatedBy("//*[tr[@class=\"order-total\"]]");
   public static final Target FINISHED_SHOPPING = Target.the("Finalizar compra").located(By.linkText("FINALIZAR COMPRA"));
   public static final Target CHECK_SHOPPING = Target.the("Validar toda la compra").locatedBy("/html/body/div[3]/div[2]/main/div/section/div/div/div/form[3]/div[3]/div/table/tfoot/tr[3]/td/strong/span/bdi/span");
   public static final Target VIEW_QUANTITY_SHOPPING_CAR = Target.the("Validar cantidades en el carrito de compras").locatedBy(".fusion-widget-cart-number");
}
