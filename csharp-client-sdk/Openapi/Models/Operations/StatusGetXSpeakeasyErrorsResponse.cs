
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
    using Openapi.Models.Shared;
    using System.Net.Http;
    using System;
    
    public class StatusGetXSpeakeasyErrorsResponse
    {

        /// <summary>
        /// HTTP response content type for this operation
        /// </summary>
        public string? ContentType { get; set; } = default!;

        /// <summary>
        /// HTTP response status code for this operation
        /// </summary>
        public int StatusCode { get; set; } = default!;

        /// <summary>
        /// Raw HTTP response; suitable for custom response parsing
        /// </summary>
        public HttpResponseMessage? RawResponse { get; set; }

        /// <summary>
        /// Internal Server Error
        /// </summary>
        public Error? Error { get; set; }

        /// <summary>
        /// Not Implemented
        /// </summary>
        public StatusGetXSpeakeasyErrorsResponseBody? Object { get; set; }
    }
}