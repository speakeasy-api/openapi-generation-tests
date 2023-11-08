
//------------------------------------------------------------------------------
// <auto-generated>
// This code was generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
//
// Changes to this file may cause incorrect behavior and will be lost when
// the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
#nullable enable
namespace Openapi
{
    using Openapi.Models.Operations;
    using Openapi.Models.Shared;
    using Openapi.Utils;
    using System.Collections.Generic;
    using System.Net.Http.Headers;
    using System.Net.Http;
    using System.Threading.Tasks;
    using System;

    /// <summary>
    /// Endpoints for testing authentication.
    /// </summary>
    public interface IAuthNew
    {
        Task<ApiKeyAuthGlobalNewResponse> ApiKeyAuthGlobalNewAsync(AuthServiceRequestBody request, string? serverUrl = null);
        Task<AuthGlobalResponse> AuthGlobalAsync(AuthServiceRequestBody request, string? serverUrl = null);
        Task<BasicAuthNewResponse> BasicAuthNewAsync(BasicAuthNewSecurity security, AuthServiceRequestBody request, string? serverUrl = null);
        Task<MultipleMixedOptionsAuthResponse> MultipleMixedOptionsAuthAsync(MultipleMixedOptionsAuthSecurity security, AuthServiceRequestBody request, string? serverUrl = null);
        Task<MultipleMixedSchemeAuthResponse> MultipleMixedSchemeAuthAsync(MultipleMixedSchemeAuthSecurity security, AuthServiceRequestBody request, string? serverUrl = null);
        Task<MultipleOptionsWithMixedSchemesAuthResponse> MultipleOptionsWithMixedSchemesAuthAsync(MultipleOptionsWithMixedSchemesAuthSecurity security, AuthServiceRequestBody request, string? serverUrl = null);
        Task<MultipleOptionsWithSimpleSchemesAuthResponse> MultipleOptionsWithSimpleSchemesAuthAsync(MultipleOptionsWithSimpleSchemesAuthSecurity security, AuthServiceRequestBody request, string? serverUrl = null);
        Task<MultipleSimpleOptionsAuthResponse> MultipleSimpleOptionsAuthAsync(MultipleSimpleOptionsAuthSecurity security, AuthServiceRequestBody request, string? serverUrl = null);
        Task<MultipleSimpleSchemeAuthResponse> MultipleSimpleSchemeAuthAsync(MultipleSimpleSchemeAuthSecurity security, AuthServiceRequestBody request, string? serverUrl = null);
        Task<Oauth2AuthNewResponse> Oauth2AuthNewAsync(Oauth2AuthNewSecurity security, AuthServiceRequestBody request, string? serverUrl = null);
        Task<OpenIdConnectAuthNewResponse> OpenIdConnectAuthNewAsync(OpenIdConnectAuthNewSecurity security, AuthServiceRequestBody request, string? serverUrl = null);
    }

    /// <summary>
    /// Endpoints for testing authentication.
    /// </summary>
    public class AuthNew: IAuthNew
    {
        /**
        * ApiKeyAuthGlobalNewSERVERS contains the list of server urls available to the SDK.
        */
        public static readonly string[] ApiKeyAuthGlobalNewSERVERS = {
            "http://localhost:35456",
        };

        /**
        * AuthGlobalSERVERS contains the list of server urls available to the SDK.
        */
        public static readonly string[] AuthGlobalSERVERS = {
            "http://localhost:35456",
        };

        /**
        * BasicAuthNewSERVERS contains the list of server urls available to the SDK.
        */
        public static readonly string[] BasicAuthNewSERVERS = {
            "http://localhost:35456",
        };

        /**
        * MultipleMixedOptionsAuthSERVERS contains the list of server urls available to the SDK.
        */
        public static readonly string[] MultipleMixedOptionsAuthSERVERS = {
            "http://localhost:35456",
        };

