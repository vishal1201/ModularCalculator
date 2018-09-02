package com.aplombcreations.Utilities;

public enum EModule {

    Arithmetic(1), Area(2), Volume(3), Data(4), Temperature(5), Length(6), Mass(7);
    private int index;

    EModule(int i) {
        index = i;
    }

    public String enumStrKey(int value) {
        for (EModule module : EModule.values()) {

        }
        return null;
    }
}
