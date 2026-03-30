package edu.kis.vh.nursery;

/**
 * Klasa implementująca wariant wyliczanki typu Hanoi.
 * Element może zostać dodany tylko wtedy, gdy jest mniejszy lub równy
 * aktualnemu elementowi na szczycie. W przeciwnym przypadku element
 * zostaje odrzucony i zwiększany jest licznik odrzuceń.
 */

public class HanoiRhymer extends DefaultCountingOutRhymer {
    /** Liczba odrzuconych elementów. */
    private int totalRejected = 0;

    /**
     * Zwraca liczbę odrzuconych elementów.
     *
     * @return liczba odrzuceń
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje element do struktury zgodnie z zasadami Hanoi.
     * Jeśli struktura nie jest pusta i nowy element jest większy
     * niż element na szczycie, zostaje odrzucony.
     * W przeciwnym przypadku dodawany jest normalnie.
     *
     * @param in wartość do dodania
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
