<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


/**
 * NullableTypedObjectPostRes - OK
 * 
 * @package OpenAPI\OpenAPI\Models\Operations
 * @access public
 */
class NullableTypedObjectPostRes
{
	#[\JMS\Serializer\Annotation\SerializedName('json')]
    #[\JMS\Serializer\Annotation\Type('OpenAPI\OpenAPI\Models\Shared\TypedObject1')]
    public \OpenAPI\OpenAPI\Models\Shared\TypedObject1 $json;
    
	public function __construct()
	{
		$this->json = new \OpenAPI\OpenAPI\Models\Shared\TypedObject1();
	}
}
