// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ManagedInstancePairInfo model. */
@Fluent
public final class ManagedInstancePairInfo {
    /*
     * Id of Primary Managed Instance in pair.
     */
    @JsonProperty(value = "primaryManagedInstanceId")
    private String primaryManagedInstanceId;

    /*
     * Id of Partner Managed Instance in pair.
     */
    @JsonProperty(value = "partnerManagedInstanceId")
    private String partnerManagedInstanceId;

    /**
     * Get the primaryManagedInstanceId property: Id of Primary Managed Instance in pair.
     *
     * @return the primaryManagedInstanceId value.
     */
    public String primaryManagedInstanceId() {
        return this.primaryManagedInstanceId;
    }

    /**
     * Set the primaryManagedInstanceId property: Id of Primary Managed Instance in pair.
     *
     * @param primaryManagedInstanceId the primaryManagedInstanceId value to set.
     * @return the ManagedInstancePairInfo object itself.
     */
    public ManagedInstancePairInfo withPrimaryManagedInstanceId(String primaryManagedInstanceId) {
        this.primaryManagedInstanceId = primaryManagedInstanceId;
        return this;
    }

    /**
     * Get the partnerManagedInstanceId property: Id of Partner Managed Instance in pair.
     *
     * @return the partnerManagedInstanceId value.
     */
    public String partnerManagedInstanceId() {
        return this.partnerManagedInstanceId;
    }

    /**
     * Set the partnerManagedInstanceId property: Id of Partner Managed Instance in pair.
     *
     * @param partnerManagedInstanceId the partnerManagedInstanceId value to set.
     * @return the ManagedInstancePairInfo object itself.
     */
    public ManagedInstancePairInfo withPartnerManagedInstanceId(String partnerManagedInstanceId) {
        this.partnerManagedInstanceId = partnerManagedInstanceId;
        return this;
    }
}