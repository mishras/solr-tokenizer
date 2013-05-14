package org.apache.lucene.analysis.core;


import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.util.CharTokenizer;
import org.apache.lucene.util.Version;


import java.io.Reader;

/**
 * Created with IntelliJ IDEA.
 * User: mishras
 * Date: 5/10/13
 * Time: 4:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProductTokenizer extends CharTokenizer {

    /**
     * Construct a new ProductTokenizer.
     *
     * @param matchVersion
     *          Lucene version to match See {@link <a href="#version">above</a>}
     * @param in
     *          the input to split up into tokens
     */
    public ProductTokenizer(Version matchVersion, Reader in) {
        super(matchVersion, in);
    }

    /**
     * Construct a new ProductTokenizer using a given
     * {@link org.apache.lucene.util.AttributeSource.AttributeFactory}.
     *
     * @param matchVersion
     *          Lucene version to match See {@link <a href="#version">above</a>}
     * @param factory
     *          the attribute factory to use for this {@link Tokenizer}
     * @param in
     *          the input to split up into tokens
     */
    public ProductTokenizer(Version matchVersion, AttributeFactory factory, Reader in) {
        super(matchVersion, factory, in);
    }

    /**
     * Return true for every character, since product name can have any allowed character.
     *
     * @param i
     *          the code point
     * @return
     *          true or false
     */
    @Override
    protected boolean isTokenChar(int i) {
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /** Converts char to lower case only if it is a letter.
     * {@link Character#toLowerCase(int)}.*/
    @Override
    protected int normalize(int c) {

        if(Character.isLetter(c)){
            return Character.toLowerCase(c);
        }
        else{
            return c;
        }
    }
}
