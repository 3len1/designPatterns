package observer.observers;

import observer.objects.Message;

/**
 * Created by 3len1 on 2/5/2019.
 */
public abstract class Observer {
    protected Message message;

    public abstract void update();
}
