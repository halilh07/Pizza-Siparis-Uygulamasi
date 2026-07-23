/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hraba
 */
public class PizzaOlusturmaEkrani extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PizzaOlusturmaEkrani.class.getName());

    public int pizzaMaliyeti = 0;
    private int kucukBoyFiyat = 120;
    private int ortaBoyFiyat = 180;
    private int buyukBoyFiyat = 230;
    private int kalinHamurFiyat = 15;
    private int peynirDolguluKenarFiyat = 35;
    private int sarimsakliKenarFiyat = 15;
    private int tamBugdayKenarFiyat = 20;
    private int domatesSosFiyat = 25;
    private int aciliDomatesSosFiyat = 25;
    private int barbekuSosFiyat = 40;
    private int kremaliSosFiyat = 50;
    private int salamFiyat = 25;
    private int sosisFiyat = 40;
    private int pastirmaFiyat = 65;
    private int tavukDilimFiyat = 75;
    private int tonBalikFiyat = 90;
    private int mozarellaFiyat = 20;
    private int cheddarFiyat = 40;
    private int tulumPeynirFiyat = 35;
    private int beyazPeynirFiyat = 30;
    private int keciPeynirFiyat = 40;
    private int mantarFiyat = 25;
    private int misirFiyat = 35;
    private int zeytinFiyat = 30;
    private int biberFiyat = 45;
    private int kupDomatesFiyat = 50;
    private int jalapenoFiyat = 60;
    private int ananasFiyat = 85;
    
    public PizzaOlusturmaEkrani() {
        initComponents();
    
        // Ekran tam pencerede açılır
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); 
    
        // Pencere boyutunu değiştirilemez yaptık
        setResizable(false);
        
        // Pizza boyut seçenekleri için oluşturduğumuz radio butonlarını bir gruba alıyoruz
        javax.swing.ButtonGroup boyGrubu = new javax.swing.ButtonGroup();
        boyGrubu.add(kucukBoySecim);
        boyGrubu.add(ortaBoySecim);
        boyGrubu.add(buyukBoySecim);
        kucukBoySecim.setSelected(true); 

        // Hamur seçenekleri için oluşturduğumuz radio butonlarını bir gruba alıyoruz
        javax.swing.ButtonGroup hamurGrubu = new javax.swing.ButtonGroup();
        hamurGrubu.add(klasikHamurSecim);
        hamurGrubu.add(inceHamurSecim);
        hamurGrubu.add(kalinHamurSecim);
        hamurGrubu.add(peynirliHamurSecim);
        hamurGrubu.add(sarimsakliHamurSecim);
        hamurGrubu.add(tamBugdayliHamurSecim);
        klasikHamurSecim.setSelected(true);
        
        // 1.Sos seçenekleri için oluşturduğumuz radio butonlarını bir gruba alıyoruz
        javax.swing.ButtonGroup sosGrubu1 = new javax.swing.ButtonGroup();
        sosGrubu1.add(domatesSosSecim1);
        sosGrubu1.add(aciSosSecim1);
        sosGrubu1.add(barbekuSosSecim1);
        sosGrubu1.add(kremaliSosSecim1);
        domatesSosSecim1.setSelected(true);
        
        // 2.Sos seçenekleri için oluşturduğumuz radio butonlarını bir gruba alıyoruz
        javax.swing.ButtonGroup sosGrubu2 = new javax.swing.ButtonGroup();
        sosGrubu2.add(domatesSosSecim2);
        sosGrubu2.add(aciSosSecim2);
        sosGrubu2.add(barbekuSosSecim2);
        sosGrubu2.add(kremaliSosSecim2);
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ekranAnaBaslik = new javax.swing.JLabel();
        ekranAltBaslik = new javax.swing.JLabel();
        boyutSecimBaslik = new javax.swing.JLabel();
        kucukBoySecim = new javax.swing.JRadioButton();
        ortaBoySecim = new javax.swing.JRadioButton();
        buyukBoySecim = new javax.swing.JRadioButton();
        pizzaBoyutu = new javax.swing.JLabel();
        hamurSecimBaslik = new javax.swing.JLabel();
        klasikHamurSecim = new javax.swing.JRadioButton();
        inceHamurSecim = new javax.swing.JRadioButton();
        kalinHamurSecim = new javax.swing.JRadioButton();
        peynirliHamurSecim = new javax.swing.JRadioButton();
        sarimsakliHamurSecim = new javax.swing.JRadioButton();
        tamBugdayliHamurSecim = new javax.swing.JRadioButton();
        pizzaHamuru = new javax.swing.JLabel();
        pizzaSosuSecimBaslik = new javax.swing.JLabel();
        domatesSosSecim1 = new javax.swing.JRadioButton();
        aciSosSecim1 = new javax.swing.JRadioButton();
        barbekuSosSecim1 = new javax.swing.JRadioButton();
        kremaliSosSecim1 = new javax.swing.JRadioButton();
        pizzaSosuSecimBaslik1 = new javax.swing.JLabel();
        domatesSosSecim2 = new javax.swing.JRadioButton();
        aciSosSecim2 = new javax.swing.JRadioButton();
        barbekuSosSecim2 = new javax.swing.JRadioButton();
        kremaliSosSecim2 = new javax.swing.JRadioButton();
        pizzaSosu = new javax.swing.JLabel();
        etUrunSecimiBaslik = new javax.swing.JLabel();
        sucukSecim = new javax.swing.JCheckBox();
        salamSecim = new javax.swing.JCheckBox();
        sosisSecim = new javax.swing.JCheckBox();
        pastirmaSecim = new javax.swing.JCheckBox();
        tavukSecim = new javax.swing.JCheckBox();
        tonbalikSecim = new javax.swing.JCheckBox();
        etUrunu = new javax.swing.JLabel();
        peynirUrunSecimiBaslik = new javax.swing.JLabel();
        mozarellaSecim = new javax.swing.JCheckBox();
        cheddarSecim = new javax.swing.JCheckBox();
        tulumSecim = new javax.swing.JCheckBox();
        beyazSecim = new javax.swing.JCheckBox();
        keciPeynirSecim = new javax.swing.JCheckBox();
        peynirUrunu = new javax.swing.JLabel();
        ekstraSecimBaslik = new javax.swing.JLabel();
        mantarSecim = new javax.swing.JCheckBox();
        misirSecim = new javax.swing.JCheckBox();
        zeytinSecim = new javax.swing.JCheckBox();
        biberSecim = new javax.swing.JCheckBox();
        kupDomatesSecim = new javax.swing.JCheckBox();
        jalapenoSecim = new javax.swing.JCheckBox();
        ananasSecim = new javax.swing.JCheckBox();
        ekstraUrun = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        anaSayfaDonButonu = new javax.swing.JButton();
        pizzaOlusturButonu = new javax.swing.JButton();
        maliyetYazisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 51, 0));

        ekranAnaBaslik.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ekranAnaBaslik.setForeground(new java.awt.Color(255, 255, 255));
        ekranAnaBaslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ekranAnaBaslik.setText("KENDİ PİZZANI OLUŞTUR");
        ekranAnaBaslik.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ekranAltBaslik.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ekranAltBaslik.setForeground(new java.awt.Color(0, 0, 0));
        ekranAltBaslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ekranAltBaslik.setText("Güzel zevklerini kendine uygun pizzayı inşaa etmek için kullan!");

        boyutSecimBaslik.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        boyutSecimBaslik.setForeground(new java.awt.Color(204, 204, 0));
        boyutSecimBaslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boyutSecimBaslik.setText("1) Pizzanın Boyutunu Seçiniz");

        kucukBoySecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        kucukBoySecim.setForeground(new java.awt.Color(255, 255, 255));
        kucukBoySecim.setText("Küçük Boy (20-22 cm çapında) - 120 TL");
        kucukBoySecim.addActionListener(this::kucukBoySecimActionPerformed);

        ortaBoySecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        ortaBoySecim.setForeground(new java.awt.Color(255, 255, 255));
        ortaBoySecim.setText("Orta Boy (28-30 cm çapında) - 180 TL");
        ortaBoySecim.addActionListener(this::ortaBoySecimActionPerformed);

        buyukBoySecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        buyukBoySecim.setForeground(new java.awt.Color(255, 255, 255));
        buyukBoySecim.setText("Büyük Boy (34-36 cm çapında) - 230 TL");
        buyukBoySecim.addActionListener(this::buyukBoySecimActionPerformed);

        pizzaBoyutu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaBoyutu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/pizzaboyut.png"))); // NOI18N

        hamurSecimBaslik.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        hamurSecimBaslik.setForeground(new java.awt.Color(204, 204, 0));
        hamurSecimBaslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hamurSecimBaslik.setText("2) Pizzanın Hamurunu Seçiniz");

        klasikHamurSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        klasikHamurSecim.setForeground(new java.awt.Color(255, 255, 255));
        klasikHamurSecim.setText("Klasik Hamur - Ücretsiz");

        inceHamurSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        inceHamurSecim.setForeground(new java.awt.Color(255, 255, 255));
        inceHamurSecim.setText("İnce Hamur (İtalyan tarzı) - Ücretsiz");

        kalinHamurSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        kalinHamurSecim.setForeground(new java.awt.Color(255, 255, 255));
        kalinHamurSecim.setText("Kalın Hamur - 15 TL");
        kalinHamurSecim.addActionListener(this::kalinHamurSecimActionPerformed);

        peynirliHamurSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        peynirliHamurSecim.setForeground(new java.awt.Color(255, 255, 255));
        peynirliHamurSecim.setText("Peynir Dolgulu Kenar - 35 TL");
        peynirliHamurSecim.addActionListener(this::peynirliHamurSecimActionPerformed);

        sarimsakliHamurSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        sarimsakliHamurSecim.setForeground(new java.awt.Color(255, 255, 255));
        sarimsakliHamurSecim.setText("Sarımsaklı & Baharatlı Hamur - 15 TL");
        sarimsakliHamurSecim.addActionListener(this::sarimsakliHamurSecimActionPerformed);

        tamBugdayliHamurSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        tamBugdayliHamurSecim.setForeground(new java.awt.Color(255, 255, 255));
        tamBugdayliHamurSecim.setText("Tam Buğdaylı Hamur - 20 TL");
        tamBugdayliHamurSecim.addActionListener(this::tamBugdayliHamurSecimActionPerformed);

        pizzaHamuru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaHamuru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/pizzahamuru.png"))); // NOI18N

        pizzaSosuSecimBaslik.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        pizzaSosuSecimBaslik.setForeground(new java.awt.Color(204, 204, 0));
        pizzaSosuSecimBaslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaSosuSecimBaslik.setText("3) 1.Sosu Seçiniz (Zorunlu)");

        domatesSosSecim1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        domatesSosSecim1.setForeground(new java.awt.Color(255, 255, 255));
        domatesSosSecim1.setText("Klasik Domates Sosu - Ücretsiz");

        aciSosSecim1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        aciSosSecim1.setForeground(new java.awt.Color(255, 255, 255));
        aciSosSecim1.setText("Acılı Domates Sosu - Ücretsiz");

        barbekuSosSecim1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        barbekuSosSecim1.setForeground(new java.awt.Color(255, 255, 255));
        barbekuSosSecim1.setText("Barbekü Sos (BBQ) - Ücretsiz");

        kremaliSosSecim1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        kremaliSosSecim1.setForeground(new java.awt.Color(255, 255, 255));
        kremaliSosSecim1.setText("Kremalı Sarımsaklı Sos - Ücretsiz");

        pizzaSosuSecimBaslik1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        pizzaSosuSecimBaslik1.setForeground(new java.awt.Color(204, 204, 0));
        pizzaSosuSecimBaslik1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaSosuSecimBaslik1.setText("4) 2.Sosu Seçiniz (Ekstra)");

        domatesSosSecim2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        domatesSosSecim2.setForeground(new java.awt.Color(255, 255, 255));
        domatesSosSecim2.setText("Klasik Domates Sosu - 25 TL");
        domatesSosSecim2.addActionListener(this::domatesSosSecim2ActionPerformed);

        aciSosSecim2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        aciSosSecim2.setForeground(new java.awt.Color(255, 255, 255));
        aciSosSecim2.setText("Acılı Domates Sosu - 25 TL");
        aciSosSecim2.addActionListener(this::aciSosSecim2ActionPerformed);

        barbekuSosSecim2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        barbekuSosSecim2.setForeground(new java.awt.Color(255, 255, 255));
        barbekuSosSecim2.setText("Barbekü Sos (BBQ) - 40 TL");
        barbekuSosSecim2.addActionListener(this::barbekuSosSecim2ActionPerformed);

        kremaliSosSecim2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        kremaliSosSecim2.setForeground(new java.awt.Color(255, 255, 255));
        kremaliSosSecim2.setText("Kremalı Sarımsaklı Sos - 50 TL");
        kremaliSosSecim2.addActionListener(this::kremaliSosSecim2ActionPerformed);

        pizzaSosu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pizzaSosu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/pizzasosu.png"))); // NOI18N

        etUrunSecimiBaslik.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        etUrunSecimiBaslik.setForeground(new java.awt.Color(204, 204, 0));
        etUrunSecimiBaslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etUrunSecimiBaslik.setText("4) Et Ürünlerini seçiniz");

        sucukSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        sucukSecim.setForeground(new java.awt.Color(255, 255, 255));
        sucukSecim.setText("Sucuk (Ücretsiz)");
        sucukSecim.addActionListener(this::sucukSecimActionPerformed);

        salamSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        salamSecim.setForeground(new java.awt.Color(255, 255, 255));
        salamSecim.setText("Salam (25 TL)");
        salamSecim.addActionListener(this::salamSecimActionPerformed);

        sosisSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        sosisSecim.setForeground(new java.awt.Color(255, 255, 255));
        sosisSecim.setText("Sosis (40 TL)");
        sosisSecim.addActionListener(this::sosisSecimActionPerformed);

        pastirmaSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        pastirmaSecim.setForeground(new java.awt.Color(255, 255, 255));
        pastirmaSecim.setText("Pastırma (65 TL)");
        pastirmaSecim.addActionListener(this::pastirmaSecimActionPerformed);

        tavukSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        tavukSecim.setForeground(new java.awt.Color(255, 255, 255));
        tavukSecim.setText("Tavuk Dilimleri (75 TL)");
        tavukSecim.addActionListener(this::tavukSecimActionPerformed);

        tonbalikSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        tonbalikSecim.setForeground(new java.awt.Color(255, 255, 255));
        tonbalikSecim.setText("Ton Balığı (90 TL)");
        tonbalikSecim.addActionListener(this::tonbalikSecimActionPerformed);

        etUrunu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etUrunu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/pizzaetmalzemesi.png"))); // NOI18N

        peynirUrunSecimiBaslik.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        peynirUrunSecimiBaslik.setForeground(new java.awt.Color(204, 204, 0));
        peynirUrunSecimiBaslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peynirUrunSecimiBaslik.setText("5) Peynir Ürünü seçiniz");

        mozarellaSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        mozarellaSecim.setForeground(new java.awt.Color(255, 255, 255));
        mozarellaSecim.setText("Mozarella Peyniri (20 TL)");
        mozarellaSecim.addActionListener(this::mozarellaSecimActionPerformed);

        cheddarSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        cheddarSecim.setForeground(new java.awt.Color(255, 255, 255));
        cheddarSecim.setText("Cheddar Peyniri (40 TL)");
        cheddarSecim.addActionListener(this::cheddarSecimActionPerformed);

        tulumSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        tulumSecim.setForeground(new java.awt.Color(255, 255, 255));
        tulumSecim.setText("Tulum Peyniri (35 TL)");
        tulumSecim.addActionListener(this::tulumSecimActionPerformed);

        beyazSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        beyazSecim.setForeground(new java.awt.Color(255, 255, 255));
        beyazSecim.setText("Beyaz Peynir Ezine (30 TL)");
        beyazSecim.addActionListener(this::beyazSecimActionPerformed);

        keciPeynirSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        keciPeynirSecim.setForeground(new java.awt.Color(255, 255, 255));
        keciPeynirSecim.setText("Keçi Peyniri (40 TL)");
        keciPeynirSecim.addActionListener(this::keciPeynirSecimActionPerformed);

        peynirUrunu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peynirUrunu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/peynirler.png"))); // NOI18N

        ekstraSecimBaslik.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ekstraSecimBaslik.setForeground(new java.awt.Color(204, 204, 0));
        ekstraSecimBaslik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ekstraSecimBaslik.setText("6) Ekstra Malzemeler");

        mantarSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        mantarSecim.setForeground(new java.awt.Color(255, 255, 255));
        mantarSecim.setText("Mantar (25 TL)");
        mantarSecim.addActionListener(this::mantarSecimActionPerformed);

        misirSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        misirSecim.setForeground(new java.awt.Color(255, 255, 255));
        misirSecim.setText("Mısır (35 TL)");
        misirSecim.addActionListener(this::misirSecimActionPerformed);

        zeytinSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        zeytinSecim.setForeground(new java.awt.Color(255, 255, 255));
        zeytinSecim.setText("Siyah Zeytin (30 TL)");
        zeytinSecim.addActionListener(this::zeytinSecimActionPerformed);

        biberSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        biberSecim.setForeground(new java.awt.Color(255, 255, 255));
        biberSecim.setText("Yeşil Biber (45 TL)");
        biberSecim.addActionListener(this::biberSecimActionPerformed);

        kupDomatesSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        kupDomatesSecim.setForeground(new java.awt.Color(255, 255, 255));
        kupDomatesSecim.setText("Küp Domates (50 TL)");
        kupDomatesSecim.addActionListener(this::kupDomatesSecimActionPerformed);

        jalapenoSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jalapenoSecim.setForeground(new java.awt.Color(255, 255, 255));
        jalapenoSecim.setText("Jalapeno Biberi (60 TL)");
        jalapenoSecim.addActionListener(this::jalapenoSecimActionPerformed);

        ananasSecim.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        ananasSecim.setForeground(new java.awt.Color(255, 255, 255));
        ananasSecim.setText("Ananas (85 TL)");
        ananasSecim.addActionListener(this::ananasSecimActionPerformed);

        ekstraUrun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ekstraUrun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ekstramalzemeler.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));

        anaSayfaDonButonu.setBackground(new java.awt.Color(255, 255, 0));
        anaSayfaDonButonu.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        anaSayfaDonButonu.setForeground(new java.awt.Color(0, 0, 0));
        anaSayfaDonButonu.setText("ANA SAYFAYA DÖN");
        anaSayfaDonButonu.addActionListener(this::anaSayfaDonButonuActionPerformed);

        pizzaOlusturButonu.setBackground(new java.awt.Color(102, 255, 51));
        pizzaOlusturButonu.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        pizzaOlusturButonu.setForeground(new java.awt.Color(0, 0, 0));
        pizzaOlusturButonu.setText("PİZZAYI OLUŞTUR");
        pizzaOlusturButonu.addActionListener(this::pizzaOlusturButonuActionPerformed);

        maliyetYazisi.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        maliyetYazisi.setForeground(new java.awt.Color(255, 255, 255));
        maliyetYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maliyetYazisi.setText("Pizzanın maliyeti = 120 TL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(anaSayfaDonButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pizzaOlusturButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(maliyetYazisi)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(maliyetYazisi)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anaSayfaDonButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pizzaOlusturButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(250, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ekranAnaBaslik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ekranAltBaslik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buyukBoySecim)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pizzaBoyutu)
                                .addGap(168, 168, 168)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(domatesSosSecim2)
                                    .addComponent(aciSosSecim2)
                                    .addComponent(barbekuSosSecim2)
                                    .addComponent(kremaliSosSecim2)
                                    .addComponent(pizzaSosu)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pizzaHamuru)
                                .addGap(432, 432, 432)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(kucukBoySecim)
                                    .addGap(305, 305, 305))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ortaBoySecim)
                                    .addGap(316, 316, 316)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(boyutSecimBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(domatesSosSecim1)
                                            .addComponent(aciSosSecim1)
                                            .addComponent(barbekuSosSecim1)
                                            .addComponent(kremaliSosSecim1)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pizzaSosuSecimBaslik1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pizzaSosuSecimBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sucukSecim)
                                    .addComponent(salamSecim)
                                    .addComponent(sosisSecim)
                                    .addComponent(pastirmaSecim)
                                    .addComponent(tavukSecim)
                                    .addComponent(tonbalikSecim)
                                    .addComponent(etUrunu))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mozarellaSecim)
                                    .addComponent(cheddarSecim)
                                    .addComponent(tulumSecim)
                                    .addComponent(beyazSecim)
                                    .addComponent(keciPeynirSecim)
                                    .addComponent(peynirUrunu))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ananasSecim)
                                    .addComponent(kupDomatesSecim)
                                    .addComponent(biberSecim)
                                    .addComponent(zeytinSecim)
                                    .addComponent(misirSecim)
                                    .addComponent(mantarSecim)
                                    .addComponent(jalapenoSecim)
                                    .addComponent(ekstraUrun)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(etUrunSecimiBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(peynirUrunSecimiBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(ekstraSecimBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tamBugdayliHamurSecim)
                    .addComponent(sarimsakliHamurSecim)
                    .addComponent(peynirliHamurSecim)
                    .addComponent(kalinHamurSecim)
                    .addComponent(inceHamurSecim)
                    .addComponent(klasikHamurSecim)
                    .addComponent(hamurSecimBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(525, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ekranAnaBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ekranAltBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boyutSecimBaslik)
                            .addComponent(pizzaSosuSecimBaslik)
                            .addComponent(etUrunSecimiBaslik)
                            .addComponent(peynirUrunSecimiBaslik)
                            .addComponent(ekstraSecimBaslik))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(domatesSosSecim1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sucukSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mozarellaSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mantarSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kucukBoySecim, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ortaBoySecim, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aciSosSecim1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buyukBoySecim, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(barbekuSosSecim1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pizzaBoyutu)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(kremaliSosSecim1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(pizzaSosuSecimBaslik1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(domatesSosSecim2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(aciSosSecim2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(barbekuSosSecim2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(kremaliSosSecim2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(hamurSecimBaslik)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(klasikHamurSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inceHamurSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kalinHamurSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(peynirliHamurSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sarimsakliHamurSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tamBugdayliHamurSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(salamSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cheddarSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(misirSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sosisSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tulumSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(zeytinSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pastirmaSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(beyazSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(biberSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tavukSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(keciPeynirSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kupDomatesSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jalapenoSecim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tonbalikSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(peynirUrunu)
                                    .addComponent(etUrunu)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ananasSecim, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ekstraUrun))))))
                    .addComponent(pizzaSosu))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pizzaHamuru))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fiyatGuncelle(){
        int anlikFiyat = 0;
        
        // Boy seçimleri için fiyat güncellemesi
        if (kucukBoySecim.isSelected()) anlikFiyat += kucukBoyFiyat;
        else if (ortaBoySecim.isSelected()) anlikFiyat += ortaBoyFiyat;
        else if (buyukBoySecim.isSelected()) anlikFiyat += buyukBoyFiyat;
        
        // Hamur seçimleri için fiyat güncellemesi
        if (kalinHamurSecim.isSelected()) anlikFiyat += kalinHamurFiyat;
        else if (peynirliHamurSecim.isSelected()) anlikFiyat += peynirDolguluKenarFiyat;
        else if (sarimsakliHamurSecim.isSelected()) anlikFiyat += sarimsakliKenarFiyat;
        else if (tamBugdayliHamurSecim.isSelected()) anlikFiyat += tamBugdayKenarFiyat;
        
        // 2.Sos seçimleri için fiyat güncellemesi
        if (domatesSosSecim2.isSelected()) anlikFiyat += domatesSosFiyat;
        else if (aciSosSecim2.isSelected()) anlikFiyat += aciliDomatesSosFiyat;
        else if (barbekuSosSecim2.isSelected()) anlikFiyat += barbekuSosFiyat;
        else if (kremaliSosSecim2.isSelected()) anlikFiyat += kremaliSosFiyat;
        
        // Et ürünleriğ seçimi için fiyat güncellemesi
        if (salamSecim.isSelected()) anlikFiyat += salamFiyat;
        if (sosisSecim.isSelected()) anlikFiyat += sosisFiyat;
        if (pastirmaSecim.isSelected()) anlikFiyat += pastirmaFiyat;
        if (tavukSecim.isSelected()) anlikFiyat += tavukDilimFiyat;
        if (tonbalikSecim.isSelected()) anlikFiyat += tonBalikFiyat;
        
        // Peynir ürünleri seçimi için fiyat güncellemesi
        if (mozarellaSecim.isSelected()) anlikFiyat += mozarellaFiyat;
        if (cheddarSecim.isSelected()) anlikFiyat += cheddarFiyat;
        if (beyazSecim.isSelected()) anlikFiyat += beyazPeynirFiyat;
        if (tulumSecim.isSelected()) anlikFiyat += tulumPeynirFiyat;
        if (keciPeynirSecim.isSelected()) anlikFiyat += keciPeynirFiyat;
        
        // Ekstra ürünlerin seçimi için fiyat güncellemesi
        if (misirSecim.isSelected()) anlikFiyat += misirFiyat;
        if (mantarSecim.isSelected()) anlikFiyat += mantarFiyat;
        if (zeytinSecim.isSelected()) anlikFiyat += zeytinFiyat;
        if (biberSecim.isSelected()) anlikFiyat += biberFiyat;
        if (kupDomatesSecim.isSelected()) anlikFiyat += kupDomatesFiyat;
        if (jalapenoSecim.isSelected()) anlikFiyat += jalapenoFiyat;
        if (ananasSecim.isSelected()) anlikFiyat += ananasFiyat;
        
        // Her güncellemede pizzamızın maliyetini anlık fiyata eşitliyoruz
        pizzaMaliyeti = anlikFiyat;
        maliyetYazisi.setText("Pizzanın maliyeti: " + pizzaMaliyeti + " TL");
    }
    
    private void kucukBoySecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kucukBoySecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_kucukBoySecimActionPerformed

    private void ortaBoySecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ortaBoySecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_ortaBoySecimActionPerformed

    private void buyukBoySecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyukBoySecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_buyukBoySecimActionPerformed

    private void kalinHamurSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kalinHamurSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_kalinHamurSecimActionPerformed

    private void peynirliHamurSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peynirliHamurSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_peynirliHamurSecimActionPerformed

    private void sarimsakliHamurSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sarimsakliHamurSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_sarimsakliHamurSecimActionPerformed

    private void tamBugdayliHamurSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamBugdayliHamurSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_tamBugdayliHamurSecimActionPerformed

    private void domatesSosSecim2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domatesSosSecim2ActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_domatesSosSecim2ActionPerformed

    private void aciSosSecim2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aciSosSecim2ActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_aciSosSecim2ActionPerformed

    private void barbekuSosSecim2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barbekuSosSecim2ActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_barbekuSosSecim2ActionPerformed

    private void kremaliSosSecim2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kremaliSosSecim2ActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_kremaliSosSecim2ActionPerformed

    private void sucukSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucukSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_sucukSecimActionPerformed

    private void salamSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salamSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_salamSecimActionPerformed

    private void sosisSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sosisSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_sosisSecimActionPerformed

    private void pastirmaSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastirmaSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_pastirmaSecimActionPerformed

    private void tavukSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tavukSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_tavukSecimActionPerformed

    private void tonbalikSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tonbalikSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_tonbalikSecimActionPerformed

    private void mozarellaSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mozarellaSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_mozarellaSecimActionPerformed

    private void cheddarSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheddarSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_cheddarSecimActionPerformed

    private void tulumSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tulumSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_tulumSecimActionPerformed

    private void beyazSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beyazSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_beyazSecimActionPerformed

    private void keciPeynirSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keciPeynirSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_keciPeynirSecimActionPerformed

    private void mantarSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantarSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_mantarSecimActionPerformed

    private void misirSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_misirSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_misirSecimActionPerformed

    private void zeytinSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeytinSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_zeytinSecimActionPerformed

    private void biberSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biberSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_biberSecimActionPerformed

    private void kupDomatesSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kupDomatesSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_kupDomatesSecimActionPerformed

    private void jalapenoSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jalapenoSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_jalapenoSecimActionPerformed

    private void ananasSecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ananasSecimActionPerformed
        fiyatGuncelle();
    }//GEN-LAST:event_ananasSecimActionPerformed

    private void anaSayfaDonButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anaSayfaDonButonuActionPerformed
        int secim = javax.swing.JOptionPane.showConfirmDialog(
        this, 
        "Yaptığınız eklemeler silinecektir. Onaylıyor musunuz?", 
        "Ana Sayfaya Dön", 
        javax.swing.JOptionPane.YES_NO_OPTION,
        javax.swing.JOptionPane.WARNING_MESSAGE
        );

    
        if (secim == javax.swing.JOptionPane.YES_OPTION) {
        
            // Global fiyat değişkenimizi sıfırlıyoruz
            pizzaMaliyeti = 0; 
        
            AnaEkran anaSayfa = new AnaEkran();
        
            anaSayfa.setVisible(true);
        
            this.dispose(); 
        }
    }//GEN-LAST:event_anaSayfaDonButonuActionPerformed

    private void pizzaOlusturButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizzaOlusturButonuActionPerformed

        if (!sucukSecim.isSelected() && !salamSecim.isSelected() && !sosisSecim.isSelected() && !pastirmaSecim.isSelected()
                && !tavukSecim.isSelected() && !tonbalikSecim.isSelected()) {
            javax.swing.JOptionPane.showMessageDialog(this, "En az bir tane et malzemesi olmalı!", "Hata", javax.swing.JOptionPane.WARNING_MESSAGE);
            return; 
        }

        int secim = javax.swing.JOptionPane.showConfirmDialog(
            this, 
            pizzaMaliyeti + " TL tutarındaki pizzayı oluşturmayı onaylıyor musunuz?", 
            "Sipariş Onayı", 
            javax.swing.JOptionPane.YES_NO_OPTION,
            javax.swing.JOptionPane.QUESTION_MESSAGE
        );


        if (secim == javax.swing.JOptionPane.YES_OPTION) {

            // AnaEkran sınıfındaki static odemeTutari değişkenine maliyeti ekliyoruz
            AnaEkran.odemeTutari += pizzaMaliyeti;

            // Sepet metnini hazırlıyoruz
            String sepetMetni = "1x Özel Hazırlanmış Pizza - " + pizzaMaliyeti + " TL";

            // AnaEkran'daki static sepet1 List yapısına bu metni ekliyoruz
            AnaEkran.sepetModeli.addElement(sepetMetni);

            // Kullanıcıyı bilgilendirip bu ekranı kapatıyoruz
            javax.swing.JOptionPane.showMessageDialog(
                this, 
                "Pizzanız başarıyla sepetinize eklendi!", 
                "Sipariş Alındı", 
                javax.swing.JOptionPane.INFORMATION_MESSAGE
            );

            // Ana ekran penceresini yeniden açıyoruz (veya zaten arkada açıksa onu görünür yapıyoruz)
            AnaEkran anaSayfa = new AnaEkran();
            anaSayfa.setVisible(true);

            this.dispose(); // Pizza oluşturma ekranını kapatıyoruz

        } else {
            // Kullanıcı "Hayır" derse hiçbir şey yapma, ekranda kal
            System.out.println("Sipariş kullanıcı tarafından iptal edildi.");
        }
    }//GEN-LAST:event_pizzaOlusturButonuActionPerformed

    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new PizzaOlusturmaEkrani().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton aciSosSecim1;
    private javax.swing.JRadioButton aciSosSecim2;
    private javax.swing.JButton anaSayfaDonButonu;
    private javax.swing.JCheckBox ananasSecim;
    private javax.swing.JRadioButton barbekuSosSecim1;
    private javax.swing.JRadioButton barbekuSosSecim2;
    private javax.swing.JCheckBox beyazSecim;
    private javax.swing.JCheckBox biberSecim;
    private javax.swing.JLabel boyutSecimBaslik;
    private javax.swing.JRadioButton buyukBoySecim;
    private javax.swing.JCheckBox cheddarSecim;
    private javax.swing.JRadioButton domatesSosSecim1;
    private javax.swing.JRadioButton domatesSosSecim2;
    private javax.swing.JLabel ekranAltBaslik;
    private javax.swing.JLabel ekranAnaBaslik;
    private javax.swing.JLabel ekstraSecimBaslik;
    private javax.swing.JLabel ekstraUrun;
    private javax.swing.JLabel etUrunSecimiBaslik;
    private javax.swing.JLabel etUrunu;
    private javax.swing.JLabel hamurSecimBaslik;
    private javax.swing.JRadioButton inceHamurSecim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox jalapenoSecim;
    private javax.swing.JRadioButton kalinHamurSecim;
    private javax.swing.JCheckBox keciPeynirSecim;
    private javax.swing.JRadioButton klasikHamurSecim;
    private javax.swing.JRadioButton kremaliSosSecim1;
    private javax.swing.JRadioButton kremaliSosSecim2;
    private javax.swing.JRadioButton kucukBoySecim;
    private javax.swing.JCheckBox kupDomatesSecim;
    private javax.swing.JLabel maliyetYazisi;
    private javax.swing.JCheckBox mantarSecim;
    private javax.swing.JCheckBox misirSecim;
    private javax.swing.JCheckBox mozarellaSecim;
    private javax.swing.JRadioButton ortaBoySecim;
    private javax.swing.JCheckBox pastirmaSecim;
    private javax.swing.JLabel peynirUrunSecimiBaslik;
    private javax.swing.JLabel peynirUrunu;
    private javax.swing.JRadioButton peynirliHamurSecim;
    private javax.swing.JLabel pizzaBoyutu;
    private javax.swing.JLabel pizzaHamuru;
    private javax.swing.JButton pizzaOlusturButonu;
    private javax.swing.JLabel pizzaSosu;
    private javax.swing.JLabel pizzaSosuSecimBaslik;
    private javax.swing.JLabel pizzaSosuSecimBaslik1;
    private javax.swing.JCheckBox salamSecim;
    private javax.swing.JRadioButton sarimsakliHamurSecim;
    private javax.swing.JCheckBox sosisSecim;
    private javax.swing.JCheckBox sucukSecim;
    private javax.swing.JRadioButton tamBugdayliHamurSecim;
    private javax.swing.JCheckBox tavukSecim;
    private javax.swing.JCheckBox tonbalikSecim;
    private javax.swing.JCheckBox tulumSecim;
    private javax.swing.JCheckBox zeytinSecim;
    // End of variables declaration//GEN-END:variables
}
