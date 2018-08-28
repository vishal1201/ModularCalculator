package com.aplombcreations.Module;

public class Temperature implements IModule {
    @Override
    public String getModuleName() {
        return this.getClass().getSimpleName();
    }
}
