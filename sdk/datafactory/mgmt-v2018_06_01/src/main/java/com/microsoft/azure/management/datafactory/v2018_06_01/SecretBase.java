/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The base definition of a secret type.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SecretBase.class)
@JsonTypeName("SecretBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SecureString", value = SecureString.class),
    @JsonSubTypes.Type(name = "AzureKeyVaultSecret", value = AzureKeyVaultSecretReference.class)
})
public class SecretBase {
}