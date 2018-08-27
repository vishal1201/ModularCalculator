package com.aplombcreations;

public class Module {
    enum EModule {
        Arithmetic(1), Area(2), Volume(3);
        private int index;

        EModule(int i) {
            index = i;
        }
    }
}
