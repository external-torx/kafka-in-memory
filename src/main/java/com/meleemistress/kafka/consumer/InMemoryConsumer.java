/**
 * Copyright (c) 2015 Chiral Behaviors, LLC, all rights reserved.
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
package com.meleemistress.kafka.consumer;

import java.util.List;

import org.apache.kafka.clients.ClientRequest;
import org.apache.kafka.clients.ClientResponse;
import org.apache.kafka.clients.KafkaClient;
import org.apache.kafka.common.Node;
import org.apache.kafka.common.protocol.ApiKeys;
import org.apache.kafka.common.requests.RequestHeader;

/**
 * @author hparry
 *
 */
public class InMemoryConsumer implements KafkaClient {

    /* (non-Javadoc)
     * @see org.apache.kafka.clients.KafkaClient#isReady(org.apache.kafka.common.Node, long)
     */
    @Override
    public boolean isReady(Node node, long now) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.apache.kafka.clients.KafkaClient#ready(org.apache.kafka.common.Node, long)
     */
    @Override
    public boolean ready(Node node, long now) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see org.apache.kafka.clients.KafkaClient#connectionDelay(org.apache.kafka.common.Node, long)
     */
    @Override
    public long connectionDelay(Node node, long now) {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.apache.kafka.clients.KafkaClient#poll(java.util.List, long, long)
     */
    @Override
    public List<ClientResponse> poll(List<ClientRequest> requests,
                                     long timeout, long now) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.apache.kafka.clients.KafkaClient#leastLoadedNode(long)
     */
    @Override
    public Node leastLoadedNode(long now) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.apache.kafka.clients.KafkaClient#inFlightRequestCount()
     */
    @Override
    public int inFlightRequestCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see org.apache.kafka.clients.KafkaClient#nextRequestHeader(org.apache.kafka.common.protocol.ApiKeys)
     */
    @Override
    public RequestHeader nextRequestHeader(ApiKeys key) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.apache.kafka.clients.KafkaClient#wakeup()
     */
    @Override
    public void wakeup() {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.apache.kafka.clients.KafkaClient#close()
     */
    @Override
    public void close() {
        // TODO Auto-generated method stub
        
    }

}
