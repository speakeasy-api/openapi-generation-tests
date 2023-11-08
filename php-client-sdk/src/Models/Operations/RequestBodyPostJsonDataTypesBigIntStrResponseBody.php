<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


/**
 * RequestBodyPostJsonDataTypesBigIntStrResponseBody - OK
 * 
 * @package OpenAPI\OpenAPI\Models\Operations
 * @access public
 */
class RequestBodyPostJsonDataTypesBigIntStrResponseBody
{
	#[\JMS\Serializer\Annotation\SerializedName('data')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $data;
    
	#[\JMS\Serializer\Annotation\SerializedName('json')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $json;
    
	public function __construct()
	{
		$this->data = "";
		$this->json = "";
	}
}