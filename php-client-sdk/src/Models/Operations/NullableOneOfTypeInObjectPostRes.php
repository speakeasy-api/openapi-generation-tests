<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


/**
 * NullableOneOfTypeInObjectPostRes - OK
 * 
 * @package OpenAPI\OpenAPI\Models\Operations
 * @access public
 */
class NullableOneOfTypeInObjectPostRes
{
	#[\JMS\Serializer\Annotation\SerializedName('json')]
    #[\JMS\Serializer\Annotation\Type('OpenAPI\OpenAPI\Models\Shared\NullableOneOfTypeInObject')]
    public \OpenAPI\OpenAPI\Models\Shared\NullableOneOfTypeInObject $json;
    
	public function __construct()
	{
		$this->json = new \OpenAPI\OpenAPI\Models\Shared\NullableOneOfTypeInObject();
	}
}
