<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


/**
 * RequestBodyPostJSONDataTypesArrayBigInt200ApplicationJSON - OK
 * 
 * @package OpenAPI\OpenAPI\Models\Operations
 * @access public
 */
class RequestBodyPostJSONDataTypesArrayBigInt200ApplicationJSON
{
    /**
     * $json
     * 
     * @var array<int> $json
     */
	#[\JMS\Serializer\Annotation\SerializedName('json')]
    #[\JMS\Serializer\Annotation\Type('array<int>')]
    public array $json;
    
	public function __construct()
	{
		$this->json = [];
	}
}