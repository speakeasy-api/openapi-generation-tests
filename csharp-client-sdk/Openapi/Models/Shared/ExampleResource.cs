
//------------------------------------------------------------------------------
// <auto-generated>
// This code was generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
//
// Changes to this file may cause incorrect behavior and will be lost when
// the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
#nullable enable
namespace Openapi.Models.Shared
{
    using Newtonsoft.Json;
    using System.Collections.Generic;
    using System;
    
    public class ExampleResource
    {

        [JsonProperty("chocolates")]
        public List<Chocolates> Chocolates { get; set; } = default!;

        [JsonProperty("id")]
        public string Id { get; set; } = default!;

        [JsonProperty("name")]
        public string Name { get; set; } = default!;

        [JsonProperty("vehicle")]
        public object Vehicle { get; set; } = default!;

        [JsonProperty("arrayOfNumber")]
        public List<double>? ArrayOfNumber { get; set; }

        [JsonProperty("arrayOfString")]
        public List<string>? ArrayOfString { get; set; }

        [JsonProperty("createdAt")]
        public DateTime? CreatedAt { get; set; }

        [JsonProperty("enumNumber")]
        public EnumNumber? EnumNumber { get; set; }

        [JsonProperty("enumStr")]
        public EnumStr? EnumStr { get; set; }

        [JsonProperty("inlineObject")]
        public InlineObject? InlineObject { get; set; }

        [JsonProperty("mapOfInteger")]
        public Dictionary<string, long>? MapOfInteger { get; set; }

        [JsonProperty("mapOfString")]
        public Dictionary<string, string>? MapOfString { get; set; }

        [JsonProperty("name_prefix")]
        public string? NamePrefix { get; set; }

        [JsonProperty("updatedAt")]
        public DateTime? UpdatedAt { get; set; }
    }
}