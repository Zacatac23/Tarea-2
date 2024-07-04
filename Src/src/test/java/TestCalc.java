public class CalcTest {

    private Calc calc;

    
    public void setUp() {
        calc = new Calc();
    }

    
    public void testSuma() {
        assertEquals(5, calc.suma(2, 3));
        assertEquals(0, calc.suma(-1, 1));
        assertEquals(-5, calc.suma(-3, -2));
    }

    
    public void testResta() {
        assertEquals(1, calc.resta(3, 2));
        assertEquals(-2, calc.resta(-1, 1));
        assertEquals(-1, calc.resta(-3, -2));
    }

    
    public void testMultiplicacion() {
        assertEquals(6, calc.multiplicacion(2, 3));
        assertEquals(-1, calc.multiplicacion(-1, 1));
        assertEquals(6, calc.multiplicacion(-3, -2));
    }
}