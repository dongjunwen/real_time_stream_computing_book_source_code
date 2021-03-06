package com.alain898.book.realtimestreaming.chapter11.streamfeatureextractor.tools;

import java.util.Properties;

public class PropertiesUtils {
    /**
     *
     * @param propsArray Properties array, the later properties will cover the older ones.
     * @return
     */
    static public Properties newProperties(final Properties... propsArray){
        Properties newProps = new Properties();
        for (Properties props : propsArray){
            if (props != null) {
                for (String k : props.stringPropertyNames()) {
                    newProps.put(k, props.getProperty(k));
                }
            }
        }
        return newProps;
    }
}
