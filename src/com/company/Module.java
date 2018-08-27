package com.company;

public class Module {
    enum EModule {
        ARITHMETIC(1), AREA(2), VOLUME(3);
        private int index;

        EModule(int i) {
            index = i;
        }
    }
}
