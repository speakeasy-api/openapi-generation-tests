<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


/** IgnoredGenerationPutResponseBody - OK */
class IgnoredGenerationPutResponseBody
{
    /**
     *
     * @var ?string $json
     */
    #[\JMS\Serializer\Annotation\SerializedName('json')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $json = null;

    /**
     * @param  ?string  $json
     */
    public function __construct(?string $json = null)
    {
        $this->json = $json;
    }
}