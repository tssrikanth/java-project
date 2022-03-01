/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.http.client;

import localhost.http.request.HttpRequest;

/**
 * Callback to be called before and after the HTTP call for an endpoint is made.
 */
public interface HttpCallback {

    /**
     * Callback called just before the HTTP request is sent.
     * @param request The HTTP request to be executed
     */
    public void onBeforeRequest(HttpRequest request);
    
    /**
     * Callback called just after the HTTP response is received.
     * @param context Context for the HTTP call
     */
    public void onAfterResponse(HttpContext context);
}