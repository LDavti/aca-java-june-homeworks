package com.aca.ArmineArzumanyan.homeWork_1.Repository;

import com.aca.ArmineArzumanyan.homeWork_1.Items.Gadget.Gadget;

import java.util.ArrayList;
import java.util.List;

public class GadgetsRepository implements Repository<Gadget> {
    List<Gadget> allGadgets;

    public GadgetsRepository() {
        allGadgets = new ArrayList<>();
    }

    public List<Gadget> getAll() {
        return allGadgets;
    }

    @Override
    public Gadget getItemByCod(int code) {
        for (Gadget gadget : allGadgets) {
            if (gadget.getCode() == code) {
                return gadget;
            }
        }
        return null;
    }

    public void printItemList(List<Gadget> gadgetList) {
        for (Gadget gadget : gadgetList) {
            System.out.println(gadget.getCount() + "  pieces of  " + gadget.getName() + ":  code: " + gadget.getCode());
        }


    }


}
