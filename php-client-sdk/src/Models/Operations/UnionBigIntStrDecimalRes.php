<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


/** UnionBigIntStrDecimalRes - OK */
class UnionBigIntStrDecimalRes
{
    /**
     *
     * @var string|float $json
     */
    #[\JMS\Serializer\Annotation\SerializedName('json')]
    #[\JMS\Serializer\Annotation\Type('string|float')]
    public string|float $json;

    /**
     * @param  string|float|null  $json
     */
    public function __construct(string|float|null $json = null)
    {
        $this->json = $json;
    }
}