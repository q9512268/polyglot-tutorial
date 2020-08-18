package carray.ast;

import polyglot.ast.AbstractExtFactory_c;
import polyglot.ast.Ext;
import polyglot.ast.ExtFactory;

public abstract class CArrayAbstractExtFactory_c extends AbstractExtFactory_c
        implements CArrayExtFactory {

    public CArrayAbstractExtFactory_c() {
        super();
    }

    public CArrayAbstractExtFactory_c(ExtFactory nextExtFactory) {
        super(nextExtFactory);
    }

    // TODO: Implement factory methods for new extension nodes in future
    // extensions.  This entails calling the factory method for extension's
    // AST superclass.
}
