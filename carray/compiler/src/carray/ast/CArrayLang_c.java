package carray.ast;

import polyglot.ast.*;
import polyglot.util.InternalCompilerError;

public class CArrayLang_c extends JLang_c implements CArrayLang {
    public static final CArrayLang_c instance = new CArrayLang_c();

    public static CArrayLang lang(NodeOps n) {
        while (n != null) {
            Lang lang = n.lang();
            if (lang instanceof CArrayLang) return (CArrayLang) lang;
            if (n instanceof Ext)
                n = ((Ext) n).pred();
            else return null;
        }
        throw new InternalCompilerError("Impossible to reach");
    }

    protected CArrayLang_c() {
    }

    protected static CArrayExt carrayExt(Node n) {
        return CArrayExt.ext(n);
    }

    @Override
    protected NodeOps NodeOps(Node n) {
        return carrayExt(n);
    }

    // TODO:  Implement dispatch methods for new AST operations.
    // TODO:  Override *Ops methods for AST nodes with new extension nodes.
}
