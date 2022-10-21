class TestComplexNum {
    public static void main(String[] args) {
      ComplexNum c1 = new ComplexNum();
      ComplexNum c2 = new ComplexNum();
      ComplexNum c3 = new ComplexNum();
      ComplexNum c4 = new ComplexNum();
      c1.build(3, 5);
      c2.build(7, -4);
      c3.build(-2, 3);
      c4.build(-2, 3);
      System.out.print("\n"+ c1.toStringRep());
      System.out.print("\n"+ c2.toStringRep());
      System.out.print("\n"+ c3.toStringRep());
      System.out.print("\n"+ c4.toStringRep());
      c1.add(c2);
      c2.add(c4);
      System.out.print("\n"+ c1.toStringRep());
      System.out.print("\n"+ c2.toStringRep());
      System.out.print("\n"+ c3.toStringRep());
      System.out.print("\n"+ c4.toStringRep());
      c3.equal(c1);
      c3.equal(c2);
      c3.equal(c4);
      
    }
}
