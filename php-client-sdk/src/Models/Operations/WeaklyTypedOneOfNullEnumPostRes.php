<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


/** WeaklyTypedOneOfNullEnumPostRes - OK */
class WeaklyTypedOneOfNullEnumPostRes
{
    #[\JMS\Serializer\Annotation\SerializedName('json')]
    #[\JMS\Serializer\Annotation\Type('mixed')]
    public mixed $json;

    public function __construct()
    {
        $this->json = null;
    }
}