        /**
        * MultipleMixedSchemeAuthSERVERS contains the list of server urls available to the SDK.
        */
        public static readonly string[] MultipleMixedSchemeAuthSERVERS = {
            "http://localhost:35456",
        };

        /**
        * MultipleOptionsWithMixedSchemesAuthSERVERS contains the list of server urls available to the SDK.
        */
        public static readonly string[] MultipleOptionsWithMixedSchemesAuthSERVERS = {
            "http://localhost:35456",
        };

        /**
        * MultipleOptionsWithSimpleSchemesAuthSERVERS contains the list of server urls available to the SDK.
        */
        public static readonly string[] MultipleOptionsWithSimpleSchemesAuthSERVERS = {
            "http://localhost:35456",
        };

        /**
        * MultipleSimpleOptionsAuthSERVERS contains the list of server urls available to the SDK.
        */
        public static readonly string[] MultipleSimpleOptionsAuthSERVERS = {
            "http://localhost:35456",
        };

        /**
        * MultipleSimpleSchemeAuthSERVERS contains the list of server urls available to the SDK.
        */
        public static readonly string[] MultipleSimpleSchemeAuthSERVERS = {
            "http://localhost:35456",
        };

        /**
        * Oauth2AuthNewSERVERS contains the list of server urls available to the SDK.
        */
        public static readonly string[] Oauth2AuthNewSERVERS = {
            "http://localhost:35456",
        };

        /**
        * OpenIdConnectAuthNewSERVERS contains the list of server urls available to the SDK.
        */
        public static readonly string[] OpenIdConnectAuthNewSERVERS = {
            "http://localhost:35456",
        };

        public SDKConfig Config { get; private set; }
        private const string _language = "csharp";
        private const string _sdkVersion = "0.2.0";
        private const string _sdkGenVersion = "2.181.1";
        private const string _openapiDocVersion = "0.1.0";
        private const string _userAgent = "speakeasy-sdk/csharp 0.2.0 2.181.1 0.1.0 openapi";
        private string _serverUrl = "";
        private ISpeakeasyHttpClient _defaultClient;
        private ISpeakeasyHttpClient _securityClient;

        public AuthNew(ISpeakeasyHttpClient defaultClient, ISpeakeasyHttpClient securityClient, string serverUrl, SDKConfig config)
        {
            _defaultClient = defaultClient;
            _securityClient = securityClient;
            _serverUrl = serverUrl;
            Config = config;
        }
        

        public async Task<ApiKeyAuthGlobalNewResponse> ApiKeyAuthGlobalNewAsync(AuthServiceRequestBody request, string? serverUrl = null)
        {
            string baseUrl = ApiKeyAuthGlobalNewSERVERS[0];
            if (!string.IsNullOrEmpty(serverUrl)) {
                baseUrl = serverUrl;
            }
            if (baseUrl.EndsWith("/"))
            {
                baseUrl = baseUrl.Substring(0, baseUrl.Length - 1);
            }
            var urlString = baseUrl + "/auth#apiKeyAuthGlobal";
            

            var httpRequest = new HttpRequestMessage(HttpMethod.Post, urlString);
            httpRequest.Headers.Add("x-speakeasy-user-agent", _userAgent);
            
            var serializedBody = RequestBodySerializer.Serialize(request, "Request", "json");
            if (serializedBody == null) 
            {
                throw new ArgumentNullException("request body is required");
            }
            else
            {
                httpRequest.Content = serializedBody;
            }
            
            var client = _securityClient;
            
            var httpResponse = await client.SendAsync(httpRequest);

            var contentType = httpResponse.Content.Headers.ContentType?.MediaType;
            
            var response = new ApiKeyAuthGlobalNewResponse
            {
                StatusCode = (int)httpResponse.StatusCode,
                ContentType = contentType,
                RawResponse = httpResponse
            };
            
            if((response.StatusCode == 200) || (response.StatusCode == 401))
            {
                
                return response;
            }
            return response;
        }
        

