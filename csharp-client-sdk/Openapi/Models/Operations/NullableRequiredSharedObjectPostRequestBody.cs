
//------------------------------------------------------------------------------
// <auto-generated>
// This code was generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
//
// Changes to this file may cause incorrect behavior and will be lost when
// the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
#nullable enable
namespace Openapi.Models.Operations
{
    using Newtonsoft.Json;
    using Openapi.Models.Shared;
    
    public class NullableRequiredSharedObjectPostRequestBody
    {

        [JsonProperty("NullableRequiredObj")]
        public NullableObject NullableRequiredObj { get; set; } = default!;

        [JsonProperty("NullableOptionalObj")]
        public NullableObject? NullableOptionalObj { get; set; }
    }
}