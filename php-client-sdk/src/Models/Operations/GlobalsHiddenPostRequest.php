<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;

use OpenAPI\OpenAPI\Utils\SpeakeasyMetadata;
class GlobalsHiddenPostRequest
{
    #[SpeakeasyMetadata('request:mediaType=application/json')]
    public GlobalsHiddenPostRequestBody $requestBody;

    #[SpeakeasyMetadata('header:style=simple,explode=false,name=globalHiddenHeaderParam')]
    public ?string $globalHiddenHeaderParam = null;

    #[SpeakeasyMetadata('pathParam:style=simple,explode=false,name=globalHiddenPathParam')]
    public ?string $globalHiddenPathParam = null;

    #[SpeakeasyMetadata('queryParam:style=form,explode=true,name=globalHiddenQueryParam')]
    public ?string $globalHiddenQueryParam = null;

    public function __construct()
    {
        $this->requestBody = new \OpenAPI\OpenAPI\Models\Operations\GlobalsHiddenPostRequestBody();
        $this->globalHiddenHeaderParam = null;
        $this->globalHiddenPathParam = null;
        $this->globalHiddenQueryParam = null;
    }
}