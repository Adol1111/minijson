package org.minijson.builder;

import org.minijson.builder.policy.BuilderPolicy;


public interface FlexibleJsonBuilder extends JsonBuilder
{
    BuilderPolicy getBuilderPolicy();
}
