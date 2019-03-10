package bridge.objects;

import lombok.*;

import java.util.List;

/**
 * Created by 3len1 on 2/14/2019.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String subject;
    private Contact sender;
    private List<Contact> receivers;
    private String body;
    private Signature signature;
}
