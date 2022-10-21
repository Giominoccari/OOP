class TestStudent {

    public static void main(String[] args) {
        Student someone = new Student();
        Student next = new Student();
        Student another = new Student();
        someone.build("Giovanni", "Minoccari", 683, 2021);
        next.build("Taddeo", "Rossi", 999, 2020);
        another.build("Michel", "Croce", 123, 2019);
        someone.printStudentInfo();
        next.printStudentInfo();
        another.printStudentInfo();
    }
}
