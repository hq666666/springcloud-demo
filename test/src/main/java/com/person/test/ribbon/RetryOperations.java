package com.person.test.ribbon;

import org.springframework.retry.ExhaustedRetryException;
import org.springframework.retry.RecoveryCallback;
import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryState;

public interface RetryOperations {

    <T> T execute(RetryCallback<T,Exception> retryCallback) throws Exception;

    <T> T execute(RetryCallback<T,Exception> retryCallback, RecoveryCallback<T> recoveryCallback)
            throws Exception;

    <T> T execute(RetryCallback<T,Exception> retryCallback, RetryState retryState)
            throws Exception, ExhaustedRetryException;

    <T> T execute(RetryCallback<T,Exception> retryCallback, RecoveryCallback<T> recoveryCallback,
                  RetryState retryState) throws Exception;
}
