package com.aplombcreations.Module;

public class Mass implements IModule {
    @Override
    public String getModuleName() {
        return this.getClass().toString();
    }
}
