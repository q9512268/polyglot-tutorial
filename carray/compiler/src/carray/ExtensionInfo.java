package carray;

import polyglot.lex.Lexer;
import carray.parse.Lexer_c;
import carray.parse.Grm;
import carray.ast.*;
import carray.types.*;
import polyglot.ast.*;
import polyglot.frontend.*;
import polyglot.main.*;
import polyglot.types.*;
import polyglot.util.*;

import java.io.*;

/**
 * Extension information for carray extension.
 */
public class ExtensionInfo extends polyglot.frontend.JLExtensionInfo {
    static {
        // force Topics to load
        @SuppressWarnings("unused")
        Topics t = new Topics();
    }

    @Override
    public String defaultFileExtension() {
        return "car";
    }

    @Override
    public String compilerName() {
        return "carrayc";
    }

    @Override
    public Parser parser(Reader reader, FileSource source, ErrorQueue eq) {
        Lexer lexer = new Lexer_c(reader, source, eq);
        Grm grm = new Grm(lexer, ts, nf, eq);
        return new CupParser(grm, source, eq);
    }

    @Override
    protected NodeFactory createNodeFactory() {
        return new CArrayNodeFactory_c(CArrayLang_c.instance, new CArrayExtFactory_c());
    }

    @Override
    protected TypeSystem createTypeSystem() {
        return new CArrayTypeSystem_c();
    }

}
