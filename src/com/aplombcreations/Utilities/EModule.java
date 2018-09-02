package com.aplombcreations.Utilities;

public enum EModule {

    Arithmetic(1), Area(2), Volume(3), Data(4), Temperature(5), Length(6), Mass(7);
    private int index;

    EModule(int i) {
        index = i;
    }

    @Override
    public String toString() {
        return String.valueOf(index);
    }
}
