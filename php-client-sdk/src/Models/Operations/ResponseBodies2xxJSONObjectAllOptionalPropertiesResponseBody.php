<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


/** ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody - OK */
class ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody
{
    /**
     *
     * @var ?string $data
     */
    #[\Speakeasy\Serializer\Annotation\SerializedName('data')]
    #[\Speakeasy\Serializer\Annotation\SkipWhenNull]
    public ?string $data = null;

    /**
     * @param  ?string  $data
     */
    public function __construct(?string $data = null)
    {
        $this->data = $data;
    }
}