<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


class TestHooksArgs
{
	#[\JMS\Serializer\Annotation\SerializedName('someParam')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $someParam;
    
	public function __construct()
	{
		$this->someParam = "";
	}
}