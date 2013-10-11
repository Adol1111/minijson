package org.minijson.parser;


// "Look ahead" tokenizing.
// In the current implementation, "look ahead" has a particular meaning.
// TBD: Need a better name...
public interface LookAheadJsonTokenizer extends JsonTokenizer
{    
    boolean isLookAheadParsing();
//    void setLookAheadParsing(boolean lookAheadParsing);
    void enableLookAheadParsing();
    void disableLookAheadParsing();

}
