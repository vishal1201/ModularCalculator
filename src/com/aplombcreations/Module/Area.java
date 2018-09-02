package com.aplombcreations.Module;

public class Area implements IModule {
    @Override
    public String getModuleName() {
        return this.getClass().toString();
    }

    @Override
    public void getModuleMenu() {

    }
}
