//------------------------------------------------------------------------------
// <auto-generated>
// This code was generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
//
// Changes to this file may cause incorrect behavior and will be lost when
// the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
#nullable enable
namespace Openapi.Models.Errors
{
    using Newtonsoft.Json;
    using Openapi.Models.Errors;
    using Openapi.Utils;
    using System.Net.Http;
    using System;
    
    public class TaggedError1 : Exception
    {

        /// <summary>
        /// Raw HTTP response; suitable for custom response parsing
        /// </summary>
        [JsonProperty("-")]
        public HttpResponseMessage? RawResponse { get; set; }

        [JsonProperty("error")]
        public string Error { get; set; } = default!;

        [JsonProperty("tag")]
        public Models.Errors.Tag Tag { get; set; } = default!;
    }
}