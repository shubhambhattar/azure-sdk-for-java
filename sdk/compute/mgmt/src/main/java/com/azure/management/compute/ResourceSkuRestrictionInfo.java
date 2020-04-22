// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResourceSkuRestrictionInfo model. */
@Immutable
public final class ResourceSkuRestrictionInfo {
    /*
     * Locations where the SKU is restricted
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> locations;

    /*
     * List of availability zones where the SKU is restricted.
     */
    @JsonProperty(value = "zones", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> zones;

    /**
     * Get the locations property: Locations where the SKU is restricted.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Get the zones property: List of availability zones where the SKU is restricted.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }
}