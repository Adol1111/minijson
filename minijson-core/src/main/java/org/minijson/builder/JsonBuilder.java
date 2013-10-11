package org.minijson.builder;

import java.io.IOException;
import java.io.Writer;


// Builds JSON strings from a given object.
public interface JsonBuilder
{
    /////////////////////////////////////////////////////////////////
    // The following corresponds to the methods in JsonSerializable
    
    String build(Object jsonObj) throws JsonBuilderException;
    void build(Writer writer, Object jsonObj) throws IOException, JsonBuilderException;

}
