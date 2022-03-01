/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost;

import localhost.http.client.ReadonlyHttpClientConfiguration;

/**
 * Configuration Interface for the library.
 */
public interface Configuration {

    /**
     * Current API environment.
     * @return a copy of environment
     */
    Environment getEnvironment();

    /**
     * baseUrl value.
     * @return a copy of baseUrl
     */
    String getBaseUrl();

    /**
     * Mandatory header with value Thougtspot to accept the external RestAPI requests.
     * @return a copy of xRequestedBy
     */
    String getXRequestedBy();

    /**
     * response format.
     * @return a copy of acceptLanguage
     */
    String getAcceptLanguage();

    /**
     * body content type for post request.
     * @return a copy of contentType
     */
    String getContentType();

    /**
     * Http Client Configuration instance.
     * @return a copy of httpClientConfig
     */
    ReadonlyHttpClientConfiguration getHttpClientConfig();

    /**
     * The timeout to use for making HTTP requests. The timeout to use for making HTTP requests.
     * @return a copy of timeout
     */
    long timeout();

    /**
     * OAuth 2.0 Access Token.
     * @return accessToken
     */
    String getAccessToken();

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    String getBaseUri(Server server);

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    String getBaseUri();
}
