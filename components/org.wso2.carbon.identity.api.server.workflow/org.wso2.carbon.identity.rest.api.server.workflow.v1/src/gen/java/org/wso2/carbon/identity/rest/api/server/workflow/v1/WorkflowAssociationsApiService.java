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

package org.wso2.carbon.identity.rest.api.server.workflow.v1;

import org.wso2.carbon.identity.rest.api.server.workflow.v1.model.WorkflowAssociationPatchRequest;
import org.wso2.carbon.identity.rest.api.server.workflow.v1.model.WorkflowAssociationRequest;

import javax.ws.rs.core.Response;


public interface WorkflowAssociationsApiService {

      public Response addWorkflowAssociation(WorkflowAssociationRequest workflowAssociationRequest);

      public Response deleteWorkflowAssociationById(String associationId);

      public Response getWorkflowAssociationById(String associationId);

      public Response getWorkflowAssociations(Integer limit, Integer offset, String filter);

      public Response updateAssociation(String associationId, WorkflowAssociationPatchRequest workflowAssociationPatchRequest);
}
