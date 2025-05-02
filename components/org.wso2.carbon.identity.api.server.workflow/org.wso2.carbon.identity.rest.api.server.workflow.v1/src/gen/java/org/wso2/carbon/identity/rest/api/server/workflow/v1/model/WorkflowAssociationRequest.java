/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com).
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

package org.wso2.carbon.identity.rest.api.server.workflow.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.wso2.carbon.identity.rest.api.server.workflow.v1.model.Operation;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class WorkflowAssociationRequest  {
  
    private String associationName;
    private Operation operation;
    private String workflowId;
    private String associationCondition;
    private Boolean isEnabled = true;

    /**
    * Name of the workflow association
    **/
    public WorkflowAssociationRequest associationName(String associationName) {

        this.associationName = associationName;
        return this;
    }
    
    @ApiModelProperty(example = "User Registration Workflow Association", required = true, value = "Name of the workflow association")
    @JsonProperty("associationName")
    @Valid
    @NotNull(message = "Property associationName cannot be null.")

    public String getAssociationName() {
        return associationName;
    }
    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    /**
    **/
    public WorkflowAssociationRequest operation(Operation operation) {

        this.operation = operation;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    @JsonProperty("operation")
    @Valid
    @NotNull(message = "Property operation cannot be null.")

    public Operation getOperation() {
        return operation;
    }
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    /**
    * Id of the assigned workflow
    **/
    public WorkflowAssociationRequest workflowId(String workflowId) {

        this.workflowId = workflowId;
        return this;
    }
    
    @ApiModelProperty(example = "100", required = true, value = "Id of the assigned workflow")
    @JsonProperty("workflowId")
    @Valid
    @NotNull(message = "Property workflowId cannot be null.")

    public String getWorkflowId() {
        return workflowId;
    }
    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
    * Condition added to the association
    **/
    public WorkflowAssociationRequest associationCondition(String associationCondition) {

        this.associationCondition = associationCondition;
        return this;
    }
    
    @ApiModelProperty(example = "//_*[local-name()='parameter'][@name='Rolename']/_*[local-name()='value']/_*[local-name()='itemValue']/text()='Employee'", value = "Condition added to the association")
    @JsonProperty("associationCondition")
    @Valid
    public String getAssociationCondition() {
        return associationCondition;
    }
    public void setAssociationCondition(String associationCondition) {
        this.associationCondition = associationCondition;
    }

    /**
    * Association Status
    **/
    public WorkflowAssociationRequest isEnabled(Boolean isEnabled) {

        this.isEnabled = isEnabled;
        return this;
    }
    
    @ApiModelProperty(example = "true", value = "Association Status")
    @JsonProperty("isEnabled")
    @Valid
    public Boolean getIsEnabled() {
        return isEnabled;
    }
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowAssociationRequest workflowAssociationRequest = (WorkflowAssociationRequest) o;
        return Objects.equals(this.associationName, workflowAssociationRequest.associationName) &&
            Objects.equals(this.operation, workflowAssociationRequest.operation) &&
            Objects.equals(this.workflowId, workflowAssociationRequest.workflowId) &&
            Objects.equals(this.associationCondition, workflowAssociationRequest.associationCondition) &&
            Objects.equals(this.isEnabled, workflowAssociationRequest.isEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(associationName, operation, workflowId, associationCondition, isEnabled);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowAssociationRequest {\n");
        
        sb.append("    associationName: ").append(toIndentedString(associationName)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    associationCondition: ").append(toIndentedString(associationCondition)).append("\n");
        sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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

