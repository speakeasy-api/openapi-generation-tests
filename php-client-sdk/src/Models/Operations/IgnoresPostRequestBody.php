<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


class IgnoresPostRequestBody
{
	#[\JMS\Serializer\Annotation\SerializedName('callbackUrl')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $callbackUrl = null;
    
	#[\JMS\Serializer\Annotation\SerializedName('testProp')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $testProp = null;
    
	public function __construct()
	{
		$this->callbackUrl = null;
		$this->testProp = null;
	}
}