        public async Task<AuthGlobalResponse> AuthGlobalAsync(AuthServiceRequestBody request, string? serverUrl = null)
        {
            string baseUrl = AuthGlobalSERVERS[0];
            if (!string.IsNullOrEmpty(serverUrl)) {
                baseUrl = serverUrl;
            }
            if (baseUrl.EndsWith("/"))
            {
                baseUrl = baseUrl.Substring(0, baseUrl.Length - 1);
            }
            var urlString = baseUrl + "/auth#authGlobal";
            

            var httpRequest = new HttpRequestMessage(HttpMethod.Post, urlString);
            httpRequest.Headers.Add("x-speakeasy-user-agent", _userAgent);
            
            var serializedBody = RequestBodySerializer.Serialize(request, "Request", "json");
            if (serializedBody == null) 
            {
                throw new ArgumentNullException("request body is required");
            }
            else
            {
                httpRequest.Content = serializedBody;
            }
            
            var client = _securityClient;
            
            var httpResponse = await client.SendAsync(httpRequest);

            var contentType = httpResponse.Content.Headers.ContentType?.MediaType;
            
            var response = new AuthGlobalResponse
            {
                StatusCode = (int)httpResponse.StatusCode,
                ContentType = contentType,
                RawResponse = httpResponse
            };
            
            if((response.StatusCode == 200) || (response.StatusCode == 401))
            {
                
                return response;
            }
            return response;
        }
        

        public async Task<BasicAuthNewResponse> BasicAuthNewAsync(BasicAuthNewSecurity security, AuthServiceRequestBody request, string? serverUrl = null)
        {
            string baseUrl = BasicAuthNewSERVERS[0];
            if (!string.IsNullOrEmpty(serverUrl)) {
                baseUrl = serverUrl;
            }
            if (baseUrl.EndsWith("/"))
            {
                baseUrl = baseUrl.Substring(0, baseUrl.Length - 1);
            }
            var urlString = baseUrl + "/auth#basicAuth";
            

            var httpRequest = new HttpRequestMessage(HttpMethod.Post, urlString);
            httpRequest.Headers.Add("x-speakeasy-user-agent", _userAgent);
            
            var serializedBody = RequestBodySerializer.Serialize(request, "Request", "json");
            if (serializedBody == null) 
            {
                throw new ArgumentNullException("request body is required");
            }
            else
            {
                httpRequest.Content = serializedBody;
            }
            
            var client = SecuritySerializer.Apply(_defaultClient, security);
            
            var httpResponse = await client.SendAsync(httpRequest);

            var contentType = httpResponse.Content.Headers.ContentType?.MediaType;
            
            var response = new BasicAuthNewResponse
            {
                StatusCode = (int)httpResponse.StatusCode,
                ContentType = contentType,
                RawResponse = httpResponse
            };
            
            if((response.StatusCode == 200) || (response.StatusCode == 401))
            {
                
                return response;
            }
            return response;
        }
        

        public async Task<MultipleMixedOptionsAuthResponse> MultipleMixedOptionsAuthAsync(MultipleMixedOptionsAuthSecurity security, AuthServiceRequestBody request, string? serverUrl = null)
        {
            string baseUrl = MultipleMixedOptionsAuthSERVERS[0];
            if (!string.IsNullOrEmpty(serverUrl)) {
                baseUrl = serverUrl;
            }
            if (baseUrl.EndsWith("/"))
            {
                baseUrl = baseUrl.Substring(0, baseUrl.Length - 1);
            }
            var urlString = baseUrl + "/auth#multipleMixedOptionsAuth";
            

            var httpRequest = new HttpRequestMessage(HttpMethod.Post, urlString);
            httpRequest.Headers.Add("x-speakeasy-user-agent", _userAgent);
            
            var serializedBody = RequestBodySerializer.Serialize(request, "Request", "json");
            if (serializedBody == null) 
            {
                throw new ArgumentNullException("request body is required");
            }
            else
            {
                httpRequest.Content = serializedBody;
            }
            
            var client = SecuritySerializer.Apply(_defaultClient, security);
            
            var httpResponse = await client.SendAsync(httpRequest);

            var contentType = httpResponse.Content.Headers.ContentType?.MediaType;
            
            var response = new MultipleMixedOptionsAuthResponse
            {
                StatusCode = (int)httpResponse.StatusCode,
                ContentType = contentType,
                RawResponse = httpResponse
            };
            
            if((response.StatusCode == 200) || (response.StatusCode == 401))
            {
                
                return response;
            }
            return response;
        }
        

