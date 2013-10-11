package org.minijson.type;

import org.minijson.JsonCompatible;
import org.minijson.IndentedJsonSerializable;


public interface JsonNode extends IndentedJsonSerializable
{
    Object getValue();
    
//    boolean isObject();
//    boolean isArray();
//    boolean isString();
//    boolean isNumber();
//    boolean isBoolean();
//    boolean isNull();

//    boolean hasChildren();
//    List<JsonNode> getChildren();
//    
//    void addChild(JsonNode child);
//    void addChildren(List<JsonNode> children);
}
