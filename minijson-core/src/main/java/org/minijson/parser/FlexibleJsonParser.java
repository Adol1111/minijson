package org.minijson.parser;

import org.minijson.parser.policy.ParserPolicy;


public interface FlexibleJsonParser extends JsonParser
{
    ParserPolicy getParserPolicy();
}
