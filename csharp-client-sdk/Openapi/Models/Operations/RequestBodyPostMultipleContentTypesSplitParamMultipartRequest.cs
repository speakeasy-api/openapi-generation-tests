
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
    using Openapi.Utils;
    
    public class RequestBodyPostMultipleContentTypesSplitParamMultipartRequest
    {

        [SpeakeasyMetadata("request:mediaType=multipart/form-data")]
        public RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody RequestBody { get; set; } = default!;

        [SpeakeasyMetadata("queryParam:style=form,explode=true,name=paramStr")]
        public string ParamStr { get; set; } = default!;
    }
}