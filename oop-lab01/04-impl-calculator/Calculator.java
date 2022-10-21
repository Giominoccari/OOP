class Calculator{
    int nOpDone;
    double LastRes;
    void build(){
        this.nOpDone=0;
        this.LastRes=0;
    }
    double add(double a, double b){
        double c = a + b;
        this.nOpDone+=1;
        this.LastRes=c;
        return c;
    }
    double sub(double a, double b){
        double c = a - b;
        this.nOpDone+=1;
        this.LastRes=c;
        return c;
    }
    double mul(double a, double b){
        double c = a * b;
        this.nOpDone+=1;
        this.LastRes=c;
        return c;
    }
    double div(double a, double b){
        double c = a / b;
        this.nOpDone+=1;
        this.LastRes=c;
        return c;
    }
 
}