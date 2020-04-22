/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This property is required for providing the region and new quota limits.
 */
public class QuotaChangeRequest {
    /**
     * Region for which the quota increase request is being made.
     */
    @JsonProperty(value = "region")
    private String region;

    /**
     * Payload of the quota increase request.
     */
    @JsonProperty(value = "payload")
    private String payload;

    /**
     * Get region for which the quota increase request is being made.
     *
     * @return the region value
     */
    public String region() {
        return this.region;
    }

    /**
     * Set region for which the quota increase request is being made.
     *
     * @param region the region value to set
     * @return the QuotaChangeRequest object itself.
     */
    public QuotaChangeRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get payload of the quota increase request.
     *
     * @return the payload value
     */
    public String payload() {
        return this.payload;
    }

    /**
     * Set payload of the quota increase request.
     *
     * @param payload the payload value to set
     * @return the QuotaChangeRequest object itself.
     */
    public QuotaChangeRequest withPayload(String payload) {
        this.payload = payload;
        return this;
    }

}