        public async Task<MultipleMixedSchemeAuthResponse> MultipleMixedSchemeAuthAsync(MultipleMixedSchemeAuthSecurity security, AuthServiceRequestBody request, string? serverUrl = null)
        {
            string baseUrl = MultipleMixedSchemeAuthSERVERS[0];
            if (!string.IsNullOrEmpty(serverUrl)) {
                baseUrl = serverUrl;
            }
            if (baseUrl.EndsWith("/"))
            {
                baseUrl = baseUrl.Substring(0, baseUrl.Length - 1);
            }
            var urlString = baseUrl + "/auth#multipleMixedSchemeAuth";
            

            var httpRequest = new HttpRequestMessage(HttpMethod.Post, urlString);
            httpRequest.Headers.Add("x-speakeasy-user-agent", _userAgent);
            
            var serializedBody = RequestBodySerializer.Serialize(request, "Request", "json");
            if (serializedBody == null) 
            {
                throw new ArgumentNullException("request body is required");
            }
            else
            {
                httpRequest.Content = serializedBody;
            }
            
            var client = SecuritySerializer.Apply(_defaultClient, security);
            
            var httpResponse = await client.SendAsync(httpRequest);

            var contentType = httpResponse.Content.Headers.ContentType?.MediaType;
            
            var response = new MultipleMixedSchemeAuthResponse
            {
                StatusCode = (int)httpResponse.StatusCode,
                ContentType = contentType,
                RawResponse = httpResponse
            };
            
            if((response.StatusCode == 200) || (response.StatusCode == 401))
            {
                
                return response;
            }
            return response;
        }
        

        public async Task<MultipleOptionsWithMixedSchemesAuthResponse> MultipleOptionsWithMixedSchemesAuthAsync(MultipleOptionsWithMixedSchemesAuthSecurity security, AuthServiceRequestBody request, string? serverUrl = null)
        {
            string baseUrl = MultipleOptionsWithMixedSchemesAuthSERVERS[0];
            if (!string.IsNullOrEmpty(serverUrl)) {
                baseUrl = serverUrl;
            }
            if (baseUrl.EndsWith("/"))
            {
                baseUrl = baseUrl.Substring(0, baseUrl.Length - 1);
            }
            var urlString = baseUrl + "/auth#multipleOptionsWithMixedSchemesAuth";
            

            var httpRequest = new HttpRequestMessage(HttpMethod.Post, urlString);
            httpRequest.Headers.Add("x-speakeasy-user-agent", _userAgent);
            
            var serializedBody = RequestBodySerializer.Serialize(request, "Request", "json");
            if (serializedBody == null) 
            {
                throw new ArgumentNullException("request body is required");
            }
            else
            {
                httpRequest.Content = serializedBody;
            }
            
            var client = SecuritySerializer.Apply(_defaultClient, security);
            
            var httpResponse = await client.SendAsync(httpRequest);

            var contentType = httpResponse.Content.Headers.ContentType?.MediaType;
            
            var response = new MultipleOptionsWithMixedSchemesAuthResponse
            {
                StatusCode = (int)httpResponse.StatusCode,
                ContentType = contentType,
                RawResponse = httpResponse
            };
            
            if((response.StatusCode == 200) || (response.StatusCode == 401))
            {
                
                return response;
            }
            return response;
        }
        

