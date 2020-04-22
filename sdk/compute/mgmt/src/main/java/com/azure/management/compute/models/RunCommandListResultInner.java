// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RunCommandListResult model. */
@Fluent
public final class RunCommandListResultInner {
    /*
     * The list of virtual machine run commands.
     */
    @JsonProperty(value = "value", required = true)
    private List<RunCommandDocumentBaseInner> value;

    /*
     * The uri to fetch the next page of run commands. Call ListNext() with
     * this to fetch the next page of run commands.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of virtual machine run commands.
     *
     * @return the value value.
     */
    public List<RunCommandDocumentBaseInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of virtual machine run commands.
     *
     * @param value the value value to set.
     * @return the RunCommandListResultInner object itself.
     */
    public RunCommandListResultInner withValue(List<RunCommandDocumentBaseInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of run commands. Call ListNext() with this to fetch the
     * next page of run commands.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of run commands. Call ListNext() with this to fetch the
     * next page of run commands.
     *
     * @param nextLink the nextLink value to set.
     * @return the RunCommandListResultInner object itself.
     */
    public RunCommandListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}