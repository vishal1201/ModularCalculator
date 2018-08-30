package com.aplombcreations;

import com.aplombcreations.Module.IModule;
import com.aplombcreations.Module.ModuleFactory;
import com.aplombcreations.Utilities.Modules;

import java.util.Scanner;
// Testing my first commit from tortoise git.
public class Main {
    public static void main(String args[]) {
        int moduleIndex;
        System.out.println("Selcet a module:");

        for (Modules modules : Modules.values()) {
            System.out.println((modules.ordinal() + 1) + ". " + modules.name());
        }

        Scanner sc = new Scanner(System.in);
        moduleIndex = sc.nextInt();
        Modules selectedModule = getSelectedModule(moduleIndex);
        if (selectedModule != null) {
            executeChoice(selectedModule);
        } else {
            System.out.println("Couldn't find corresponding module...");
        }
    }

    private static void executeChoice(Modules eModule) {
        System.out.println("Starting module: " + eModule.name());
        IModule module = ModuleFactory.getModule(eModule.name());
        if (module != null) {
            System.out.println(module.getModuleName() + " object created!!");
        } else {
            System.out.println("Couldn't create selected module object.");
        }
    }

    private static Modules getSelectedModule(int index) {
        Modules selectedModule = null;
        Modules[] modules = Modules.values();

        if ((modules.length < index) || index <= 0) {
            System.out.println("Invalid index.");
            return null;
        } else {
            for (Modules eModule : modules) {
                if (eModule.ordinal() + 1 == index) {
                    selectedModule = eModule;
                }
            }
        }
        return selectedModule;
    }

}

