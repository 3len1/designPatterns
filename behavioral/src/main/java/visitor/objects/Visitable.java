package visitor.objects;

import visitor.visitors.Visitor;

/**
 * Created by 3len1 on 2/8/2019.
 */
public interface Visitable {
    public void accept(Visitor visitor);
}
