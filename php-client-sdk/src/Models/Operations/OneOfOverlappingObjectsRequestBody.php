<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


class OneOfOverlappingObjectsRequestBody
{
    /**
     *
     * @var string $field1
     */
    #[\JMS\Serializer\Annotation\SerializedName('field1')]
    public string $field1;

    /**
     *
     * @var ?bool $field2
     */
    #[\JMS\Serializer\Annotation\SerializedName('field2')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?bool $field2 = null;

    /**
     *
     * @var ?float $field3
     */
    #[\JMS\Serializer\Annotation\SerializedName('field3')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?float $field3 = null;

    /**
     * @param  ?string  $field1
     * @param  ?bool  $field2
     * @param  ?float  $field3
     */
    public function __construct(?string $field1 = null, ?bool $field2 = null, ?float $field3 = null)
    {
        $this->field1 = $field1;
        $this->field2 = $field2;
        $this->field3 = $field3;
    }
}