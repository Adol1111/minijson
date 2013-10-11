package org.minijson.parser;

import java.io.IOException;
import java.io.Reader;


public interface JsonParser
{
    Object parse(String jsonStr) throws JsonParserException;
    Object parse(Reader reader) throws JsonParserException, IOException;
}
