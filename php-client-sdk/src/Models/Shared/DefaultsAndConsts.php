<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Shared;


class DefaultsAndConsts
{
	#[\JMS\Serializer\Annotation\SerializedName('constBigInt')]
    #[\JMS\Serializer\Annotation\Type('int')]
    public int $constBigInt;
    
	#[\JMS\Serializer\Annotation\SerializedName('constBigIntStr')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $constBigIntStr;
    
	#[\JMS\Serializer\Annotation\SerializedName('constBool')]
    #[\JMS\Serializer\Annotation\Type('bool')]
    public bool $constBool;
    
	#[\JMS\Serializer\Annotation\SerializedName('constDate')]
    #[\JMS\Serializer\Annotation\Type("DateTime<'Y-m-d', '', '|Y-m-d'>")]
    public \DateTime $constDate;
    
	#[\JMS\Serializer\Annotation\SerializedName('constDateTime')]
    #[\JMS\Serializer\Annotation\Type("DateTime<'Y-m-d\TH:i:s.up'>")]
    public \DateTime $constDateTime;
    
	#[\JMS\Serializer\Annotation\SerializedName('constDecimal')]
    #[\JMS\Serializer\Annotation\Type('float')]
    public float $constDecimal;
    
	#[\JMS\Serializer\Annotation\SerializedName('constDecimalStr')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $constDecimalStr;
    
	#[\JMS\Serializer\Annotation\SerializedName('constEnumInt')]
    #[\JMS\Serializer\Annotation\Type('enum<OpenAPI\OpenAPI\Models\Shared\DefaultsAndConstsConstEnumInt>')]
    public DefaultsAndConstsConstEnumInt $constEnumInt;
    
	#[\JMS\Serializer\Annotation\SerializedName('constEnumStr')]
    #[\JMS\Serializer\Annotation\Type('enum<OpenAPI\OpenAPI\Models\Shared\DefaultsAndConstsConstEnumStr>')]
    public DefaultsAndConstsConstEnumStr $constEnumStr;
    
	#[\JMS\Serializer\Annotation\SerializedName('constInt')]
    #[\JMS\Serializer\Annotation\Type('int')]
    public int $constInt;
    
	#[\JMS\Serializer\Annotation\SerializedName('constNum')]
    #[\JMS\Serializer\Annotation\Type('float')]
    public float $constNum;
    
	#[\JMS\Serializer\Annotation\SerializedName('constStr')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $constStr;
    
	#[\JMS\Serializer\Annotation\SerializedName('constStrNull')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $constStrNull;
    
	#[\JMS\Serializer\Annotation\SerializedName('defaultBigInt')]
    #[\JMS\Serializer\Annotation\Type('int')]
    public int $defaultBigInt;
    
	#[\JMS\Serializer\Annotation\SerializedName('defaultBigIntStr')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $defaultBigIntStr;
    
	#[\JMS\Serializer\Annotation\SerializedName('defaultBool')]
    #[\JMS\Serializer\Annotation\Type('bool')]
    public bool $defaultBool;
    
	#[\JMS\Serializer\Annotation\SerializedName('defaultDate')]
    #[\JMS\Serializer\Annotation\Type("DateTime<'Y-m-d', '', '|Y-m-d'>")]
    public \DateTime $defaultDate;
    
	#[\JMS\Serializer\Annotation\SerializedName('defaultDateTime')]
    #[\JMS\Serializer\Annotation\Type("DateTime<'Y-m-d\TH:i:s.up'>")]
    public \DateTime $defaultDateTime;
    
	#[\JMS\Serializer\Annotation\SerializedName('defaultDecimal')]
    #[\JMS\Serializer\Annotation\Type('float')]
    public float $defaultDecimal;
    
	#[\JMS\Serializer\Annotation\SerializedName('defaultDecimalStr')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $defaultDecimalStr;
    
	#[\JMS\Serializer\Annotation\SerializedName('defaultEnumInt')]
    #[\JMS\Serializer\Annotation\Type('enum<OpenAPI\OpenAPI\Models\Shared\DefaultsAndConstsDefaultEnumInt>')]
    public DefaultsAndConstsDefaultEnumInt $defaultEnumInt;
    
	#[\JMS\Serializer\Annotation\SerializedName('defaultEnumStr')]
    #[\JMS\Serializer\Annotation\Type('enum<OpenAPI\OpenAPI\Models\Shared\DefaultsAndConstsDefaultEnumStr>')]
    public DefaultsAndConstsDefaultEnumStr $defaultEnumStr;
    
	#[\JMS\Serializer\Annotation\SerializedName('defaultInt')]
    #[\JMS\Serializer\Annotation\Type('int')]
    public int $defaultInt;
    
	#[\JMS\Serializer\Annotation\SerializedName('defaultNum')]
    #[\JMS\Serializer\Annotation\Type('float')]
    public float $defaultNum;
    
	#[\JMS\Serializer\Annotation\SerializedName('defaultStr')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $defaultStr;
    
	#[\JMS\Serializer\Annotation\SerializedName('defaultStrNullable')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $defaultStrNullable;
    
	#[\JMS\Serializer\Annotation\SerializedName('defaultStrOptional')]
    #[\JMS\Serializer\Annotation\Type('string')]
    #[\JMS\Serializer\Annotation\SkipWhenEmpty]
    public ?string $defaultStrOptional = null;
    
	#[\JMS\Serializer\Annotation\SerializedName('normalField')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $normalField;
    
	#[\JMS\Serializer\Annotation\SerializedName('singleEnumConstBool')]
    #[\JMS\Serializer\Annotation\Type('bool')]
    public bool $singleEnumConstBool;
    
	#[\JMS\Serializer\Annotation\SerializedName('singleEnumConstStr')]
    #[\JMS\Serializer\Annotation\Type('enum<OpenAPI\OpenAPI\Models\Shared\DefaultsAndConstsSingleEnumConstStr>')]
    public DefaultsAndConstsSingleEnumConstStr $singleEnumConstStr;
    
	public function __construct()
	{
		$this->constBigInt = 0;
		$this->constBigIntStr = "";
		$this->constBool = false;
		$this->constDate = new \DateTime();
		$this->constDateTime = new \DateTime();
		$this->constDecimal = 0;
		$this->constDecimalStr = "";
		$this->constEnumInt = \OpenAPI\OpenAPI\Models\Shared\DefaultsAndConstsConstEnumInt::One;
		$this->constEnumStr = \OpenAPI\OpenAPI\Models\Shared\DefaultsAndConstsConstEnumStr::One;
		$this->constInt = 0;
		$this->constNum = 0;
		$this->constStr = "";
		$this->constStrNull = "";
		$this->defaultBigInt = 0;
		$this->defaultBigIntStr = "";
		$this->defaultBool = false;
		$this->defaultDate = new \DateTime();
		$this->defaultDateTime = new \DateTime();
		$this->defaultDecimal = 0;
		$this->defaultDecimalStr = "";
		$this->defaultEnumInt = \OpenAPI\OpenAPI\Models\Shared\DefaultsAndConstsDefaultEnumInt::One;
		$this->defaultEnumStr = \OpenAPI\OpenAPI\Models\Shared\DefaultsAndConstsDefaultEnumStr::One;
		$this->defaultInt = 0;
		$this->defaultNum = 0;
		$this->defaultStr = "";
		$this->defaultStrNullable = "";
		$this->defaultStrOptional = null;
		$this->normalField = "";
		$this->singleEnumConstBool = false;
		$this->singleEnumConstStr = \OpenAPI\OpenAPI\Models\Shared\DefaultsAndConstsSingleEnumConstStr::One;
	}
}