        public async Task<MultipleOptionsWithSimpleSchemesAuthResponse> MultipleOptionsWithSimpleSchemesAuthAsync(MultipleOptionsWithSimpleSchemesAuthSecurity security, AuthServiceRequestBody request, string? serverUrl = null)
        {
            string baseUrl = MultipleOptionsWithSimpleSchemesAuthSERVERS[0];
            if (!string.IsNullOrEmpty(serverUrl)) {
                baseUrl = serverUrl;
            }
            if (baseUrl.EndsWith("/"))
            {
                baseUrl = baseUrl.Substring(0, baseUrl.Length - 1);
            }
            var urlString = baseUrl + "/auth#multipleOptionsWithSimpleSchemesAuth";
            

            var httpRequest = new HttpRequestMessage(HttpMethod.Post, urlString);
            httpRequest.Headers.Add("x-speakeasy-user-agent", _userAgent);
            
            var serializedBody = RequestBodySerializer.Serialize(request, "Request", "json");
            if (serializedBody == null) 
            {
                throw new ArgumentNullException("request body is required");
            }
            else
            {
                httpRequest.Content = serializedBody;
            }
            
            var client = SecuritySerializer.Apply(_defaultClient, security);
            
            var httpResponse = await client.SendAsync(httpRequest);

            var contentType = httpResponse.Content.Headers.ContentType?.MediaType;
            
            var response = new MultipleOptionsWithSimpleSchemesAuthResponse
            {
                StatusCode = (int)httpResponse.StatusCode,
                ContentType = contentType,
                RawResponse = httpResponse
            };
            
            if((response.StatusCode == 200) || (response.StatusCode == 401))
            {
                
                return response;
            }
            return response;
        }
        

        public async Task<MultipleSimpleOptionsAuthResponse> MultipleSimpleOptionsAuthAsync(MultipleSimpleOptionsAuthSecurity security, AuthServiceRequestBody request, string? serverUrl = null)
        {
            string baseUrl = MultipleSimpleOptionsAuthSERVERS[0];
            if (!string.IsNullOrEmpty(serverUrl)) {
                baseUrl = serverUrl;
            }
            if (baseUrl.EndsWith("/"))
            {
                baseUrl = baseUrl.Substring(0, baseUrl.Length - 1);
            }
            var urlString = baseUrl + "/auth#multipleSimpleOptionsAuth";
            

            var httpRequest = new HttpRequestMessage(HttpMethod.Post, urlString);
            httpRequest.Headers.Add("x-speakeasy-user-agent", _userAgent);
            
            var serializedBody = RequestBodySerializer.Serialize(request, "Request", "json");
            if (serializedBody == null) 
            {
                throw new ArgumentNullException("request body is required");
            }
            else
            {
                httpRequest.Content = serializedBody;
            }
            
            var client = SecuritySerializer.Apply(_defaultClient, security);
            
            var httpResponse = await client.SendAsync(httpRequest);

            var contentType = httpResponse.Content.Headers.ContentType?.MediaType;
            
            var response = new MultipleSimpleOptionsAuthResponse
            {
                StatusCode = (int)httpResponse.StatusCode,
                ContentType = contentType,
                RawResponse = httpResponse
            };
            
            if((response.StatusCode == 200) || (response.StatusCode == 401))
            {
                
                return response;
            }
            return response;
        }
        

