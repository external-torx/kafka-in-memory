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
package com.meleemistress.kafka.producer;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.clients.producer.internals.FutureRecordMetadata;
import org.apache.kafka.clients.producer.internals.ProduceRequestResult;
import org.apache.kafka.common.TopicPartition;

import com.meleemistress.kafka.Cluster;

/**
 * @author hparry
 *
 */
public class InMemoryProducer<K, V> implements Producer<K, V> {

    private final Cluster cluster;

    public InMemoryProducer(Cluster cluster) {
        this.cluster = cluster;
    }

    /* (non-Javadoc)
     * @see org.apache.kafka.clients.producer.Producer#send(org.apache.kafka.clients.producer.ProducerRecord)
     */
    public Future<RecordMetadata> send(ProducerRecord<K, V> record) {
        return send(record, null);
    }

    /* (non-Javadoc)
     * @see org.apache.kafka.clients.producer.Producer#send(org.apache.kafka.clients.producer.ProducerRecord, org.apache.kafka.clients.producer.Callback)
     */
    public Future<RecordMetadata> send(ProducerRecord<K, V> record,
                                       Callback callback) {
        return cluster.send(record);
    }

    /* (non-Javadoc)
     * @see org.apache.kafka.clients.producer.Producer#partitionsFor(java.lang.String)
     */
    public List partitionsFor(String topic) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.apache.kafka.clients.producer.Producer#metrics()
     */
    public Map metrics() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.apache.kafka.clients.producer.Producer#close()
     */
    public void close() {
        // TODO Auto-generated method stub

    }

}
