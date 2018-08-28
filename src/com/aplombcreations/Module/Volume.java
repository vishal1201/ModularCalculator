package com.aplombcreations.Module;

public class Volume implements IModule {
    @Override
    public String getModuleName() {
        return this.getClass().toString();
    }
}
