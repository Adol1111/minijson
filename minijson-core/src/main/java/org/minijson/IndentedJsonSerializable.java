package org.minijson;

import java.io.IOException;
import java.io.Writer;

import org.minijson.builder.JsonBuilderException;



// JsonSerializable represents the "opposite" of JsonParseable.
public interface IndentedJsonSerializable extends JsonSerializable
{
    // TBD:
    // Move "indent" options to BuilderPolicy ????
    String toJsonString(int indent) throws JsonBuilderException;
    void writeJsonString(Writer writer, int indent) throws IOException, JsonBuilderException;

    // String toJsonString(JsonCompatible jsonObj);
    // String toJsonString(Object obj);
}
