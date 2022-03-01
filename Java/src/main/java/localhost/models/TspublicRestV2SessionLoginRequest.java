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
 * This is a model class for TspublicRestV2SessionLoginRequest type.
 */
public class TspublicRestV2SessionLoginRequest {
    private String userName;
    private String password;
    private RememberMeEnum rememberMe;

    /**
     * Default constructor.
     */
    public TspublicRestV2SessionLoginRequest() {
    }

    /**
     * Initialization constructor.
     * @param  userName  String value for userName.
     * @param  password  String value for password.
     * @param  rememberMe  RememberMeEnum value for rememberMe.
     */
    public TspublicRestV2SessionLoginRequest(
            String userName,
            String password,
            RememberMeEnum rememberMe) {
        this.userName = userName;
        this.password = password;
        this.rememberMe = rememberMe;
    }

    /**
     * Getter for UserName.
     * Username of the user account
     * @return Returns the String
     */
    @JsonGetter("userName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUserName() {
        return userName;
    }

    /**
     * Setter for UserName.
     * Username of the user account
     * @param userName Value for String
     */
    @JsonSetter("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter for Password.
     * The password of the user account
     * @return Returns the String
     */
    @JsonGetter("password")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPassword() {
        return password;
    }

    /**
     * Setter for Password.
     * The password of the user account
     * @param password Value for String
     */
    @JsonSetter("password")
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for RememberMe.
     * A flag to remember the user session. When set to true, sets a session cookie that persists in
     * subsequent API calls.
     * @return Returns the RememberMeEnum
     */
    @JsonGetter("rememberMe")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RememberMeEnum getRememberMe() {
        return rememberMe;
    }

    /**
     * Setter for RememberMe.
     * A flag to remember the user session. When set to true, sets a session cookie that persists in
     * subsequent API calls.
     * @param rememberMe Value for RememberMeEnum
     */
    @JsonSetter("rememberMe")
    public void setRememberMe(RememberMeEnum rememberMe) {
        this.rememberMe = rememberMe;
    }

    /**
     * Converts this TspublicRestV2SessionLoginRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2SessionLoginRequest [" + "userName=" + userName + ", password="
                + password + ", rememberMe=" + rememberMe + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .userName(getUserName())
                .password(getPassword())
                .rememberMe(getRememberMe());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2SessionLoginRequest}.
     */
    public static class Builder {
        private String userName;
        private String password;
        private RememberMeEnum rememberMe;



        /**
         * Setter for userName.
         * @param  userName  String value for userName.
         * @return Builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * Setter for password.
         * @param  password  String value for password.
         * @return Builder
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Setter for rememberMe.
         * @param  rememberMe  RememberMeEnum value for rememberMe.
         * @return Builder
         */
        public Builder rememberMe(RememberMeEnum rememberMe) {
            this.rememberMe = rememberMe;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2SessionLoginRequest} object using the set fields.
         * @return {@link TspublicRestV2SessionLoginRequest}
         */
        public TspublicRestV2SessionLoginRequest build() {
            return new TspublicRestV2SessionLoginRequest(userName, password, rememberMe);
        }
    }
}
