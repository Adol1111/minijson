package org.minijson;

import java.io.IOException;
import java.io.Writer;

import org.minijson.builder.JsonBuilderException;



// JsonSerializable represents the "opposite" of JsonParseable.
public interface JsonSerializable
{
    // Note that if an object implements both JsonSerializable and JsonCompatible.
    // They should be "consistent".
    // The structure generated using the default depth of JsonCompatible.toJsonStructure(),
    //    should be compatible with the json string returned by toJsonString().
    String toJsonString() throws JsonBuilderException;
    void writeJsonString(Writer writer) throws IOException, JsonBuilderException;
}
