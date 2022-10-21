class ComplexNumCalculator{
    int nOpDone;
    ComplexNum LastRes = new ComplexNum();
    void build(){
        this.nOpDone = 0;
        this.LastRes.build(0,0);
    }
    ComplexNum add(ComplexNum a, ComplexNum b){
        a.im += b.im;
        a.re += b.re;
        this.nOpDone += 1;
        this.LastRes = a;
        return a;
    }
    ComplexNum sub(ComplexNum a, ComplexNum b){
        a.im -= b.im;
        a.re -= b.re;
        this.nOpDone += 1;
        this.LastRes = a;
        return a;
    }
    ComplexNum mul(ComplexNum a, ComplexNum b){
        ComplexNum c = new ComplexNum();
        c.build(0, 0);
        c.re = ((a.re * b.re) - (a.im * b.im));
        c.im = ((a.re * b.im) + (a.im * b.re));
        this.nOpDone += 1;
        this.LastRes = c;
        return c;
    }
    ComplexNum div(ComplexNum a, ComplexNum b){
        ComplexNum c = new ComplexNum();
        c.build(0, 0);
        c.re = ((a.re * b.re) + (a.im * b.im)) / ((b.re * b.re) + (b.im * b.im));
        c.im = ((a.im * b.re) - (a.re * b.im)) / ((b.re * b.re) + (b.im * b.im));
        this.nOpDone += 1;
        this.LastRes = c;
        return c;
    }
}