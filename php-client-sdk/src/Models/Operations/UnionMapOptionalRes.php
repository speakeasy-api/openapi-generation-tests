<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


/** UnionMapOptionalRes - OK */
class UnionMapOptionalRes
{
    /**
     *
     * @var UnionMapOptionalJson $json
     */
    #[\JMS\Serializer\Annotation\SerializedName('json')]
    #[\JMS\Serializer\Annotation\Type('\OpenAPI\OpenAPI\Models\Operations\UnionMapOptionalJson')]
    public UnionMapOptionalJson $json;

    /**
     * @param  UnionMapOptionalJson  $json
     */
    public function __construct(UnionMapOptionalJson $json)
    {
        $this->json = $json;
    }
}