package carray.ast;

import polyglot.ast.Ext;
import polyglot.ast.ExtFactory;

public final class CArrayExtFactory_c extends CArrayAbstractExtFactory_c {

    public CArrayExtFactory_c() {
        super();
    }

    public CArrayExtFactory_c(ExtFactory nextExtFactory) {
        super(nextExtFactory);
    }

    @Override
    protected Ext extNodeImpl() {
        return new CArrayExt();
    }

    // TODO: Override factory methods for new extension nodes in the current
    // extension.
}
