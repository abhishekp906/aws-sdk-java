/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.sns.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Topic Request Marshaller
 */
public class CreateTopicRequestMarshaller implements Marshaller<Request<CreateTopicRequest>, CreateTopicRequest> {

    public Request<CreateTopicRequest> marshall(CreateTopicRequest createTopicRequest) {

        if (createTopicRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTopicRequest> request = new DefaultRequest<CreateTopicRequest>(createTopicRequest, "AmazonSNS");
        request.addParameter("Action", "CreateTopic");
        request.addParameter("Version", "2010-03-31");

        if (createTopicRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(createTopicRequest.getName()));
        }

        return request;
    }
}
