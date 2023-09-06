<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


class NullableRequiredPropertyPostRequestBody
{
	#[\JMS\Serializer\Annotation\SerializedName('NullableOptionalInt')]
    #[\JMS\Serializer\Annotation\Type('int')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?int $nullableOptionalInt = null;
    
    /**
     * $nullableRequiredArray
     * 
     * @var array<float> $nullableRequiredArray
     */
	#[\JMS\Serializer\Annotation\SerializedName('NullableRequiredArray')]
    #[\JMS\Serializer\Annotation\Type('array<float>')]
    public array $nullableRequiredArray;
    
	#[\JMS\Serializer\Annotation\SerializedName('NullableRequiredEnum')]
    #[\JMS\Serializer\Annotation\Type('enum<OpenAPI\OpenAPI\Models\Operations\NullableRequiredPropertyPostRequestBodyNullableRequiredEnum>')]
    public NullableRequiredPropertyPostRequestBodyNullableRequiredEnum $nullableRequiredEnum;
    
	#[\JMS\Serializer\Annotation\SerializedName('NullableRequiredInt')]
    #[\JMS\Serializer\Annotation\Type('int')]
    public int $nullableRequiredInt;
    
	public function __construct()
	{
		$this->nullableOptionalInt = null;
		$this->nullableRequiredArray = [];
		$this->nullableRequiredEnum = \OpenAPI\OpenAPI\Models\Operations\NullableRequiredPropertyPostRequestBodyNullableRequiredEnum::First;
		$this->nullableRequiredInt = 0;
	}
}