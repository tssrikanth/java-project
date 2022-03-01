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
 * This is a model class for ClientState type.
 */
public class ClientState {
    private String color;

    /**
     * Default constructor.
     */
    public ClientState() {
    }

    /**
     * Initialization constructor.
     * @param  color  String value for color.
     */
    public ClientState(
            String color) {
        this.color = color;
    }

    /**
     * Getter for Color.
     * Color assigned to the tag
     * @return Returns the String
     */
    @JsonGetter("color")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getColor() {
        return color;
    }

    /**
     * Setter for Color.
     * Color assigned to the tag
     * @param color Value for String
     */
    @JsonSetter("color")
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Converts this ClientState into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ClientState [" + "color=" + color + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .color(getColor());
        return builder;
    }

    /**
     * Class to build instances of {@link ClientState}.
     */
    public static class Builder {
        private String color;



        /**
         * Setter for color.
         * @param  color  String value for color.
         * @return Builder
         */
        public Builder color(String color) {
            this.color = color;
            return this;
        }

        /**
         * Builds a new {@link ClientState} object using the set fields.
         * @return {@link ClientState}
         */
        public ClientState build() {
            return new ClientState(color);
        }
    }
}
