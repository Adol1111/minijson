package org.minijson.parser;

import org.minijson.parser.core.JsonToken;
import org.minijson.parser.exception.JsonTokenizerException;


public interface JsonTokenizer
{
    /**
     * @return true if there is more tokens in the stream.
     * @throws JsonTokenizerException
     */
    boolean hasMore() throws JsonTokenizerException;
    
    /**
     * @return the next token.
     * @throws JsonTokenizerException
     */
    JsonToken next() throws JsonTokenizerException;
    
    /**
     * @return the next token, without removing it from the stream.
     * @throws JsonTokenizerException
     */
    JsonToken peek() throws JsonTokenizerException;

}
