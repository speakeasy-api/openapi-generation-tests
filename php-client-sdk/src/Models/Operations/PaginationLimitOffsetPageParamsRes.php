<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


/**
 * PaginationLimitOffsetPageParamsRes - OK
 * 
 * @package OpenAPI\OpenAPI\Models\Operations
 * @access public
 */
class PaginationLimitOffsetPageParamsRes
{
	#[\JMS\Serializer\Annotation\SerializedName('numPages')]
    #[\JMS\Serializer\Annotation\Type('int')]
    public int $numPages;
    
    /**
     * $resultArray
     * 
     * @var array<int> $resultArray
     */
	#[\JMS\Serializer\Annotation\SerializedName('resultArray')]
    #[\JMS\Serializer\Annotation\Type('array<int>')]
    public array $resultArray;
    
	public function __construct()
	{
		$this->numPages = 0;
		$this->resultArray = [];
	}
}
