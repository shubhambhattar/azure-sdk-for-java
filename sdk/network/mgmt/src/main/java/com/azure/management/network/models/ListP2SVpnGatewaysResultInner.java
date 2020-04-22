// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ListP2SVpnGatewaysResult model. */
@Fluent
public final class ListP2SVpnGatewaysResultInner {
    /*
     * List of P2SVpnGateways.
     */
    @JsonProperty(value = "value")
    private List<P2SVpnGatewayInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of P2SVpnGateways.
     *
     * @return the value value.
     */
    public List<P2SVpnGatewayInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of P2SVpnGateways.
     *
     * @param value the value value to set.
     * @return the ListP2SVpnGatewaysResultInner object itself.
     */
    public ListP2SVpnGatewaysResultInner withValue(List<P2SVpnGatewayInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the ListP2SVpnGatewaysResultInner object itself.
     */
    public ListP2SVpnGatewaysResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}