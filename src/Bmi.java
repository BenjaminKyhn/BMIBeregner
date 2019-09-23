public class Bmi {
    static double bmiBeregner(double vaegt, double hoejde){
        double bmi = Math.round(vaegt/Math.pow(hoejde, 2)*10.0)/10.0;
        if (vaegt > 0.1 && vaegt < 1000 && hoejde > 0.1 && hoejde < 3){
            return bmi;
        }
        else {
            return -1;
        }

    }
}
