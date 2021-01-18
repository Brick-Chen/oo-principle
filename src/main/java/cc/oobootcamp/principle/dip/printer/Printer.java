package cc.oobootcamp.principle.dip.printer;

import cc.oobootcamp.principle.dip.Item;
import java.util.List;

public interface Printer {
  void print(List<Item> items, double totalPrice);
}
