package fr.uvsq.pglp;

import java.util.ArrayList;

public class AffichageParGroupe {
    ArrayList<InterfacePersonnels>arr;
    private class GroupeIterator extends Iterator {
        int index;
        public boolean hasNext() {
            if (index>=arr.size())
                return false;
            return true;

        }

        public InterfacePersonnels Next() {
            if(this.hasNext()) {
                return arr.get(index++);
            }
            return null;
        }
    }
}
