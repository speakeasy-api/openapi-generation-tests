
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
    using System;
    
    /// <summary>
    /// An enum type
    /// </summary>
    public enum EnumParameter
    {
        [JsonProperty("value1")]
        Value1,
        [JsonProperty("value2")]
        Value2,
        [JsonProperty("value3")]
        Value3,
    }

    public static class EnumParameterExtension
    {
        public static string Value(this EnumParameter value)
        {
            return ((JsonPropertyAttribute)value.GetType().GetMember(value.ToString())[0].GetCustomAttributes(typeof(JsonPropertyAttribute), false)[0]).PropertyName ?? value.ToString();
        }

        public static EnumParameter ToEnum(this string value)
        {
            foreach(var field in typeof(EnumParameter).GetFields())
            {
                var attributes = field.GetCustomAttributes(typeof(JsonPropertyAttribute), false);
                if (attributes.Length == 0)
                {
                    continue;
                }

                var attribute = attributes[0] as JsonPropertyAttribute;
                if (attribute != null && attribute.PropertyName == value)
                {
                    var enumVal = field.GetValue(null);

                    if (enumVal is EnumParameter)
                    {
                        return (EnumParameter)enumVal;
                    }
                }
            }

            throw new Exception($"Unknown value {value} for enum EnumParameter");
        }
    }
}