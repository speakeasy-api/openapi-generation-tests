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
    using Openapi.Models.Operations;
    using Openapi.Utils;
    
    /// <summary>
    /// OK
    /// </summary>
    public class NullableRequiredSharedObjectPostResponseBody
    {

        [JsonProperty("data")]
        public string? Data { get; set; }

        [JsonProperty("json")]
        public NullableRequiredSharedObjectPostJson? Json { get; set; }
    }
}