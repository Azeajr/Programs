public class SalesTest{
    public static void main(String[] args){
        SalesTeam alpha = new SalesTeam("Alpha");
        SalesPerson tom = new SalesPerson("Tom Payne","860-234-7643","South");
        for(int i=0;i<7;i++){
            tom.setDailyAmount(i,Math.random()*10000);
        }
        
        SalesPerson big = new SalesPerson("Big Boss","860-208-7121","South");
        for(int i=0;i<7;i++){
            big.setDailyAmount(i,Math.random()*10000);
        }
        
        SalesPerson john = new SalesPerson("John Paul","203-555-3212","North");
        for(int i=0;i<7;i++){
            john.setDailyAmount(i,Math.random()*10000);
        }
        alpha.addSalesPerson(tom);
        alpha.addSalesPerson(john);
        alpha.addSalesPerson(big);
        alpha.weeklyReport();
    }
}