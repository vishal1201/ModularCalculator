package com.aplombcreations;

public class EModule {
    enum Modules {
        Arithmetic(1), Area(2), Volume(3), Data(4), Temperature(5), Length(6), Mass(7);
        private int index;

        Modules(int i) {
            index = i;
        }
    }
}
