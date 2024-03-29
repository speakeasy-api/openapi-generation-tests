<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


/**
 * ResponseBodyAdditionalPropertiesDatePostResponseBody - OK
 * 
 * @package OpenAPI\OpenAPI\Models\Operations
 * @access public
 */
class ResponseBodyAdditionalPropertiesDatePostResponseBody
{
    /**
     * $json
     * 
     * @var array<string, \DateTime> $json
     */
	#[\JMS\Serializer\Annotation\SerializedName('json')]
    #[\JMS\Serializer\Annotation\Type('array<string, DateTime>')]
    public array $json;
    
	public function __construct()
	{
		$this->json = [];
	}
}
