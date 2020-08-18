package carray.ast;

import polyglot.ast.*;
import polyglot.util.*;

import java.util.*;

/**
 * NodeFactory for carray extension.
 */
public class CArrayNodeFactory_c extends NodeFactory_c implements CArrayNodeFactory {
    public CArrayNodeFactory_c(CArrayLang lang, CArrayExtFactory extFactory) {
        super(lang, extFactory);
    }

    @Override
    public CArrayExtFactory extFactory() {
        return (CArrayExtFactory) super.extFactory();
    }

    // TODO:  Implement factory methods for new AST nodes.
    // TODO:  Override factory methods for overridden AST nodes.
    // TODO:  Override factory methods for AST nodes with new extension nodes.
}
