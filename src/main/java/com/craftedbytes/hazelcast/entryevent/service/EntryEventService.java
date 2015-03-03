package com.craftedbytes.hazelcast.entryevent.service;

import com.craftedbytes.hazelcast.entryevent.service.listener.CompletionListener;
import com.craftedbytes.hazelcast.entryevent.service.processors.EntryEventProcessor;
import com.hazelcast.core.EntryEvent;
import com.hazelcast.core.EntryEventType;

/**
 * Framework to provide encapsulation of EntryEvent processing.  Can be used to provide offloading of processing from
 * Hazelcast event threads.  EntryEvents are passed off to the EntryEventService via the process method.
 * <p>
 * The EntryEventService then selects the appropriate EntryEventProcessor.
 * <p>
 * If an EntryEvent is passed for processing and a EntryEventTypeProcessor is not found for that EntryEventType
 * then a EntryEventServiceException is passed to the caller via the CompletionListener.onException()
 */
public interface EntryEventService<K,V,R> {

    void process(EntryEvent<K,V> entryEvent, CompletionListener<R> completionListener);

}
