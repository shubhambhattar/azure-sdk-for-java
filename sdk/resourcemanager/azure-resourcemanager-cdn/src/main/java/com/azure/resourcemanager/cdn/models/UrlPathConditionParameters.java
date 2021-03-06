// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the parameters for the URL path condition. */
@Fluent
public final class UrlPathConditionParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UrlPathConditionParameters.class);

    /*
     * The @odata.type property.
     */
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType;

    /*
     * A URL path for the condition of the delivery rule
     */
    @JsonProperty(value = "path", required = true)
    private String path;

    /*
     * The match type for the condition of the delivery rule
     */
    @JsonProperty(value = "matchType", required = true)
    private UrlPathConditionParametersMatchType matchType;

    /** Creates an instance of UrlPathConditionParameters class. */
    public UrlPathConditionParameters() {
        odataType = "Microsoft.Azure.Cdn.Models.DeliveryRuleUrlPathConditionParameters";
    }

    /**
     * Get the odataType property: The @odata.type property.
     *
     * @return the odataType value.
     */
    public String odataType() {
        return this.odataType;
    }

    /**
     * Set the odataType property: The @odata.type property.
     *
     * @param odataType the odataType value to set.
     * @return the UrlPathConditionParameters object itself.
     */
    public UrlPathConditionParameters withOdataType(String odataType) {
        this.odataType = odataType;
        return this;
    }

    /**
     * Get the path property: A URL path for the condition of the delivery rule.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: A URL path for the condition of the delivery rule.
     *
     * @param path the path value to set.
     * @return the UrlPathConditionParameters object itself.
     */
    public UrlPathConditionParameters withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the matchType property: The match type for the condition of the delivery rule.
     *
     * @return the matchType value.
     */
    public UrlPathConditionParametersMatchType matchType() {
        return this.matchType;
    }

    /**
     * Set the matchType property: The match type for the condition of the delivery rule.
     *
     * @param matchType the matchType value to set.
     * @return the UrlPathConditionParameters object itself.
     */
    public UrlPathConditionParameters withMatchType(UrlPathConditionParametersMatchType matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (path() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property path in model UrlPathConditionParameters"));
        }
        if (matchType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property matchType in model UrlPathConditionParameters"));
        }
    }
}
