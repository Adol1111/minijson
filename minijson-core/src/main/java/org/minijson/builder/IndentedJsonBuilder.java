package org.minijson.builder;

import java.io.IOException;
import java.io.Writer;


public interface IndentedJsonBuilder extends JsonBuilder
{
    String build(Object jsonObj, int indent) throws JsonBuilderException;
    void build(Writer writer, Object jsonObj, int indent) throws IOException, JsonBuilderException;

}
