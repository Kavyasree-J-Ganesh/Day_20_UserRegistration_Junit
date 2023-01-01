package com.bridgelabz;

@FunctionalInterface
public interface FunctionInter {
    boolean checkRegexValidity(String regex) throws CustomException;
}
