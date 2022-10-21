class Train{
    int nTotSeats;
    int nFirstClassSeats;
    int nSecondClassSeats;
    int nFirstClassReservedSeats;
    int nSecondClassReservedSeats;
    void build(int nTot, int nFirst, int nSecond){
        this.nTotSeats = nTot;
        this.nFirstClassSeats = nFirst;
        this.nSecondClassSeats = nSecond;
    }
    void ReserveFirstClassSeats(int n){
        this.nFirstClassReservedSeats += n;
    }
    void ReserveSecondClassSeats(int n){
        this.nSecondClassReservedSeats += n;
    }
    double getTotOccupancyRatio(){
        double ratio = (((double)this.nFirstClassReservedSeats + (double)this.nSecondClassReservedSeats) / (double)this.nTotSeats)*100;
        return ratio;
    }
    double getFirstClassOccupancyRatio(){
        double ratio = ((double)this.nFirstClassReservedSeats / (double)this.nFirstClassSeats)*100;
        return ratio;
    }
    double getSecondClassOccupancyRatio(){
        double ratio = ((double)this.nSecondClassReservedSeats / (double)this.nSecondClassSeats)*100;
        return ratio;
    }
    void deleteAllReservation(){
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    }
}