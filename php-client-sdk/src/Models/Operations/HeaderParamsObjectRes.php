<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


/**
 * HeaderParamsObjectRes - OK
 * 
 * @package OpenAPI\OpenAPI\Models\Operations
 * @access public
 */
class HeaderParamsObjectRes
{
	#[\JMS\Serializer\Annotation\SerializedName('headers')]
    #[\JMS\Serializer\Annotation\Type('OpenAPI\OpenAPI\Models\Operations\HeaderParamsObjectHeaders')]
    public HeaderParamsObjectHeaders $headers;
    
	public function __construct()
	{
		$this->headers = new \OpenAPI\OpenAPI\Models\Operations\HeaderParamsObjectHeaders();
	}
}
