package com.craftedbytes.hazelcast.entryevent.service.processors;

import com.craftedbytes.hazelcast.entryevent.service.exceptions.EntryEventServiceException;
import com.hazelcast.core.EntryEvent;

/**
 * An EntryEventProcessor that blocks forever.
 */
public class BlockingEntryEventProcessor implements EntryEventProcessor<Integer,String,String> {
    @Override
    public String process(EntryEvent<Integer, String> entryEvent)
            throws EntryEventServiceException {
        while(true){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
