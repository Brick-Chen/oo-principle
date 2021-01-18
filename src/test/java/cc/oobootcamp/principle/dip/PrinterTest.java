package cc.oobootcamp.principle.dip;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PrinterTest {


  @Test
  public void should_print_plaint_item_info_given_plain_printer_type() {
    Item cola = new Item("cola", 2.5);
    Item sprite = new Item("sprite", 2.5);
    List<Item> items = Arrays.asList(cola, sprite);

    OrderReceiptHandler orderReceiptHandler = new OrderReceiptHandler(items, PrinterType.PLAINT);

    orderReceiptHandler.printReceipt();
  }
}
