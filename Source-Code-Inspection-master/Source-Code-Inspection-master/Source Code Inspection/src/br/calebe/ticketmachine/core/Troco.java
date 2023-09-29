package br.calebe.ticketmachine.core;

import java.util.Iterator;

public class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {
        papeisMoeda = new PapelMoeda[6];

        papeisMoeda[5] = new PapelMoeda(100, valor / 100);
        valor %= 100;
        papeisMoeda[4] = new PapelMoeda(50, valor / 50);
        valor %= 50;
        papeisMoeda[3] = new PapelMoeda(20, valor / 20);
        valor %= 20;
        papeisMoeda[2] = new PapelMoeda(10, valor / 10);
        valor %= 10;
        papeisMoeda[1] = new PapelMoeda(5, valor / 5);
        valor %= 5;
        papeisMoeda[0] = new PapelMoeda(2, valor / 2);
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;
        protected int currentIndex = 0;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < troco.papeisMoeda.length;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = troco.papeisMoeda[currentIndex];
            currentIndex++;
            return ret;
        }

        @Override
        public void remove() {
            next();
        }
    }
}
