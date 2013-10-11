package org.minijson.parser;

import org.minijson.parser.policy.ParserPolicy;


public interface FlexibleJsonTokenizer extends JsonTokenizer
{
    ParserPolicy getParserPolicy();
}
