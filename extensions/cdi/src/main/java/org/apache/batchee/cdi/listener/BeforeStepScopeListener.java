/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.batchee.cdi.listener;

import javax.batch.api.listener.StepListener;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @deprecated only kept for compatibility - will be removed in 1.0
 */
@Named
@Dependent
public class BeforeStepScopeListener implements StepListener {

    private static final Logger LOG = Logger.getLogger(BeforeJobScopeListener.class.getName());

    @Override
    public void beforeStep() throws Exception {
        LOG.log(Level.WARNING, "BeforeStepScopeListener is not required to enable @StepScoped! This Listener will removed in future versions!");
    }

    @Override
    public void afterStep() throws Exception {
        // no op
    }
}
