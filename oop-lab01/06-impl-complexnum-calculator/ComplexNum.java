class ComplexNum {
    double re;
    double im;

    void build(double re, double im) {
        this.re = re;
        this.im = im;
    }

    boolean equal(ComplexNum num) {
        if(this.re == num.re && this.im == num.im){
            return true;
        }
        return false;
    }

    void add(ComplexNum num) {
        this.re += num.re;
        this.im += num.im;
    }

    String toStringRep() {
        String numt="";
        if(this.re != 0){
            numt+=this.re;
        }
        if(this.im != 0){
            if(this.im > 0){
                numt += "+";
            }
            numt+=this.im + "i";
        }
        return numt;
    }
}