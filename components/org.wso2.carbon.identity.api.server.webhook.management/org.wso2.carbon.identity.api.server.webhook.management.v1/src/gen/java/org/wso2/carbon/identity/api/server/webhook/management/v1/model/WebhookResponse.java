/*
 * Copyright (c) 2025, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.api.server.webhook.management.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.api.server.webhook.management.v1.model.WebhookRequestEventSchema;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonValue;

public class WebhookResponse  {
  
    private String id;
    private String createdAt;
    private String updatedAt;
    private String endpoint;
    private WebhookRequestEventSchema eventSchema;
    private String description;
    private List<String> eventsSubscribed = null;


    /**
    **/
    public WebhookResponse id(String id) {

        this.id = id;
        return this;
    }
    
    @ApiModelProperty(example = "101", value = "")
    @JsonProperty("id")
    @Valid
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    /**
    **/
    public WebhookResponse createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }
    
    @ApiModelProperty(example = "2025-05-01T12:00Z", value = "")
    @JsonProperty("createdAt")
    @Valid
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
    **/
    public WebhookResponse updatedAt(String updatedAt) {

        this.updatedAt = updatedAt;
        return this;
    }
    
    @ApiModelProperty(example = "2025-05-02T12:00Z", value = "")
    @JsonProperty("updatedAt")
    @Valid
    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
    * Webhook URL.
    **/
    public WebhookResponse endpoint(String endpoint) {

        this.endpoint = endpoint;
        return this;
    }
    
    @ApiModelProperty(example = "https://example.com/webhook", value = "Webhook URL.")
    @JsonProperty("endpoint")
    @Valid
    public String getEndpoint() {
        return endpoint;
    }
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
    **/
    public WebhookResponse eventSchema(WebhookRequestEventSchema eventSchema) {

        this.eventSchema = eventSchema;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("eventSchema")
    @Valid
    public WebhookRequestEventSchema getEventSchema() {
        return eventSchema;
    }
    public void setEventSchema(WebhookRequestEventSchema eventSchema) {
        this.eventSchema = eventSchema;
    }

    /**
    * Webhook description.
    **/
    public WebhookResponse description(String description) {

        this.description = description;
        return this;
    }
    
    @ApiModelProperty(example = "A webhook for user events.", value = "Webhook description.")
    @JsonProperty("description")
    @Valid
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    * List of events to subscribe to.
    **/
    public WebhookResponse eventsSubscribed(List<String> eventsSubscribed) {

        this.eventsSubscribed = eventsSubscribed;
        return this;
    }
    
    @ApiModelProperty(example = "[\"schemas.identity.wso2.org/events/logins/event-type/loginSuccess\",\"schemas.identity.wso2.org/events/logins/event-type/loginFailed\"]", value = "List of events to subscribe to.")
    @JsonProperty("eventsSubscribed")
    @Valid
    public List<String> getEventsSubscribed() {
        return eventsSubscribed;
    }
    public void setEventsSubscribed(List<String> eventsSubscribed) {
        this.eventsSubscribed = eventsSubscribed;
    }

    public WebhookResponse addEventsSubscribedItem(String eventsSubscribedItem) {
        if (this.eventsSubscribed == null) {
            this.eventsSubscribed = new ArrayList<String>();
        }
        this.eventsSubscribed.add(eventsSubscribedItem);
        return this;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookResponse webhookResponse = (WebhookResponse) o;
        return Objects.equals(this.id, webhookResponse.id) &&
            Objects.equals(this.createdAt, webhookResponse.createdAt) &&
            Objects.equals(this.updatedAt, webhookResponse.updatedAt) &&
            Objects.equals(this.endpoint, webhookResponse.endpoint) &&
            Objects.equals(this.eventSchema, webhookResponse.eventSchema) &&
            Objects.equals(this.description, webhookResponse.description) &&
            Objects.equals(this.eventsSubscribed, webhookResponse.eventsSubscribed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, updatedAt, endpoint, eventSchema, description, eventsSubscribed);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookResponse {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    eventSchema: ").append(toIndentedString(eventSchema)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    eventsSubscribed: ").append(toIndentedString(eventsSubscribed)).append("\n");
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

