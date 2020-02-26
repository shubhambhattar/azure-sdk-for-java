/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The key vault properties for the encryption scope. This is a required field
 * if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
 */
public class EncryptionScopeKeyVaultProperties {
    /**
     * The object identifier for a key vault key object. When applied, the
     * encryption scope will use the key referenced by the identifier to enable
     * customer-managed key support on this encryption scope.
     */
    @JsonProperty(value = "keyUri")
    private String keyUri;

    /**
     * Get the object identifier for a key vault key object. When applied, the encryption scope will use the key referenced by the identifier to enable customer-managed key support on this encryption scope.
     *
     * @return the keyUri value
     */
    public String keyUri() {
        return this.keyUri;
    }

    /**
     * Set the object identifier for a key vault key object. When applied, the encryption scope will use the key referenced by the identifier to enable customer-managed key support on this encryption scope.
     *
     * @param keyUri the keyUri value to set
     * @return the EncryptionScopeKeyVaultProperties object itself.
     */
    public EncryptionScopeKeyVaultProperties withKeyUri(String keyUri) {
        this.keyUri = keyUri;
        return this;
    }

}