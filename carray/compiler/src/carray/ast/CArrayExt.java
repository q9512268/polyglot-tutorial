package carray.ast;

import polyglot.ast.*;
import polyglot.util.InternalCompilerError;
import polyglot.util.SerialVersionUID;

public class CArrayExt extends Ext_c {
    private static final long serialVersionUID = SerialVersionUID.generate();

    public static CArrayExt ext(Node n) {
        Ext e = n.ext();
        while (e != null && !(e instanceof CArrayExt)) {
            e = e.ext();
        }
        if (e == null) {
            throw new InternalCompilerError("No CArray extension object for node "
                    + n + " (" + n.getClass() + ")", n.position());
        }
        return (CArrayExt) e;
    }

    @Override
    public final CArrayLang lang() {
        return CArrayLang_c.instance;
    }

    // TODO:  Override operation methods for overridden AST operations.
}
