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
 * This is a model class for TspublicRestV2AdminSyncprincipalRequest type.
 */
public class TspublicRestV2AdminSyncprincipalRequest {
    private List<Object> principalObject;
    private UpdateModifiedEnum updateModified;
    private DeleteRemovedEnum deleteRemoved;
    private String newUserPassword;

    /**
     * Default constructor.
     */
    public TspublicRestV2AdminSyncprincipalRequest() {
        updateModified = UpdateModifiedEnum.ENUM_FALSE;
        deleteRemoved = DeleteRemovedEnum.ENUM_FALSE;
    }

    /**
     * Initialization constructor.
     * @param  principalObject  List of Object value for principalObject.
     * @param  updateModified  UpdateModifiedEnum value for updateModified.
     * @param  deleteRemoved  DeleteRemovedEnum value for deleteRemoved.
     * @param  newUserPassword  String value for newUserPassword.
     */
    public TspublicRestV2AdminSyncprincipalRequest(
            List<Object> principalObject,
            UpdateModifiedEnum updateModified,
            DeleteRemovedEnum deleteRemoved,
            String newUserPassword) {
        this.principalObject = principalObject;
        this.updateModified = updateModified;
        this.deleteRemoved = deleteRemoved;
        this.newUserPassword = newUserPassword;
    }

    /**
     * Getter for PrincipalObject.
     * A JSON array of principal objects containing all users and groups present in the external
     * system. Example: { "name": "Customer Success", "displayName": "Customer Success",
     * "description": "CS", "created": 1568926267025, "modified": 1568926982242,
     * "principalTypeEnum": "LOCAL_GROUP", "groupNames": [], "visibility": "DEFAULT" }, { "name":
     * "test", "displayName": "test one", "created": 1587573621279, "modified": 1587573621674,
     * "mail": "test2@test.com", "principalTypeEnum": "LOCAL_USER", "groupNames": [ "Administrator",
     * "All" ], "visibility": "DEFAULT" } You can leave the created and modified dates blank for new
     * users. You can specify if the principal is a user (LOCAL_USER) or user group (LOCAL_GROUP) in
     * the principalTypeEnum keyword. Set visibility to NON_SHARABLE, if you do not want the user to
     * be able to share ThoughtSpot objects with other users in this group.
     * @return Returns the List of Object
     */
    @JsonGetter("principalObject")
    public List<Object> getPrincipalObject() {
        return principalObject;
    }

    /**
     * Setter for PrincipalObject.
     * A JSON array of principal objects containing all users and groups present in the external
     * system. Example: { "name": "Customer Success", "displayName": "Customer Success",
     * "description": "CS", "created": 1568926267025, "modified": 1568926982242,
     * "principalTypeEnum": "LOCAL_GROUP", "groupNames": [], "visibility": "DEFAULT" }, { "name":
     * "test", "displayName": "test one", "created": 1587573621279, "modified": 1587573621674,
     * "mail": "test2@test.com", "principalTypeEnum": "LOCAL_USER", "groupNames": [ "Administrator",
     * "All" ], "visibility": "DEFAULT" } You can leave the created and modified dates blank for new
     * users. You can specify if the principal is a user (LOCAL_USER) or user group (LOCAL_GROUP) in
     * the principalTypeEnum keyword. Set visibility to NON_SHARABLE, if you do not want the user to
     * be able to share ThoughtSpot objects with other users in this group.
     * @param principalObject Value for List of Object
     */
    @JsonSetter("principalObject")
    public void setPrincipalObject(List<Object> principalObject) {
        this.principalObject = principalObject;
    }

    /**
     * Getter for UpdateModified.
     * Specifies whether to apply the changes to users and groups already in the cluster based on
     * the principal object list input.
     * @return Returns the UpdateModifiedEnum
     */
    @JsonGetter("updateModified")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdateModifiedEnum getUpdateModified() {
        return updateModified;
    }

