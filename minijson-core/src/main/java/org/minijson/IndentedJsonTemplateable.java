package org.minijson;


public interface IndentedJsonTemplateable extends JsonTemplateable
{
   String getJsonTemplate(int indent);
}
