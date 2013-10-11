package org.minijson.parser;

import java.io.IOException;
import java.io.Reader;

import org.minijson.type.JsonNode;


public interface RichJsonParser extends JsonParser
{
    JsonNode parseJson(String jsonStr) throws JsonParserException;
    JsonNode parseJson(Reader reader) throws JsonParserException, IOException;
    // JsonObject parseObject();
    // JsonArray parseArray();
}
