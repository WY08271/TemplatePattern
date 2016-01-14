package com.wangyue.template;

/**
 * Created by Thoughtworks on 1/14/16.
 */
public class Coffee extends RefreshBeverage {

    @Override
    protected void brew() {
        System.out.println("brew...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("add condiments...");
    }

}