    /**
     * Setter for UpdateModified.
     * Specifies whether to apply the changes to users and groups already in the cluster based on
     * the principal object list input.
     * @param updateModified Value for UpdateModifiedEnum
     */
    @JsonSetter("updateModified")
    public void setUpdateModified(UpdateModifiedEnum updateModified) {
        this.updateModified = updateModified;
    }

    /**
     * Getter for DeleteRemoved.
     * Specifies whether to delete the users and groups already in the cluster if not present in the
     * principal object list input.
     * @return Returns the DeleteRemovedEnum
     */
    @JsonGetter("deleteRemoved")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DeleteRemovedEnum getDeleteRemoved() {
        return deleteRemoved;
    }

    /**
     * Setter for DeleteRemoved.
     * Specifies whether to delete the users and groups already in the cluster if not present in the
     * principal object list input.
     * @param deleteRemoved Value for DeleteRemovedEnum
     */
    @JsonSetter("deleteRemoved")
    public void setDeleteRemoved(DeleteRemovedEnum deleteRemoved) {
        this.deleteRemoved = deleteRemoved;
    }

    /**
     * Getter for NewUserPassword.
     * Assign a password for new users added during the sync operation. All new users added will
     * have this password. It is mandatory to provide value for this field if new users are included
     * in the input list.
     * @return Returns the String
     */
    @JsonGetter("newUserPassword")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNewUserPassword() {
        return newUserPassword;
    }

    /**
     * Setter for NewUserPassword.
     * Assign a password for new users added during the sync operation. All new users added will
     * have this password. It is mandatory to provide value for this field if new users are included
     * in the input list.
     * @param newUserPassword Value for String
     */
    @JsonSetter("newUserPassword")
    public void setNewUserPassword(String newUserPassword) {
        this.newUserPassword = newUserPassword;
    }

    /**
     * Converts this TspublicRestV2AdminSyncprincipalRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2AdminSyncprincipalRequest [" + "principalObject=" + principalObject
                + ", updateModified=" + updateModified + ", deleteRemoved=" + deleteRemoved
                + ", newUserPassword=" + newUserPassword + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(principalObject)
                .updateModified(getUpdateModified())
                .deleteRemoved(getDeleteRemoved())
                .newUserPassword(getNewUserPassword());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2AdminSyncprincipalRequest}.
     */
    public static class Builder {
        private List<Object> principalObject;
        private UpdateModifiedEnum updateModified = UpdateModifiedEnum.ENUM_FALSE;
        private DeleteRemovedEnum deleteRemoved = DeleteRemovedEnum.ENUM_FALSE;
        private String newUserPassword;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  principalObject  List of Object value for principalObject.
         */
        public Builder(List<Object> principalObject) {
            this.principalObject = principalObject;
        }

        /**
         * Setter for principalObject.
         * @param  principalObject  List of Object value for principalObject.
         * @return Builder
         */
        public Builder principalObject(List<Object> principalObject) {
            this.principalObject = principalObject;
            return this;
        }

        /**
         * Setter for updateModified.
         * @param  updateModified  UpdateModifiedEnum value for updateModified.
         * @return Builder
         */
        public Builder updateModified(UpdateModifiedEnum updateModified) {
            this.updateModified = updateModified;
            return this;
        }

        /**
         * Setter for deleteRemoved.
         * @param  deleteRemoved  DeleteRemovedEnum value for deleteRemoved.
         * @return Builder
         */
        public Builder deleteRemoved(DeleteRemovedEnum deleteRemoved) {
            this.deleteRemoved = deleteRemoved;
            return this;
        }

        /**
         * Setter for newUserPassword.
         * @param  newUserPassword  String value for newUserPassword.
         * @return Builder
         */
        public Builder newUserPassword(String newUserPassword) {
            this.newUserPassword = newUserPassword;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2AdminSyncprincipalRequest} object using the set fields.
         * @return {@link TspublicRestV2AdminSyncprincipalRequest}
         */
        public TspublicRestV2AdminSyncprincipalRequest build() {
            return new TspublicRestV2AdminSyncprincipalRequest(principalObject, updateModified,
                    deleteRemoved, newUserPassword);
        }
    }
}
