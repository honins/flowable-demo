package com.example.flow.handler;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * @author Created by hy
 * @date on 2021/1/15 10:01
 */
public class SendRejectionMail implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("send reject mail to " + execution.getVariable("employee"));
    }

}
