package chainOfResponsibility.objects;

import chainOfResponsibility.enums.RequestType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by 3len1 on 2/4/2019.
 */
@Getter
@ToString
@AllArgsConstructor
public class Request {
    private String tittle;
    private String description;
    private RequestType type;
}
