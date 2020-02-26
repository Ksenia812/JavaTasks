package com.company;

public class PunctuationAmount {

    public static void main ( String[] args ) {

        String symbols = ",.?<>'`~&!@#$%^:;*()/_-|{}[]+=";
        String line = "Hello  , ' <.> my &  ? world";

        int counter = 0;

        for ( int i = 0 ; i < line.length () ; i++ ) {
            for ( int j = 0 ; j < symbols.length () ; j++ ) {
                if ( (line.charAt ( i ) == symbols.charAt ( j )) ) {
                    counter++;

                }
            }
        }
        System.out.println ( counter );
    }
}