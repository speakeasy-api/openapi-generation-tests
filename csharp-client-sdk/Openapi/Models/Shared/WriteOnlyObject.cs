
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
    
    public class WriteOnlyObject
    {

        [JsonProperty("bool")]
        public bool Bool { get; set; } = default!;

        [JsonProperty("num")]
        public double Num { get; set; } = default!;

        [JsonProperty("string")]
        public string String { get; set; } = default!;
    }
}