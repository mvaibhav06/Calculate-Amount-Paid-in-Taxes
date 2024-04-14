public class TaxCalculator {
    public double calculateTax(int[][] brackets, int income) {
        double out = 0;

        for(int i=0; i<brackets.length; i++){
            if(income > brackets[i][0]){
                if(i!=0){
                    out += (brackets[i][0]-brackets[i-1][0])*brackets[i][1]*0.01;
                }else{
                    out += brackets[i][0]*brackets[i][1]*0.01;
                }
            }else{
                if(i>0){
                    out += (income - brackets[i-1][0])*brackets[i][1]*0.01;
                }else{
                    out += income*brackets[i][1]*0.01;
                }
                break;
            }
        }

        return out;
    }
}
