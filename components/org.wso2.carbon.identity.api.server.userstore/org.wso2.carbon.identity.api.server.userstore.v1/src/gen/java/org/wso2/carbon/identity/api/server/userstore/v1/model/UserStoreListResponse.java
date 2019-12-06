/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.api.server.userstore.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class UserStoreListResponse  {

    private String id;
    private String name;
    private String description;
    private String self;

    /**
     * base64 url encoded value of domain name
     **/
    public UserStoreListResponse id(String id) {

        this.id = id;
        return this;
    }

    @ApiModelProperty(example = "SkRCQy1TRUNPTkRBUlk", value = "base64 url encoded value of domain name")
    @JsonProperty("id")
    @Valid
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    /**
     * domain name of the secondary user store
     **/
    public UserStoreListResponse name(String name) {

        this.name = name;
        return this;
    }

    @ApiModelProperty(example = "JDBC-SECONDARY", value = "domain name of the secondary user store")
    @JsonProperty("name")
    @Valid
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
     **/
    public UserStoreListResponse description(String description) {

        this.description = description;
        return this;
    }

    @ApiModelProperty(example = "Some description of the user store", value = "")
    @JsonProperty("description")
    @Valid
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Location of the created/updated resource.
     **/
    public UserStoreListResponse self(String self) {

        this.self = self;
        return this;
    }

    @ApiModelProperty(example = "/t/{tenant-domain}/api/server/v1/userstores/SkRCQy1TRUNPTkRBUlk", value = "Location of the created/updated resource.")
    @JsonProperty("self")
    @Valid
    public String getSelf() {
        return self;
    }
    public void setSelf(String self) {
        this.self = self;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserStoreListResponse userStoreListResponse = (UserStoreListResponse) o;
        return Objects.equals(this.id, userStoreListResponse.id) &&
                Objects.equals(this.name, userStoreListResponse.name) &&
                Objects.equals(this.description, userStoreListResponse.description) &&
                Objects.equals(this.self, userStoreListResponse.self);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, self);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class UserStoreListResponse {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

