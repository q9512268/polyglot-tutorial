package carray;

import java.io.Reader;

import polyglot.ast.NodeFactory;
import polyglot.frontend.CupParser;
import polyglot.frontend.FileSource;
import polyglot.frontend.Parser;
import polyglot.lex.Lexer;
import polyglot.types.TypeSystem;
import polyglot.util.ErrorQueue;
import carray.ast.CarrayNodeFactory_c;
import carray.parse.Grm;
import carray.parse.Lexer_c;
import carray.types.CarrayTypeSystem_c;

/**
 * Extension information for carray extension.
 */
public class ExtensionInfo extends polyglot.frontend.JLExtensionInfo {
    @Override
    public String defaultFileExtension() {
        return "jl";
    }

    @Override
    public Parser parser(Reader reader, FileSource source, ErrorQueue eq) {
        Lexer lexer = new Lexer_c(reader, source, eq);
        Grm grm = new Grm(lexer, ts, nf, eq);
        return new CupParser(grm, source, eq);
    }

    @Override
    protected NodeFactory createNodeFactory() {
        return new CarrayNodeFactory_c();
    }

    @Override
    protected TypeSystem createTypeSystem() {
        return new CarrayTypeSystem_c();
    }

}
