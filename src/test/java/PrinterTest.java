import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(20,40);
    }

    @Test
    public void enough_sheets_toner(){
        printer.print(5,2);
        assertEquals(10,printer.getSheetsLeft());
        assertEquals(30,printer.getTonerLeft());
    }

    @Test
    public void not_enough_sheets_toner(){
        printer.print(10,5);
        assertEquals(20,printer.getSheetsLeft());
        assertEquals(40,printer.getTonerLeft());
    }

    @Test
    public void not_enough_sheets_but_enough_toner(){
        printer.print(15,2);
        assertEquals(20,printer.getSheetsLeft());
        assertEquals(40,printer.getTonerLeft());
    }
}
