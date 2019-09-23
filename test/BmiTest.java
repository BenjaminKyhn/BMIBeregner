import junit.framework.TestCase;

public class BmiTest extends TestCase {

    public void testBmiBeregner() {
        double resultat;

        //Test med egne tal
        resultat = Bmi.bmiBeregner(76, 1.78);
        assertEquals(24.0, resultat);

        //Test med vægt under minimumsvægt
        resultat = Bmi.bmiBeregner(0.1,1.78);
        assertEquals(-1.0, resultat);

        //Test med højde under minimumshøjde
        resultat = Bmi.bmiBeregner(76, 0.1);
        assertEquals(-1.0,resultat);

        //Test med vægt over maximumsvægt
        resultat = Bmi.bmiBeregner(1000,1.78);
        assertEquals(-1.0, resultat);

        //Test med højde over maximumshøjde
        resultat = Bmi.bmiBeregner(76, 0.1);
        assertEquals(-1.0,resultat);

        //Test med negativt resultat
        resultat = Bmi.bmiBeregner(-76, 1.78);
        assertEquals(-1.0,resultat);

        //Test med division m. 0
        resultat = Bmi.bmiBeregner(76, 0.0);
        assertEquals(-1.0,resultat);

        //Test med undervægtig person
        resultat = Bmi.bmiBeregner(40, 1.60);
        assertEquals(15.6,resultat);

        //Test med normalvægtig person
        resultat = Bmi.bmiBeregner(50, 1.60);
        assertEquals(19.5,resultat);

        //Test med undervægtig person
        resultat = Bmi.bmiBeregner(70, 1.60);
        assertEquals(27.3,resultat);
    }
}