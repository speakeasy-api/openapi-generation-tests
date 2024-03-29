<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Shared;


/**
 * FakerFormattedStrings - A set of strings with format values that lead to relevant examples being generated for them
 * 
 * @package OpenAPI\OpenAPI\Models\Shared
 * @access public
 */
class FakerFormattedStrings
{
    /**
     * A field that will have an address generated as example
     * 
     * @var ?string $addressFormat
     */
	#[\JMS\Serializer\Annotation\SerializedName('addressFormat')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $addressFormat = null;
    
    /**
     * A field that will have a directory path generated as example
     * 
     * @var ?string $directoryFormat
     */
	#[\JMS\Serializer\Annotation\SerializedName('directoryFormat')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $directoryFormat = null;
    
    /**
     * A field that will have a domain name generated as example
     * 
     * @var ?string $domainFormat
     */
	#[\JMS\Serializer\Annotation\SerializedName('domainFormat')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $domainFormat = null;
    
    /**
     * A field that will have an email address generated as example
     * 
     * @var ?string $emailFormat
     */
	#[\JMS\Serializer\Annotation\SerializedName('emailFormat')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $emailFormat = null;
    
    /**
     * A field that will have a filename generated as example
     * 
     * @var ?string $filenameFormat
     */
	#[\JMS\Serializer\Annotation\SerializedName('filenameFormat')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $filenameFormat = null;
    
    /**
     * A field that will have a file path generated as example
     * 
     * @var ?string $filepathFormat
     */
	#[\JMS\Serializer\Annotation\SerializedName('filepathFormat')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $filepathFormat = null;
    
    /**
     * A field that will have a image url generated as example
     * 
     * @var ?string $imageFormat
     */
	#[\JMS\Serializer\Annotation\SerializedName('imageFormat')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $imageFormat = null;
    
    /**
     * A field that will have an IPv4 address generated as example
     * 
     * @var ?string $ipv4Format
     */
	#[\JMS\Serializer\Annotation\SerializedName('ipv4Format')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $ipv4Format = null;
    
    /**
     * A field that will have an IPv6 address generated as example
     * 
     * @var ?string $ipv6Format
     */
	#[\JMS\Serializer\Annotation\SerializedName('ipv6Format')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $ipv6Format = null;
    
    /**
     * A field that will have a JSON generated as example
     * 
     * @var ?string $jsonFormat
     */
	#[\JMS\Serializer\Annotation\SerializedName('jsonFormat')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $jsonFormat = null;
    
    /**
     * A field that will have a MAC address generated as example
     * 
     * @var ?string $macFormat
     */
	#[\JMS\Serializer\Annotation\SerializedName('macFormat')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $macFormat = null;
    
    /**
     * A field that will have a fake password generated as example
     * 
     * @var ?string $passwordFormat
     */
	#[\JMS\Serializer\Annotation\SerializedName('passwordFormat')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $passwordFormat = null;
    
    /**
     * A field that will have a phone number generated as example
     * 
     * @var ?string $phoneFormat
     */
	#[\JMS\Serializer\Annotation\SerializedName('phoneFormat')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $phoneFormat = null;
    
    /**
     * A field that will have a timezone generated as example
     * 
     * @var ?string $timezoneFormat
     */
	#[\JMS\Serializer\Annotation\SerializedName('timezoneFormat')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $timezoneFormat = null;
    
    /**
     * A field that will have random words generated as example
     * 
     * @var ?string $unknownFormat
     */
	#[\JMS\Serializer\Annotation\SerializedName('unknownFormat')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $unknownFormat = null;
    
    /**
     * A field that will have a URL generated as example
     * 
     * @var ?string $urlFormat
     */
	#[\JMS\Serializer\Annotation\SerializedName('urlFormat')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $urlFormat = null;
    
    /**
     * A field that will have a UUID generated as example
     * 
     * @var ?string $uuidFormat
     */
	#[\JMS\Serializer\Annotation\SerializedName('uuidFormat')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $uuidFormat = null;
    
    /**
     * A field that will have a postal code generated as example
     * 
     * @var ?string $zipcodeFormat
     */
	#[\JMS\Serializer\Annotation\SerializedName('zipcodeFormat')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $zipcodeFormat = null;
    
	public function __construct()
	{
		$this->addressFormat = null;
		$this->directoryFormat = null;
		$this->domainFormat = null;
		$this->emailFormat = null;
		$this->filenameFormat = null;
		$this->filepathFormat = null;
		$this->imageFormat = null;
		$this->ipv4Format = null;
		$this->ipv6Format = null;
		$this->jsonFormat = null;
		$this->macFormat = null;
		$this->passwordFormat = null;
		$this->phoneFormat = null;
		$this->timezoneFormat = null;
		$this->unknownFormat = null;
		$this->urlFormat = null;
		$this->uuidFormat = null;
		$this->zipcodeFormat = null;
	}
}
