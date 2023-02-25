package com.sii.academy.main;

import com.sii.academy.property.PropertiesHolder;

public class Main {
    public static void main(String[] args) {
        PropertiesHolder<String, String> holder = new PropertiesHolder<>();
        holder.put("login", "Angelina");
        holder.put("password", "angelinaInHollywood123");
        holder.put("title", "Salt");
        holder.put("url", "www.angelina.hollywood");
        holder.put("errorMessage", "File hasn't been found");
        holder.getAllKeysAsSet().forEach(holder::printProperty);

    }
}