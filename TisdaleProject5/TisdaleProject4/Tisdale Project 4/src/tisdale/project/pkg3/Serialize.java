/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisdale.project.pkg3;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author student
 */
public class Serialize {

    static public void serialize(ArrayList<StoreItem> items) {
        try {
            FileOutputStream fileOut = new FileOutputStream("storeItems.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for (int i = 0; i < items.size(); i++) {
                StoreItem item = items.get(i);
                out.writeObject(item);
            }
            //out.writeObject(items.get(0));
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
