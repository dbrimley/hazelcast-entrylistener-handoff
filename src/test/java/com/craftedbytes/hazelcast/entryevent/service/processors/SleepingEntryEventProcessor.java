package com.craftedbytes.hazelcast.entryevent.service.processors;

import com.craftedbytes.hazelcast.entryevent.service.exceptions.EntryEventServiceException;
import com.hazelcast.core.EntryEvent;

/**
 * An EntryEventProcessor that sleeps.
 */
public class SleepingEntryEventProcessor
        implements EntryEventProcessor<Integer, String, String> {

    @Override
    public String process(EntryEvent<Integer, String> entryEvent)
            throws EntryEventServiceException {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "12";
    }
}
