<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


/** NullableOptionalFieldsPostResponseBody - OK */
class NullableOptionalFieldsPostResponseBody
{
    /**
     *
     * @var NullableOptionalFieldsPostJson $json
     */
    #[\JMS\Serializer\Annotation\SerializedName('json')]
    #[\JMS\Serializer\Annotation\Type('\OpenAPI\OpenAPI\Models\Operations\NullableOptionalFieldsPostJson')]
    public NullableOptionalFieldsPostJson $json;

    /**
     * @param  ?NullableOptionalFieldsPostJson  $json
     */
    public function __construct(?NullableOptionalFieldsPostJson $json = null)
    {
        $this->json = $json;
    }
}