package poglavlje04.syntaxtree.formal;

import poglavlje04.syntaxtree.Identifier;
import poglavlje04.syntaxtree.type.Type;

public class Formal {
    public Type argType;
    public Identifier argId;

    public Formal(Type argType, Identifier argId) {
        this.argType = argType;
        this.argId = argId;
    }
}
