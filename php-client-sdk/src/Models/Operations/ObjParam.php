<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;

use \OpenAPI\OpenAPI\Utils\SpeakeasyMetadata;
/**
 * ObjParam
 * 
 * @package OpenAPI\OpenAPI\Models\Operations
 * @access public
 */
class ObjParam
{
	#[SpeakeasyMetadata('queryParam:name=encoded_count')]
    public ?string $encodedCount = null;
    
	#[SpeakeasyMetadata('queryParam:name=encoded_term')]
    public ?string $encodedTerm = null;
    
	public function __construct()
	{
		$this->encodedCount = null;
		$this->encodedTerm = null;
	}
}
