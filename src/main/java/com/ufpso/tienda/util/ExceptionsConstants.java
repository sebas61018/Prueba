package com.ufpso.tienda.util;

import lombok.Getter;

@Getter
public enum ExceptionsConstants {

    ITEM_NOT_FOUND("Item not found"),
    USER_NOT_FOUND( "User not found"),
    ITEM_IS_NULL("Item is null"),
    USER_IS_NULL("Usser is null"),
    ADDRESS_IS_NULL("Address is null"),
    ADDRESS_NOT_FOUND("Address not found"),
    CREDENTIAL_INVALID("Invalid username or password"),
    CATEGORY_NOT_FOUND("Category not found"),
    CATEGORY_IS_NULL("Category is null");


    private final String message;

    private ExceptionsConstants(String message){
        this.message =  message;
    }

}
