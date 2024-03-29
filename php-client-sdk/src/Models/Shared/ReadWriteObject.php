<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Shared;


class ReadWriteObject
{
	#[\JMS\Serializer\Annotation\SerializedName('num1')]
    #[\JMS\Serializer\Annotation\Type('int')]
    public int $num1;
    
	#[\JMS\Serializer\Annotation\SerializedName('num2')]
    #[\JMS\Serializer\Annotation\Type('int')]
    public int $num2;
    
	#[\JMS\Serializer\Annotation\SerializedName('num3')]
    #[\JMS\Serializer\Annotation\Type('int')]
    public int $num3;
    
	public function __construct()
	{
		$this->num1 = 0;
		$this->num2 = 0;
		$this->num3 = 0;
	}
}
