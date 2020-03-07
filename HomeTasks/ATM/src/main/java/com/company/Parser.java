package com.company;


import java.io.File;

public interface Parser {
    Object getObject ( File file, Class c );

    void saveObject ( File file, Object o );
}
