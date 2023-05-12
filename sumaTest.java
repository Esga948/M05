public class sumaTest {
    @Test
    public void testSumar() {
        int num1 = 2;
        int num2 = 3;
        suma instance = new suma();
        int expResult = 5;
        int result = instance.Sumar(num1, num2);
        assertEquals(expResult, result);
    }
}
