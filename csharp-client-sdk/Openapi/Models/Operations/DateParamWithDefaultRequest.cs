
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
    using NodaTime;
    using Openapi.Utils;
    
    public class DateParamWithDefaultRequest
    {

        /// <summary>
        /// A date parameter with a default value
        /// </summary>
        [SpeakeasyMetadata("queryParam:style=form,explode=true,name=dateInput")]
        public LocalDate DateInput { get; set; } = default!;
    }
}