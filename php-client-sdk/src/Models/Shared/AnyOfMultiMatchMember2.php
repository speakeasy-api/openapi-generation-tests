<?php

/**
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

declare(strict_types=1);

namespace OpenAPI\OpenAPI\Models\Shared;


class AnyOfMultiMatchMember2
{
    /**
     *
     * @var string $description
     */
    #[\JMS\Serializer\Annotation\SerializedName('description')]
    public string $description;

    /**
     *
     * @var ?string $details
     */
    #[\JMS\Serializer\Annotation\SerializedName('details')]
    #[\JMS\Serializer\Annotation\SkipWhenNull]
    public ?string $details = null;

    /**
     *
     * @var string $name
     */
    #[\JMS\Serializer\Annotation\SerializedName('name')]
    public string $name;

    /**
     * @param  string  $description
     * @param  string  $name
     * @param  ?string  $details
     */
    public function __construct(string $description, string $name, ?string $details = null)
    {
        $this->description = $description;
        $this->name = $name;
        $this->details = $details;
    }
}