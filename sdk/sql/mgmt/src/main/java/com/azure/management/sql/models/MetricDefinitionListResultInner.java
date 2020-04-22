// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The MetricDefinitionListResult model. */
@Fluent
public final class MetricDefinitionListResultInner {
    /*
     * The list of metric definitions for the database.
     */
    @JsonProperty(value = "value", required = true)
    private List<MetricDefinitionInner> value;

    /**
     * Get the value property: The list of metric definitions for the database.
     *
     * @return the value value.
     */
    public List<MetricDefinitionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of metric definitions for the database.
     *
     * @param value the value value to set.
     * @return the MetricDefinitionListResultInner object itself.
     */
    public MetricDefinitionListResultInner withValue(List<MetricDefinitionInner> value) {
        this.value = value;
        return this;
    }
}