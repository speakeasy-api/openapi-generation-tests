<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Shared;


/** FakerCamelCasePropertyNameStrings - A set of strings with camel case fieldnames that lead to relevant examples being generated for them */
class FakerCamelCasePropertyNameStrings
{
    /**
     *
     * @var string $city
     */
    #[\Speakeasy\Serializer\Annotation\SerializedName('City')]
    public string $city;

    /**
     *
     * @var string $iban
     */
    #[\Speakeasy\Serializer\Annotation\SerializedName('IBAN')]
    public string $iban;

    /**
     *
     * @var string $id
     */
    #[\Speakeasy\Serializer\Annotation\SerializedName('ID')]
    public string $id;

    /**
     *
     * @var string $iPv4
     */
    #[\Speakeasy\Serializer\Annotation\SerializedName('IPv4')]
    public string $iPv4;

    /**
     *
     * @var string $iPv6
     */
    #[\Speakeasy\Serializer\Annotation\SerializedName('IPv6')]
    public string $iPv6;

    /**
     * @param  string  $city
     * @param  string  $iban
     * @param  string  $id
     * @param  string  $iPv4
     * @param  string  $iPv6
     */
    public function __construct(string $city, string $iban, string $id, string $iPv4, string $iPv6)
    {
        $this->city = $city;
        $this->iban = $iban;
        $this->id = $id;
        $this->iPv4 = $iPv4;
        $this->iPv6 = $iPv6;
    }
}