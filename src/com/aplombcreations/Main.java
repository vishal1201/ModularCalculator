package com.aplombcreations;

import com.aplombcreations.Module.IModule;
import com.aplombcreations.Module.ModuleFactory;
import com.aplombcreations.Utilities.EModule;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int moduleIndex;
        System.out.println("Select a module:");

        for (EModule eModule : EModule.values()) {
            System.out.println(eModule.toString() + ". " + eModule.name());
        }

        Scanner sc = new Scanner(System.in);
        moduleIndex = sc.nextInt();
        EModule selectedModule = getSelectedModule(moduleIndex);
        if (selectedModule != null) {
            executeChoice(selectedModule);
        } else {
            System.out.println("Couldn't find corresponding module...");
        }
    }

    private static void executeChoice(EModule eModule) {
        System.out.println("Starting module: " + eModule.name());
        IModule module = ModuleFactory.getModule(eModule.name());
        if (module != null) {
            System.out.println(module.getModuleName() + " object created!!");
        } else {
            System.out.println("Couldn't create selected module object.");
        }
    }

    private static EModule getSelectedModule(int index) {
        EModule selectedModule = null;
        EModule[] eModules = EModule.values();

        if ((eModules.length < index) || index <= 0) {
            System.out.println("Invalid index.");
            return null;
        } else {
            for (EModule eModule : eModules) {
                if (Integer.parseInt(eModule.toString()) == index) {
                    selectedModule = eModule;
                }
            }
        }
        return selectedModule;
    }

}

