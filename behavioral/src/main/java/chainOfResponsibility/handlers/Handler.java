package chainOfResponsibility.handlers;

import chainOfResponsibility.objects.Request;

/**
 * Created by 3len1 on 2/4/2019.
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);

}
