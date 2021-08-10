class TestMatch extends Game{
    double calculateIncome(String numGame){
        return Double.parseDouble(numGame)*50;
    }

    double calculateBonus(String performance, String grade){
        if(performance == "Good"){
            switch (grade) {
                case "A": return 0.3*calculateIncome(numGame);
                case "B": return 0.25*calculateIncome(numGame);
                case "C": return 0.15*calculateIncome(numGame);
            }
        }else if(performance == "Average"){
            switch (grade) {
                case "A": return 0.2*calculateIncome(numGame);
                case "B": return 0.15*calculateIncome(numGame);
                case "C": return 0.1*calculateIncome(numGame);
            }
        }else{
            switch (grade) {
                case "A": return 0.15*calculateIncome(numGame);
                case "B": return 0.1*calculateIncome(numGame);
                case "C": return 0.08*calculateIncome(numGame);
            }
        }
    }
}
