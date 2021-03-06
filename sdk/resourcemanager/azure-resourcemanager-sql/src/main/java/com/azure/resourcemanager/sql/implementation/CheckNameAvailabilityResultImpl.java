// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.sql.implementation;

import com.azure.resourcemanager.resources.fluentcore.model.implementation.WrapperImpl;
import com.azure.resourcemanager.sql.models.CheckNameAvailabilityResult;
import com.azure.resourcemanager.sql.fluent.models.CheckNameAvailabilityResponseInner;

/** Implementation for CheckNameAvailabilityResult. */
public class CheckNameAvailabilityResultImpl extends WrapperImpl<CheckNameAvailabilityResponseInner>
    implements CheckNameAvailabilityResult {
    /**
     * Creates an instance of the check name availability result object.
     *
     * @param inner the inner object
     */
    CheckNameAvailabilityResultImpl(CheckNameAvailabilityResponseInner inner) {
        super(inner);
    }

    @Override
    public boolean isAvailable() {
        return this.innerModel().available();
    }

    @Override
    public String unavailabilityReason() {
        return this.innerModel().reason() != null ? this.innerModel().reason().toString() : null;
    }

    @Override
    public String unavailabilityMessage() {
        return this.innerModel().message();
    }
}