        public async Task<MultipleSimpleSchemeAuthResponse> MultipleSimpleSchemeAuthAsync(MultipleSimpleSchemeAuthSecurity security, AuthServiceRequestBody request, string? serverUrl = null)
        {
            string baseUrl = MultipleSimpleSchemeAuthSERVERS[0];
            if (!string.IsNullOrEmpty(serverUrl)) {
                baseUrl = serverUrl;
            }
            if (baseUrl.EndsWith("/"))
            {
                baseUrl = baseUrl.Substring(0, baseUrl.Length - 1);
            }
            var urlString = baseUrl + "/auth#multipleSimpleSchemeAuth";
            

            var httpRequest = new HttpRequestMessage(HttpMethod.Post, urlString);
            httpRequest.Headers.Add("x-speakeasy-user-agent", _userAgent);
            
            var serializedBody = RequestBodySerializer.Serialize(request, "Request", "json");
            if (serializedBody == null) 
            {
                throw new ArgumentNullException("request body is required");
            }
            else
            {
                httpRequest.Content = serializedBody;
            }
            
            var client = SecuritySerializer.Apply(_defaultClient, security);
            
            var httpResponse = await client.SendAsync(httpRequest);

            var contentType = httpResponse.Content.Headers.ContentType?.MediaType;
            
            var response = new MultipleSimpleSchemeAuthResponse
            {
                StatusCode = (int)httpResponse.StatusCode,
                ContentType = contentType,
                RawResponse = httpResponse
            };
            
            if((response.StatusCode == 200) || (response.StatusCode == 401))
            {
                
                return response;
            }
            return response;
        }
        

        public async Task<Oauth2AuthNewResponse> Oauth2AuthNewAsync(Oauth2AuthNewSecurity security, AuthServiceRequestBody request, string? serverUrl = null)
        {
            string baseUrl = Oauth2AuthNewSERVERS[0];
            if (!string.IsNullOrEmpty(serverUrl)) {
                baseUrl = serverUrl;
            }
            if (baseUrl.EndsWith("/"))
            {
                baseUrl = baseUrl.Substring(0, baseUrl.Length - 1);
            }
            var urlString = baseUrl + "/auth#oauth2Auth";
            

            var httpRequest = new HttpRequestMessage(HttpMethod.Post, urlString);
            httpRequest.Headers.Add("x-speakeasy-user-agent", _userAgent);
            
            var serializedBody = RequestBodySerializer.Serialize(request, "Request", "json");
            if (serializedBody == null) 
            {
                throw new ArgumentNullException("request body is required");
            }
            else
            {
                httpRequest.Content = serializedBody;
            }
            
            var client = SecuritySerializer.Apply(_defaultClient, security);
            
            var httpResponse = await client.SendAsync(httpRequest);

            var contentType = httpResponse.Content.Headers.ContentType?.MediaType;
            
            var response = new Oauth2AuthNewResponse
            {
                StatusCode = (int)httpResponse.StatusCode,
                ContentType = contentType,
                RawResponse = httpResponse
            };
            
            if((response.StatusCode == 200) || (response.StatusCode == 401))
            {
                
                return response;
            }
            return response;
        }
        

        public async Task<OpenIdConnectAuthNewResponse> OpenIdConnectAuthNewAsync(OpenIdConnectAuthNewSecurity security, AuthServiceRequestBody request, string? serverUrl = null)
        {
            string baseUrl = OpenIdConnectAuthNewSERVERS[0];
            if (!string.IsNullOrEmpty(serverUrl)) {
                baseUrl = serverUrl;
            }
            if (baseUrl.EndsWith("/"))
            {
                baseUrl = baseUrl.Substring(0, baseUrl.Length - 1);
            }
            var urlString = baseUrl + "/auth#openIdConnectAuth";
            

            var httpRequest = new HttpRequestMessage(HttpMethod.Post, urlString);
            httpRequest.Headers.Add("x-speakeasy-user-agent", _userAgent);
            
            var serializedBody = RequestBodySerializer.Serialize(request, "Request", "json");
            if (serializedBody == null) 
            {
                throw new ArgumentNullException("request body is required");
            }
            else
            {
                httpRequest.Content = serializedBody;
            }
            
            var client = SecuritySerializer.Apply(_defaultClient, security);
            
            var httpResponse = await client.SendAsync(httpRequest);

            var contentType = httpResponse.Content.Headers.ContentType?.MediaType;
            
            var response = new OpenIdConnectAuthNewResponse
            {
                StatusCode = (int)httpResponse.StatusCode,
                ContentType = contentType,
                RawResponse = httpResponse
            };
            
            if((response.StatusCode == 200) || (response.StatusCode == 401))
            {
                
                return response;
            }
            return response;
        }
        
    }
}