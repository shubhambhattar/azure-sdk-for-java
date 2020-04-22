// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DefaultErrorResponse model. */
@Immutable
public final class DefaultErrorResponse {
    /*
     * Error model.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private DefaultErrorResponseError error;

    /**
     * Get the error property: Error model.
     *
     * @return the error value.
     */
    public DefaultErrorResponseError error() {
        return this.error;
    }
}