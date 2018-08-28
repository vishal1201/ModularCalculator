package com.aplombcreations;

import com.aplombcreations.Utils.Modules;

import java.util.Scanner;

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

    private static void executeChoice(Modules modules) {
        System.out.println("Starting module: " + modules.name());
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

