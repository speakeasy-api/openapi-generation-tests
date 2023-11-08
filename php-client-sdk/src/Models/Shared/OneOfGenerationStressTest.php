<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Shared;


class OneOfGenerationStressTest
{
	#[\JMS\Serializer\Annotation\SerializedName('any')]
    #[\JMS\Serializer\Annotation\Type('mixed')]
    public mixed $any;
    
	#[\JMS\Serializer\Annotation\SerializedName('nullableAny')]
    #[\JMS\Serializer\Annotation\Type('mixed')]
    public mixed $nullableAny;
    
	#[\JMS\Serializer\Annotation\SerializedName('oneOfFromArrayOfTypes')]
    #[\JMS\Serializer\Annotation\Type('mixed')]
    public mixed $oneOfFromArrayOfTypes;
    
	#[\JMS\Serializer\Annotation\SerializedName('oneOfSameType')]
    #[\JMS\Serializer\Annotation\Type('mixed')]
    public mixed $oneOfSameType;
    
	public function __construct()
	{
		$this->any = null;
		$this->nullableAny = null;
		$this->oneOfFromArrayOfTypes = null;
		$this->oneOfSameType = null;
	}
}