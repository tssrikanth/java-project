/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for TspublicRestV2MetadataTagUnassignRequest type.
 */
public class TspublicRestV2MetadataTagUnassignRequest {
    private String name;
    private String id;
    private List<TsObjectInput> tsObject;

    /**
     * Default constructor.
     */
    public TspublicRestV2MetadataTagUnassignRequest() {
    }

    /**
     * Initialization constructor.
     * @param  tsObject  List of TsObjectInput value for tsObject.
     * @param  name  String value for name.
     * @param  id  String value for id.
     */
    public TspublicRestV2MetadataTagUnassignRequest(
            List<TsObjectInput> tsObject,
            String name,
            String id) {
        this.name = name;
        this.id = id;
        this.tsObject = tsObject;
    }

    /**
     * Getter for Name.
     * Name of the tag
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the tag
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Id.
     * The GUID of the tag
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The GUID of the tag
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for TsObject.
     * A JSON Array of GUIDs and type of metadata object.
     * @return Returns the List of TsObjectInput
     */
    @JsonGetter("tsObject")
    public List<TsObjectInput> getTsObject() {
        return tsObject;
    }

    /**
     * Setter for TsObject.
     * A JSON Array of GUIDs and type of metadata object.
     * @param tsObject Value for List of TsObjectInput
     */
    @JsonSetter("tsObject")
    public void setTsObject(List<TsObjectInput> tsObject) {
        this.tsObject = tsObject;
    }

    /**
     * Converts this TspublicRestV2MetadataTagUnassignRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2MetadataTagUnassignRequest [" + "tsObject=" + tsObject + ", name="
                + name + ", id=" + id + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(tsObject)
                .name(getName())
                .id(getId());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2MetadataTagUnassignRequest}.
     */
    public static class Builder {
        private List<TsObjectInput> tsObject;
        private String name;
        private String id;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  tsObject  List of TsObjectInput value for tsObject.
         */
        public Builder(List<TsObjectInput> tsObject) {
            this.tsObject = tsObject;
        }

        /**
         * Setter for tsObject.
         * @param  tsObject  List of TsObjectInput value for tsObject.
         * @return Builder
         */
        public Builder tsObject(List<TsObjectInput> tsObject) {
            this.tsObject = tsObject;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2MetadataTagUnassignRequest} object using the set
         * fields.
         * @return {@link TspublicRestV2MetadataTagUnassignRequest}
         */
        public TspublicRestV2MetadataTagUnassignRequest build() {
            return new TspublicRestV2MetadataTagUnassignRequest(tsObject, name, id);
        }
    }
}
