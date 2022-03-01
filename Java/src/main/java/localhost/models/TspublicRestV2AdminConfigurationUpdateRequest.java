/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for TspublicRestV2AdminConfigurationUpdateRequest type.
 */
public class TspublicRestV2AdminConfigurationUpdateRequest {
    private String configuration;

    /**
     * Default constructor.
     */
    public TspublicRestV2AdminConfigurationUpdateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  configuration  String value for configuration.
     */
    public TspublicRestV2AdminConfigurationUpdateRequest(
            String configuration) {
        this.configuration = configuration;
    }

    /**
     * Getter for Configuration.
     * A JSON file with the key-value pair of configuration attributes to be updated. Example:
     * {"defaultChartDataSize": 5000}
     * @return Returns the String
     */
    @JsonGetter("configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getConfiguration() {
        return configuration;
    }

    /**
     * Setter for Configuration.
     * A JSON file with the key-value pair of configuration attributes to be updated. Example:
     * {"defaultChartDataSize": 5000}
     * @param configuration Value for String
     */
    @JsonSetter("configuration")
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * Converts this TspublicRestV2AdminConfigurationUpdateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2AdminConfigurationUpdateRequest [" + "configuration=" + configuration
                + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .configuration(getConfiguration());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2AdminConfigurationUpdateRequest}.
     */
    public static class Builder {
        private String configuration;



        /**
         * Setter for configuration.
         * @param  configuration  String value for configuration.
         * @return Builder
         */
        public Builder configuration(String configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2AdminConfigurationUpdateRequest} object using the set
         * fields.
         * @return {@link TspublicRestV2AdminConfigurationUpdateRequest}
         */
        public TspublicRestV2AdminConfigurationUpdateRequest build() {
            return new TspublicRestV2AdminConfigurationUpdateRequest(configuration);
        }
    }
}
