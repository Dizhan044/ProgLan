public class ConcertTicketSystem {
    public static final int DEFAULT_PRICE = 50;
    private int[][] seatPrices;
    private boolean[][] seatAvailibility;
    private int totalRows;
    private int totalCols;
    private int seatsAvailable;

    public ConcertTicketSystem(int rows, int cols){
        this.totalRows = rows;
        this.totalCols = cols;
        this.seatsAvailable = rows * cols;
        initializeSeatPricesAndAvaiability();
    }

    private void initializeSeatPricesAndAvaiability() {
        seatPrices = new int[totalRows][totalCols];
        seatAvailibility = new boolean[totalRows][totalCols];

        for (int i = 0; i < totalRows; i++){
            for (int j = 0; j < totalCols; j++){
                seatPrices[i][j] = DEFAULT_PRICE;
                seatAvailibility[i][j] = true;
            }
        }
    }
    public void showSeatPrices(){
        System.out.println("Seat Prices: ");
        for (int i = 0; i < totalRows; i++){
            for (int j = 0; j < totalCols; j++){
                System.out.println("Row " + (i + 1) + ", Column " + (j + 1) + ": $" + seatPrices[i][j]);
            }
        }
    }
    public void showAvailableSeats(){
        System.out.println("Availble Seats: ");
        for (int i = 0; i < totalRows; i++){
            for (int j = 0; j < totalCols; j++){
                if (seatAvailibility[i][j]){
                    System.out.println("[ " + (i + 1) + "," + (j + 1) + " ] ");
                } else {
                    System.out.println("[ X ] ");
                }
            }
            System.out.println();
        }
    }
    public void  buyTicket(int row, int col){
        if (isvalidseat(row, col)){
            int price = seatPrices[row - 1][col - 1];
            System.out.println(" you have purchased a ticket at row" + row + "and column " + col + "for $" + price);
            seatAvailibility[row - 1][col - 1]= false;
            seatsAvailable = getSeatsAvailable() - 1;
        }
        else {
            System.out.println("invalid seat selection or seat is already taken.");
        }
    }

    private boolean isvalidseat(int row, int col) {
        return row >= 1 && row <= totalRows && col >= 1 && col <= totalCols && seatAvailibility[row - 1][col - 1];
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }
}