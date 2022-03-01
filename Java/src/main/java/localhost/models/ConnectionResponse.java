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
 * This is a model class for ConnectionResponse type.
 */
public class ConnectionResponse {
    private String name;
    private String description;
    private String type;
    private String id;
    private Boolean scheduled;
    private String connectionType;
    private String configuration;
    private Boolean isExternal;
    private Boolean isDeprecated;
    private Boolean isDeleted;
    private Boolean isHidden;
    private Boolean complete;
    private Double indexVersion;
    private Double generationNum;
    private String created;
    private String modified;
    private UserNameAndID author;
    private UserNameAndID modifiedBy;
    private UserNameAndID owner;
    private List<String> tags;
    private List<TableList> tables;

    /**
     * Default constructor.
     */
    public ConnectionResponse() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  type  String value for type.
     * @param  id  String value for id.
     * @param  scheduled  Boolean value for scheduled.
     * @param  connectionType  String value for connectionType.
     * @param  configuration  String value for configuration.
     * @param  isExternal  Boolean value for isExternal.
     * @param  isDeprecated  Boolean value for isDeprecated.
     * @param  isDeleted  Boolean value for isDeleted.
     * @param  isHidden  Boolean value for isHidden.
     * @param  complete  Boolean value for complete.
     * @param  indexVersion  Double value for indexVersion.
     * @param  generationNum  Double value for generationNum.
     * @param  created  String value for created.
     * @param  modified  String value for modified.
     * @param  author  UserNameAndID value for author.
     * @param  modifiedBy  UserNameAndID value for modifiedBy.
     * @param  owner  UserNameAndID value for owner.
     * @param  tags  List of String value for tags.
     * @param  tables  List of TableList value for tables.
     */
    public ConnectionResponse(
            String name,
            String description,
            String type,
            String id,
            Boolean scheduled,
            String connectionType,
            String configuration,
            Boolean isExternal,
            Boolean isDeprecated,
            Boolean isDeleted,
            Boolean isHidden,
            Boolean complete,
            Double indexVersion,
            Double generationNum,
            String created,
            String modified,
            UserNameAndID author,
            UserNameAndID modifiedBy,
            UserNameAndID owner,
            List<String> tags,
            List<TableList> tables) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.id = id;
        this.scheduled = scheduled;
        this.connectionType = connectionType;
        this.configuration = configuration;
        this.isExternal = isExternal;
        this.isDeprecated = isDeprecated;
        this.isDeleted = isDeleted;
        this.isHidden = isHidden;
        this.complete = complete;
        this.indexVersion = indexVersion;
        this.generationNum = generationNum;
        this.created = created;
        this.modified = modified;
        this.author = author;
        this.modifiedBy = modifiedBy;
        this.owner = owner;
        this.tags = tags;
        this.tables = tables;
    }

    /**
     * Getter for Name.
     * Name of the connection
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the connection
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Description.
     * Description associated with the connection
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Description associated with the connection
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Type.
     * Type of the connection. The database associated with this type can be obtained from the
     * response returned by the /tspublic/rest/v2/connection/types API endpoint.
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of the connection. The database associated with this type can be obtained from the
     * response returned by the /tspublic/rest/v2/connection/types API endpoint.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Id.
     * GUID of the connection
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * GUID of the connection
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Scheduled.
     * Indicates if the data sync is scheduled for this connection
     * @return Returns the Boolean
     */
    @JsonGetter("scheduled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getScheduled() {
        return scheduled;
    }

    /**
     * Setter for Scheduled.
     * Indicates if the data sync is scheduled for this connection
     * @param scheduled Value for Boolean
     */
    @JsonSetter("scheduled")
    public void setScheduled(Boolean scheduled) {
        this.scheduled = scheduled;
    }

    /**
     * Getter for ConnectionType.
     * @return Returns the String
     */
    @JsonGetter("connectionType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * Setter for ConnectionType.
     * @param connectionType Value for String
     */
    @JsonSetter("connectionType")
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * Getter for Configuration.
     * Configuration properties of the connection
     * @return Returns the String
     */
    @JsonGetter("configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getConfiguration() {
        return configuration;
    }

    /**
     * Setter for Configuration.
     * Configuration properties of the connection
     * @param configuration Value for String
     */
    @JsonSetter("configuration")
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * Getter for IsExternal.
     * @return Returns the Boolean
     */
    @JsonGetter("isExternal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsExternal() {
        return isExternal;
    }

    /**
     * Setter for IsExternal.
     * @param isExternal Value for Boolean
     */
    @JsonSetter("isExternal")
    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
    }

    /**
     * Getter for IsDeprecated.
     * Indicates if the connection is deprecated
     * @return Returns the Boolean
     */
    @JsonGetter("isDeprecated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsDeprecated() {
        return isDeprecated;
    }

    /**
     * Setter for IsDeprecated.
     * Indicates if the connection is deprecated
     * @param isDeprecated Value for Boolean
     */
    @JsonSetter("isDeprecated")
    public void setIsDeprecated(Boolean isDeprecated) {
        this.isDeprecated = isDeprecated;
    }

    /**
     * Getter for IsDeleted.
     * Indicates if the connection is deleted
     * @return Returns the Boolean
     */
    @JsonGetter("isDeleted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * Setter for IsDeleted.
     * Indicates if the connection is deleted
     * @param isDeleted Value for Boolean
     */
    @JsonSetter("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Getter for IsHidden.
     * Indicates if the connection is hideen
     * @return Returns the Boolean
     */
    @JsonGetter("isHidden")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsHidden() {
        return isHidden;
    }

    /**
     * Setter for IsHidden.
     * Indicates if the connection is hideen
     * @param isHidden Value for Boolean
     */
    @JsonSetter("isHidden")
    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    /**
     * Getter for Complete.
     * Indicates if the all the properties of connection is provided
     * @return Returns the Boolean
     */
    @JsonGetter("complete")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getComplete() {
        return complete;
    }

    /**
     * Setter for Complete.
     * Indicates if the all the properties of connection is provided
     * @param complete Value for Boolean
     */
    @JsonSetter("complete")
    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    /**
     * Getter for IndexVersion.
     * @return Returns the Double
     */
    @JsonGetter("indexVersion")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getIndexVersion() {
        return indexVersion;
    }

    /**
     * Setter for IndexVersion.
     * @param indexVersion Value for Double
     */
    @JsonSetter("indexVersion")
    public void setIndexVersion(Double indexVersion) {
        this.indexVersion = indexVersion;
    }

    /**
     * Getter for GenerationNum.
     * @return Returns the Double
     */
    @JsonGetter("generationNum")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getGenerationNum() {
        return generationNum;
    }

    /**
     * Setter for GenerationNum.
     * @param generationNum Value for Double
     */
    @JsonSetter("generationNum")
    public void setGenerationNum(Double generationNum) {
        this.generationNum = generationNum;
    }

    /**
     * Getter for Created.
     * Date and time when the connection was created
     * @return Returns the String
     */
    @JsonGetter("created")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreated() {
        return created;
    }

    /**
     * Setter for Created.
     * Date and time when the connection was created
     * @param created Value for String
     */
    @JsonSetter("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Getter for Modified.
     * Date and time of last modification of the connection
     * @return Returns the String
     */
    @JsonGetter("modified")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getModified() {
        return modified;
    }

    /**
     * Setter for Modified.
     * Date and time of last modification of the connection
     * @param modified Value for String
     */
    @JsonSetter("modified")
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * Getter for Author.
     * @return Returns the UserNameAndID
     */
    @JsonGetter("author")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UserNameAndID getAuthor() {
        return author;
    }

    /**
     * Setter for Author.
     * @param author Value for UserNameAndID
     */
    @JsonSetter("author")
    public void setAuthor(UserNameAndID author) {
        this.author = author;
    }

    /**
     * Getter for ModifiedBy.
     * @return Returns the UserNameAndID
     */
    @JsonGetter("modifiedBy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UserNameAndID getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Setter for ModifiedBy.
     * @param modifiedBy Value for UserNameAndID
     */
    @JsonSetter("modifiedBy")
    public void setModifiedBy(UserNameAndID modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Getter for Owner.
     * @return Returns the UserNameAndID
     */
    @JsonGetter("owner")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UserNameAndID getOwner() {
        return owner;
    }

    /**
     * Setter for Owner.
     * @param owner Value for UserNameAndID
     */
    @JsonSetter("owner")
    public void setOwner(UserNameAndID owner) {
        this.owner = owner;
    }

    /**
     * Getter for Tags.
     * List of tags assigned to the connection
     * @return Returns the List of String
     */
    @JsonGetter("tags")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getTags() {
        return tags;
    }

    /**
     * Setter for Tags.
     * List of tags assigned to the connection
     * @param tags Value for List of String
     */
    @JsonSetter("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * Getter for Tables.
     * List of tables linked to this connection
     * @return Returns the List of TableList
     */
    @JsonGetter("tables")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TableList> getTables() {
        return tables;
    }

    /**
     * Setter for Tables.
     * List of tables linked to this connection
     * @param tables Value for List of TableList
     */
    @JsonSetter("tables")
    public void setTables(List<TableList> tables) {
        this.tables = tables;
    }

    /**
     * Converts this ConnectionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ConnectionResponse [" + "name=" + name + ", description=" + description + ", type="
                + type + ", id=" + id + ", scheduled=" + scheduled + ", connectionType="
                + connectionType + ", configuration=" + configuration + ", isExternal=" + isExternal
                + ", isDeprecated=" + isDeprecated + ", isDeleted=" + isDeleted + ", isHidden="
                + isHidden + ", complete=" + complete + ", indexVersion=" + indexVersion
                + ", generationNum=" + generationNum + ", created=" + created + ", modified="
                + modified + ", author=" + author + ", modifiedBy=" + modifiedBy + ", owner="
                + owner + ", tags=" + tags + ", tables=" + tables + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .description(getDescription())
                .type(getType())
                .id(getId())
                .scheduled(getScheduled())
                .connectionType(getConnectionType())
                .configuration(getConfiguration())
                .isExternal(getIsExternal())
                .isDeprecated(getIsDeprecated())
                .isDeleted(getIsDeleted())
                .isHidden(getIsHidden())
                .complete(getComplete())
                .indexVersion(getIndexVersion())
                .generationNum(getGenerationNum())
                .created(getCreated())
                .modified(getModified())
                .author(getAuthor())
                .modifiedBy(getModifiedBy())
                .owner(getOwner())
                .tags(getTags())
                .tables(getTables());
        return builder;
    }

    /**
     * Class to build instances of {@link ConnectionResponse}.
     */
    public static class Builder {
        private String name;
        private String description;
        private String type;
        private String id;
        private Boolean scheduled;
        private String connectionType;
        private String configuration;
        private Boolean isExternal;
        private Boolean isDeprecated;
        private Boolean isDeleted;
        private Boolean isHidden;
        private Boolean complete;
        private Double indexVersion;
        private Double generationNum;
        private String created;
        private String modified;
        private UserNameAndID author;
        private UserNameAndID modifiedBy;
        private UserNameAndID owner;
        private List<String> tags;
        private List<TableList> tables;



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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
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
         * Setter for scheduled.
         * @param  scheduled  Boolean value for scheduled.
         * @return Builder
         */
        public Builder scheduled(Boolean scheduled) {
            this.scheduled = scheduled;
            return this;
        }

        /**
         * Setter for connectionType.
         * @param  connectionType  String value for connectionType.
         * @return Builder
         */
        public Builder connectionType(String connectionType) {
            this.connectionType = connectionType;
            return this;
        }

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
         * Setter for isExternal.
         * @param  isExternal  Boolean value for isExternal.
         * @return Builder
         */
        public Builder isExternal(Boolean isExternal) {
            this.isExternal = isExternal;
            return this;
        }

        /**
         * Setter for isDeprecated.
         * @param  isDeprecated  Boolean value for isDeprecated.
         * @return Builder
         */
        public Builder isDeprecated(Boolean isDeprecated) {
            this.isDeprecated = isDeprecated;
            return this;
        }

        /**
         * Setter for isDeleted.
         * @param  isDeleted  Boolean value for isDeleted.
         * @return Builder
         */
        public Builder isDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        /**
         * Setter for isHidden.
         * @param  isHidden  Boolean value for isHidden.
         * @return Builder
         */
        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            return this;
        }

        /**
         * Setter for complete.
         * @param  complete  Boolean value for complete.
         * @return Builder
         */
        public Builder complete(Boolean complete) {
            this.complete = complete;
            return this;
        }

        /**
         * Setter for indexVersion.
         * @param  indexVersion  Double value for indexVersion.
         * @return Builder
         */
        public Builder indexVersion(Double indexVersion) {
            this.indexVersion = indexVersion;
            return this;
        }

        /**
         * Setter for generationNum.
         * @param  generationNum  Double value for generationNum.
         * @return Builder
         */
        public Builder generationNum(Double generationNum) {
            this.generationNum = generationNum;
            return this;
        }

        /**
         * Setter for created.
         * @param  created  String value for created.
         * @return Builder
         */
        public Builder created(String created) {
            this.created = created;
            return this;
        }

        /**
         * Setter for modified.
         * @param  modified  String value for modified.
         * @return Builder
         */
        public Builder modified(String modified) {
            this.modified = modified;
            return this;
        }

        /**
         * Setter for author.
         * @param  author  UserNameAndID value for author.
         * @return Builder
         */
        public Builder author(UserNameAndID author) {
            this.author = author;
            return this;
        }

        /**
         * Setter for modifiedBy.
         * @param  modifiedBy  UserNameAndID value for modifiedBy.
         * @return Builder
         */
        public Builder modifiedBy(UserNameAndID modifiedBy) {
            this.modifiedBy = modifiedBy;
            return this;
        }

        /**
         * Setter for owner.
         * @param  owner  UserNameAndID value for owner.
         * @return Builder
         */
        public Builder owner(UserNameAndID owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Setter for tags.
         * @param  tags  List of String value for tags.
         * @return Builder
         */
        public Builder tags(List<String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Setter for tables.
         * @param  tables  List of TableList value for tables.
         * @return Builder
         */
        public Builder tables(List<TableList> tables) {
            this.tables = tables;
            return this;
        }

        /**
         * Builds a new {@link ConnectionResponse} object using the set fields.
         * @return {@link ConnectionResponse}
         */
        public ConnectionResponse build() {
            return new ConnectionResponse(name, description, type, id, scheduled, connectionType,
                    configuration, isExternal, isDeprecated, isDeleted, isHidden, complete,
                    indexVersion, generationNum, created, modified, author, modifiedBy, owner, tags,
                    tables);
        }
    }
}
