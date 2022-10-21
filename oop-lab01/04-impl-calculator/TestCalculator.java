class TestCalculator {
  public static void main(String[] args) {
      Calculator calc = new Calculator();
      System.out.println("1 + 2 =" + calc.add(1, 2)+ "lastres=" + calc.LastRes+ "num op=" + calc.nOpDone);
      System.out.println("-1 - 2 =" + calc.sub(-1, 2)+ "lastres=" + calc.LastRes+ "num op=" + calc.nOpDone);
      System.out.println("6 * 3 =" + calc.mul(6, 3)+ "lastres=" + calc.LastRes+ "num op=" + calc.nOpDone);
      System.out.println("8 / 4 =" + calc.div(8, 4)+ "lastres=" + calc.LastRes+ "num op=" + calc.nOpDone);
  }
}
