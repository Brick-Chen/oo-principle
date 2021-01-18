package cc.oobootcamp.principle.dip;

import cc.oobootcamp.principle.dip.printer.HTMLPrinter;
import cc.oobootcamp.principle.dip.printer.PlaintPrinter;
import cc.oobootcamp.principle.dip.printer.Printer;
import cc.oobootcamp.principle.dip.printer.XMLPrinter;

public enum PrinterType {
    PLAINT(new PlaintPrinter()), XML(new XMLPrinter()), HTML(new HTMLPrinter());

    private Printer printer;

    PrinterType(Printer printer) {
        this.printer = printer;
    }

    public Printer getPrinter() {
        return printer;
    }
}
