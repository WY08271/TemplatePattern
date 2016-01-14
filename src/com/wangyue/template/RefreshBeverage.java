package com.wangyue.template;

/**
 * Created by Thoughtworks on 1/14/16.
 */

public abstract class RefreshBeverage {

    public final void prepareBeverageTemplate() {
        boilWater();
        brew();
        pourInCup();
        if (isCustomerWantsCondiments()) {
            addCondiments();
        }
    }

    protected boolean isCustomerWantsCondiments() {
        return true;
    }

    private void boilWater() {
        System.out.println("BOIL WATER...");
    }

    private void pourInCup() {
        System.out.println("POUR WATER IN CUP...");
    }

    protected abstract void brew();

    protected abstract void addCondiments();
}