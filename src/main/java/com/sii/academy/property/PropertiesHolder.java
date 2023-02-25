package com.sii.academy.property;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PropertiesHolder<K, V> {
    private static final String[] sensualKeys = {"login", "password", "url"};
    private final Map<K, V> properties = new HashMap<>();

    public void printProperty(K key) {
        System.out.printf("Property %s:%s%n", key.toString(), getValueAsString(key));
    }

    private String getValueAsString(K key) {
        return Arrays.asList(sensualKeys).contains(key.toString()) ?
                "*".repeat(properties.get(key).toString().length())
                :
                properties.get(key).toString();
    }


    public Set<K> getAllKeysAsSet() {
        return properties.keySet();
    }

    public void put(K key, V value) {
        this.properties.put(key, value);
    }

}
