package bridge;


import bridge.formatters.EmailFormatter;
import bridge.formatters.Formatter;
import bridge.formatters.HtmlFormatter;
import bridge.formatters.PdfFormatter;
import bridge.printers.MessagePrinter;
import bridge.printers.Printer;
import bridge.utils.CrerationalUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by 3len1 on 2/14/2019.
 */
public class BridgeDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(BridgeDemo.class);

    public static void main(String args[]) {
        LOGGER.info("Bridge example with messages. Have fun to try it!\n");

        Printer messagePrinter = new MessagePrinter(CrerationalUtils.createMessage());

        Formatter emailFormatter = new EmailFormatter();
        Formatter htmlformatter = new HtmlFormatter();
        Formatter pdfFormatter = new PdfFormatter();

        System.out.println("Print message with pdf format:");
        System.out.println(messagePrinter.print(pdfFormatter));

        System.out.println("Print message with email format:");
        System.out.println(messagePrinter.print(emailFormatter));

        System.out.println("Print message with html format:");
        System.out.println(messagePrinter.print(htmlformatter));


    }


}
