package bridge.printers;

import bridge.enums.Label;
import bridge.objects.Info;
import bridge.objects.Message;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 3len1 on 2/14/2019.
 */
@AllArgsConstructor
public class MessagePrinter extends Printer {
    private static final String DEFAULT_SENDER = "3len1";
    private Message message;

    @Override
    protected List<Info> getDetails() {
        List<Info> details = new ArrayList<>();
        details.add(new Info(Label.SENDER,
                message.getSender() != null ? message.getSender().getEmail() : DEFAULT_SENDER
        ));

        StringBuilder builder = new StringBuilder();
        message.getReceivers().forEach( r -> {
            builder.append(r.getEmail());
            builder.append("; ");
        });

        details.add(new Info(Label.RECEIVER, builder.toString()));

        details.add(new Info(Label.SIGNATURE,
                message.getSignature() != null ?
                        message.getSignature().toString() : DEFAULT_SENDER));
        return details;
    }

    @Override
    protected String getSubject() {
        return message.getSubject();
    }

    @Override
    protected String getBody() {
        return message.getBody();
    }
}
