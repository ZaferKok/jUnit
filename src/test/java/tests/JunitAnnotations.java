package tests;

import org.junit.*;

public class JunitAnnotations {

    @BeforeClass
    public static void classAcilis(){
        System.out.println("CLASS CALIŞMAYA BAŞLADI");
    }

    @AfterClass
    public static void classKapanis(){
        System.out.println("CLASS İŞLEMLERİ SONA ERDİ");
    }

    @Before
    public void acilis(){
        System.out.println("Ben her testten önce çalışırım");
    }

    @After
    public void kapanis(){
        System.out.println("Ben her testten sonra çalışırım");
    }

    @Test @Ignore
    public void jUnitIleIlkTest(){
        System.out.println("-------------------");
        System.out.println("1. Test çalışıyor");
        System.out.println("-------------------");
    }

    @Test
    public void jUnitIleIkinciTest(){
        System.out.println("-------------------");
        System.out.println("2. Test çalışıyor");
        System.out.println("-------------------");
    }

    @Test
    public void jUnitIleUcuncuTest(){
        System.out.println("-------------------");
        System.out.println("3. Test çalışıyor");
        System.out.println("-------------------");
    }
}
