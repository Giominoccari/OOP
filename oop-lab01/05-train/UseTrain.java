class UseTrain {
    public static void main(String[] args) {
        /*
         * Premesse per un corretto testing della classe. Per ragioni di
         * coerenza e semplicità:
         * - I vari metodi siano sempre invocati passando dei parametri di input
         * validi e consistenti (p.e. non invocare i metodi per effettuare delle
         * prenotazioni specificando un numero di posti superiore alla capienza
         * del treno, ai posti disponibili per la classe (prima/seconda)
         * considerata, al numero di posti correntemente liberi
         */
        Train treno = new Train();
        treno.build(300, 100, 200);
        treno.ReserveFirstClassSeats(36);
        treno.ReserveSecondClassSeats(124);
        System.out.print("\n" + treno.getFirstClassOccupancyRatio() + "%");
        System.out.print("\n" + treno.getSecondClassOccupancyRatio() + "%");
        treno.deleteAllReservation();
        treno.ReserveFirstClassSeats(53);
        treno.ReserveSecondClassSeats(99);
        System.out.print("\n" + treno.getFirstClassOccupancyRatio() + "%");
        System.out.print("\n" + treno.getSecondClassOccupancyRatio() + "%");
    }
}
