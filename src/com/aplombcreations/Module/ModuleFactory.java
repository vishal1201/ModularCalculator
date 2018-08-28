package com.aplombcreations.Module;

public class ModuleFactory {
    private static final String MODULE_PACKAGE = "com.aplombcreations.Module.";

    public static IModule getModule(String moduleName) {
        IModule module = null;

        try {
            Class cls = Class.forName(MODULE_PACKAGE + moduleName);
            module = (IModule) cls.newInstance();

        } catch (ClassNotFoundException e) {
            System.out.println("Class implementation not found for selected module.");
        } catch (IllegalAccessException e) {
            System.out.println("Couldn't create module object. Illegal access.");
            e.printStackTrace();
        } catch (InstantiationException e) {
            System.out.println("Couldn't create module object. Instantiation failure.");
            e.printStackTrace();
        }

        return module;
    }
}
