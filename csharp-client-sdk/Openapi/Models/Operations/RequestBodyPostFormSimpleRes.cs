
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
    
    /// <summary>
    /// OK
    /// </summary>
    public class RequestBodyPostFormSimpleRes
    {

        [JsonProperty("form")]
        public RequestBodyPostFormSimpleForm Form { get; set; } = default!;

        [JsonProperty("headers")]
        public RequestBodyPostFormSimpleHeaders Headers { get; set; } = default!;
    }
}