<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


class RetriesFlatEmptyResponsePostRequestBody
{
    #[\JMS\Serializer\Annotation\SerializedName('field_one')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $fieldOne;

    public function __construct()
    {
        $this->fieldOne = '';
    }
}