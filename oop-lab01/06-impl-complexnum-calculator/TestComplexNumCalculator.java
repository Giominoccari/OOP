class TestComplexNumCalculator {
  public static void main(String[] args) {
      /*
       * 1) Testare la classe ComplexNumCalculator con le seguenti operazioni
       *    tra numeri complessi:
       *
       * - add(1+2i, 2+3i) = 3+5i
       *
       * - sub(4+5i, 6+7i) = -2-2i
       *
       * - mul(8+2i, 3-i) = 26 - 2i
       *
       * - ... altre a piacere
       *
       * 2) Verificare il corretto valore dei campi nOpDone, lastRes
       *
       * 3) Fare altre prove con operazioni a piacere
       */
      ComplexNumCalculator calc = new ComplexNumCalculator();
      ComplexNum a = new ComplexNum();
      ComplexNum b = new ComplexNum();
      ComplexNum c = new ComplexNum();
      a.build(1, 2);
      b.build(2, 3);
      c = calc.add(a, b);
      System.out.print("\n(1+2i) + (2+3i) = " + c.toStringRep());
      System.out.print("\nLast res = " + calc.LastRes.toStringRep() + "n Op Done = " + calc.nOpDone + "\n");
      a.build(4, 5);
      b.build(6, 7);
      c = calc.sub(a, b);
      System.out.print("\n(4+5i) - (6+7i) = " + c.toStringRep());
      System.out.print("\nLast res = " + calc.LastRes.toStringRep() + "n Op Done = " + calc.nOpDone + "\n");
      a.build(8, 2);
      b.build(3, -1);
      c = calc.mul(a, b);
      System.out.print("\n(8+2i) * (3-i) = " + c.toStringRep());
      System.out.print("\nLast res = " + calc.LastRes.toStringRep() + "n Op Done = " + calc.nOpDone + "\n");
      a.build(2, 6);
      b.build(9, 4);
      c = calc.div(a, b);
      System.out.print("\n(2+6i) / (9+4i) = " + c.toStringRep());
      System.out.print("\nLast res = " + calc.LastRes.toStringRep() + "n Op Done = " + calc.nOpDone + "\n");
  }
}
