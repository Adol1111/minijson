package org.minijson.util;


public final class CharacterUtil
{
    private CharacterUtil() {}

    
    // Note: http://en.wikipedia.org/wiki/Whitespace_character
    public static boolean isWhitespace(char ch)
    {
        // return Character.isWhitespace(ch);
        
        switch(ch) {
        case ' ':
        case '\t':
        case '\n':
        case '\r':
        // what else?
            return true;
        }
        return false;        
    }
    
    public static boolean isISOControl(char ch)
    {
        // return Character.isISOControl(ch);
        
        int code = (int) ch;
        if((code >= 0x0 && code <= 0x1f) || (code >= 0x7f && code <= 0x9f)) {
            return true;
        } else {
            return false;
        }
    }

}
