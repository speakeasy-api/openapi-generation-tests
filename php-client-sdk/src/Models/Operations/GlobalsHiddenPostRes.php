<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Operations;


/** GlobalsHiddenPostRes - OK */
class GlobalsHiddenPostRes
{
    #[\JMS\Serializer\Annotation\SerializedName('args')]
    #[\JMS\Serializer\Annotation\Type('OpenAPI\OpenAPI\Models\Operations\Args')]
    public Args $args;

    /**
     * $headers
     *
     * @var array<string, string> $headers
     */
    #[\JMS\Serializer\Annotation\SerializedName('headers')]
    #[\JMS\Serializer\Annotation\Type('array<string, string>')]
    public array $headers;

    #[\JMS\Serializer\Annotation\SerializedName('json')]
    #[\JMS\Serializer\Annotation\Type('OpenAPI\OpenAPI\Models\Operations\GlobalsHiddenPostJson')]
    public GlobalsHiddenPostJson $json;

    #[\JMS\Serializer\Annotation\SerializedName('url')]
    #[\JMS\Serializer\Annotation\Type('string')]
    public string $url;

    public function __construct()
    {
        $this->args = new \OpenAPI\OpenAPI\Models\Operations\Args();
        $this->headers = [];
        $this->json = new \OpenAPI\OpenAPI\Models\Operations\GlobalsHiddenPostJson();
        $this->url = '';
    }
}