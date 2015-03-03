package com.craftedbytes.hazelcast.entryevent.service.listener;

import com.craftedbytes.hazelcast.entryevent.service.exceptions.EntryEventServiceException;

/**
 * The CompletionListener is called by the EntryEventService either upon completion of a EntryEventProcessor or
 * if there are any Exceptions thrown in the course of execution or submission.
 */
public interface CompletionListener<R> {

    public void onCompletion(R result);

    public void onException(EntryEventServiceException e);

}
