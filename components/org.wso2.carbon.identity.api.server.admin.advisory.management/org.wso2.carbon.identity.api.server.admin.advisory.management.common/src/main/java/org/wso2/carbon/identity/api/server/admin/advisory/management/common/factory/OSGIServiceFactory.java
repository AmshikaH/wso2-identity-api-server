/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
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

package org.wso2.carbon.identity.api.server.admin.advisory.management.common.factory;

import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.wso2.carbon.admin.advisory.mgt.service.AdminAdvisoryManagementService;
import org.wso2.carbon.context.PrivilegedCarbonContext;

/**
 * Factory Beans serve as a factory for creating other beans within the IOC container. This factory bean is used to
 * instantiate the AdminAdvisoryManagementService type of object inside the container.
 */
public class OSGIServiceFactory extends AbstractFactoryBean<AdminAdvisoryManagementService> {

    private AdminAdvisoryManagementService adminAdvisoryManagementService;

    @Override
    public Class<?> getObjectType() {

        return Object.class;
    }

    @Override
    protected AdminAdvisoryManagementService createInstance() throws Exception {

        if (this.adminAdvisoryManagementService == null) {
            AdminAdvisoryManagementService taskOperationService =
                    (AdminAdvisoryManagementService) PrivilegedCarbonContext
                            .getThreadLocalCarbonContext()
                            .getOSGiService(AdminAdvisoryManagementService.class, null);
            if (taskOperationService != null) {
                this.adminAdvisoryManagementService = taskOperationService;
            } else {
                throw new Exception("Unable to retrieve AdminAdvisoryManagementService service.");
            }
        }
        return this.adminAdvisoryManagementService;
    }
}
