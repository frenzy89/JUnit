package org.example;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] strings = new String[10];
        for(int i = 0; i< strings.length; i++){
            strings[i] = RandomStringUtils.randomAlphabetic(10);
            System.out.println(strings[i]);
        }
        System.out.println("Transformed:");
        for(int i = 0; i< strings.length; i++){
            System.out.println(StringUtils.capitalize(strings[i].toLowerCase()));
        }
    }
}
