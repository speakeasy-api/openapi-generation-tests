<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


class HeaderParamsArrayHeaders
{
    /**
     *
     * @var string $xHeaderArray
     */
    #[\JMS\Serializer\Annotation\SerializedName('X-Header-Array')]
    public string $xHeaderArray;

    /**
     * @param  ?string  $xHeaderArray
     */
    public function __construct(?string $xHeaderArray = null)
    {
        $this->xHeaderArray = $xHeaderArray;
    }
}