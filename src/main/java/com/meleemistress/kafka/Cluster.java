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
package com.meleemistress.kafka;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.kafka.clients.producer.ProducerRecord;

/**
 * @author hparry
 *
 */
public class Cluster<K, V> {

    private ConcurrentLinkedDeque<ProducerRecord<K, V>> channel;
    private static final int                            WINDOW_SIZE = 10;
    private static final AtomicLong offset = new AtomicLong(0L);

    public Cluster() {
        channel = new ConcurrentLinkedDeque<ProducerRecord<K, V>>();
    }
    
    public Future send(ProducerRecord<K,V> record) {

        synchronized (this) {
            channel.addLast(record);
            if (channel.size() > WINDOW_SIZE) {
                channel.removeFirst();
            }
            RecordMetadata record
            FutureAppend future = new FutureAppend(record);
            if (future != null) {
                return future;
            }
        }
        
        
    }
    
    public List<ProducerRecord<K,V>> retrieve(long offset) {
        return null;
    }

}
