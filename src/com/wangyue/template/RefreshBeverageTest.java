package com.wangyue.template;

/**
 * Created by Thoughtworks on 1/14/16.
 */
public class RefreshBeverageTest {

    public static void main(String[] args){
        System.out.println("coffee:");
        RefreshBeverage coffee = new Coffee();
        coffee.prepareBeverageTemplate();
        System.out.println("coffee over~");

        System.out.println("tea:");
        RefreshBeverage tea = new Tea();
        tea.prepareBeverageTemplate();
        System.out.println("tea over~");
    }
}
