package com.wangyue.template;

/**
 * Created by Thoughtworks on 1/14/16.
 */
public class Tea extends RefreshBeverage {

    @Override
    protected void brew() {
        System.out.println("brew tea...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("add condiments to tea...");
    }

    @Override
    protected boolean isCustomerWantsCondiments(){
        return false;
    }

}

