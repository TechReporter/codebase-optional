/**
 * 
 */
package com.model;

/**
 * @author 212720190
 * @date Mar 12, 2019
 */
public enum Gender {
	M("MALE"), F("FEMALE");
	
	private final String name;

    private Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
