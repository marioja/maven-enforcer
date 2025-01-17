package org.apache.maven.plugins.enforcer;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import junit.framework.TestCase;

import org.apache.maven.enforcer.rule.api.EnforcerRuleException;

/**
 * Test AlwaysFail rule.
 * @author Ben Lidgey
 * @see AlwaysFail
 */
public class TestAlwaysFail extends TestCase
{

    public void testExecute()
    {
        final AlwaysFail rule = new AlwaysFail();
        try
        {
            // execute rule -- should throw EnforcerRuleException
            rule.execute( EnforcerTestUtils.getHelper() );
            fail( "Should throw EnforcerRuleException" );
        }
        catch ( EnforcerRuleException e )
        {
            assertNotNull( e.getMessage() );
        }
    }

}
