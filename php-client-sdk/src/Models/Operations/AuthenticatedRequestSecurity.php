<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;

use OpenAPI\OpenAPI\Utils\SpeakeasyMetadata;
class AuthenticatedRequestSecurity
{
    /**
     *
     * @var string $clientCredentials
     */
    #[SpeakeasyMetadata('security:scheme=true,type=oauth2,name=Authorization')]
    public string $clientCredentials;

    /**
     * @param  ?string  $clientCredentials
     */
    public function __construct(?string $clientCredentials = null)
    {
        $this->clientCredentials = $clientCredentials;
    }
}