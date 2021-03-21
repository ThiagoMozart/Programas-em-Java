package ic.uff.semana4.exercicio1e2;

public class conversaoDeUnidadesDeArea {

    private static double pes = 10.76;
    private static int cm = 929;
    private static int milha = 640;
    private static int acre = 43560;
    private static int metros = 8250;
    public static double areaPes;
    public static double areaAcres;
    public static double areaCm;
    public static double areaMilha;

    public static void converterPes(){
        areaPes = metros * pes;
    }

    public static void converterAcres(){
        converterPes();
        areaAcres = areaPes / acre;
    }

    public static void converterCm(){
        converterPes();
        areaCm = areaPes * cm;
    }

    public static void converterMilha(){
        converterAcres();
        areaMilha = areaAcres / milha;
    }

}
