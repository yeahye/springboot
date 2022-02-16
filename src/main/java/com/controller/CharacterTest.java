package com.controller;

/**
 * @author yejunnan
 * @version 1.0
 * @className CharacterTest
 * @date 2021/1/27 16:03
 */
public abstract class CharacterTest {
    interface CharactoerProperty {
        boolean hasUpperCase(char ch);
    }

    public static boolean exist(char ch, CharactoerProperty charactoerProperty) {
        return charactoerProperty.hasUpperCase(ch);
    }

    public static void main(String[] args) {
        boolean result = exist('A', new CharactoerProperty() {
            @Override
            public boolean hasUpperCase(char ch) {
                if (Character.isUpperCase(ch)) {
                    return true;
                }
                return false;
            }
        });
        System.out.println(result);
    }
}
