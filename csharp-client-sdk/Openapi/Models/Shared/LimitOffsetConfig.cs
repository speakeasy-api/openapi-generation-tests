
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
    
    public class LimitOffsetConfig
    {

        [JsonProperty("limit")]
        public long? Limit { get; set; }

        [JsonProperty("offset")]
        public long? Offset { get; set; }

        [JsonProperty("page")]
        public long? Page { get; set; }
    }
}