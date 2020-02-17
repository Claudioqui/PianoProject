package uf2_p20.PianoPackage; //12

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;
import java.awt.KeyboardFocusManager;
import java.applet.AudioClip;
import javax.swing.JButton;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.sound.sampled.BooleanControl;


public class PianoFrame extends javax.swing.JFrame {
    //declaraciones globales
    JButton jbt [];//definir array
    String[] arrayNotes;
    String letters;
    AudioClip audioclip1;
    int count=0;
    public PianoFrame() {
        initComponents();
        initConfig();
        keyboardlistener();
        setLocationRelativeTo(null);    
      this.setExtendedState(MAXIMIZED_BOTH);
      
        /*tamaño pantalla
        Dimension screen= Toolkit.getDefaultToolkit().getScreenSize();
        int width=screen.width;
        int height=screen.height;
        NotePanel.setLocation(0, (height-NotePanel.getHeight())*80/100);
        NotePanel.setLocation(0, (width-NotePanel.getWidth())*80/100;
        */
    }
private void initConfig() {
        //rename variable   
            jbt= new JButton[]{C1,D1,E1,F1,G1,A1,B1,C2,D2,E2,F2,G2,A2,B2,Csharp1,Dsharp1,Fsharp1,Gsharp1,Asharp1,Csharp2,Dsharp2,Fsharp2,Gsharp2,Asharp2};
            for(int i=0; i<jbt.length; i++){//recorrer elementos array
                jbt[i].setName(i+"");
            arrayNotes =new String[]{"Do","Re", "Mi", "Fa", "Sol", "La", "Si", "Do2", "Re2", "Mi2", "Fa2", "Sol2", "La2", "Si2","DoSharp","ReSharp","FaSharp","SolSharp","LaSharp","DoSharp2","ReSharp2","FaSharp2","SolSharp2","LaSharp2" };
            letters="asdfghjzxcvbnmqwertyuiop";
            }
    }


private void keyboardlistener() {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new
        KeyEventDispatcher() {
        @Override
    public boolean dispatchKeyEvent(final KeyEvent e) {
        synchronized (PianoFrame.class) {
            readKeyBoard(e);
        return false;
                }
            }
        });
    } //fin de listener

    public void readKeyBoard(KeyEvent event) {//gestión de la Tecla apretada:
  char letter = event.getKeyChar();
        count++;
        if(count==3){
             count=0;
            int num= letters.indexOf(letter);
            sound(arrayNotes[num]);      
        }             
    }
            /*int key = event.getKeyChar();
            if (event.getKeyChar()==KeyEvent.KEY_TYPED)        
            JOptionPane.showMessageDialog(this,C1); */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Blab = new javax.swing.JLabel();
        Clab1 = new javax.swing.JLabel();
        Clab = new javax.swing.JLabel();
        Dlab = new javax.swing.JLabel();
        Elab = new javax.swing.JLabel();
        Flab = new javax.swing.JLabel();
        Glab = new javax.swing.JLabel();
        Alab = new javax.swing.JLabel();
        Gsharplab = new javax.swing.JLabel();
        Dlab1 = new javax.swing.JLabel();
        Elab1 = new javax.swing.JLabel();
        Flab1 = new javax.swing.JLabel();
        Glab1 = new javax.swing.JLabel();
        Alab1 = new javax.swing.JLabel();
        Blab1 = new javax.swing.JLabel();
        Csharplab4 = new javax.swing.JLabel();
        Fsharplab = new javax.swing.JLabel();
        Dsharplab1 = new javax.swing.JLabel();
        Fsharplab1 = new javax.swing.JLabel();
        Asharplab1 = new javax.swing.JLabel();
        Gsharplab2 = new javax.swing.JLabel();
        Asharplab2 = new javax.swing.JLabel();
        Dsharplab2 = new javax.swing.JLabel();
        Csharplab1 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Csharp2 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        Dsharp2 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        Fsharp2 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        Gsharp2 = new javax.swing.JButton();
        G2 = new javax.swing.JButton();
        Asharp2 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        NotePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Csharp1 = new javax.swing.JButton();
        daftL = new javax.swing.JLabel();
        Dsharp1 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        Panelsound = new javax.swing.JPanel();
        highV = new javax.swing.JButton();
        lowV = new javax.swing.JButton();
        mute = new javax.swing.JButton();
        library = new javax.swing.JButton();
        foward = new javax.swing.JButton();
        play = new javax.swing.JButton();
        back = new javax.swing.JButton();
        pause = new javax.swing.JButton();
        hold = new javax.swing.JButton();
        rec = new javax.swing.JButton();
        off = new javax.swing.JButton();
        Instrubox = new javax.swing.JComboBox<>();
        InstruLab = new javax.swing.JLabel();
        About = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        daftR = new javax.swing.JLabel();
        Fsharp1 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        Gsharp1 = new javax.swing.JButton();
        G1 = new javax.swing.JButton();
        Asharp1 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(0, 0, 0));
        Background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 6, true));
        Background.setLayout(null);

        Blab.setBackground(new java.awt.Color(255, 51, 51));
        Blab.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Blab.setForeground(new java.awt.Color(255, 0, 0));
        Blab.setText("B");
        Background.add(Blab);
        Blab.setBounds(590, 640, 24, 29);

        Clab1.setBackground(new java.awt.Color(255, 51, 51));
        Clab1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Clab1.setForeground(new java.awt.Color(255, 204, 51));
        Clab1.setText("C");
        Background.add(Clab1);
        Clab1.setBounds(650, 640, 24, 29);

        Clab.setBackground(new java.awt.Color(255, 51, 51));
        Clab.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Clab.setForeground(new java.awt.Color(255, 0, 0));
        Clab.setText("C");
        Background.add(Clab);
        Clab.setBounds(230, 640, 24, 29);

        Dlab.setBackground(new java.awt.Color(255, 51, 51));
        Dlab.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Dlab.setForeground(new java.awt.Color(255, 0, 0));
        Dlab.setText("D");
        Background.add(Dlab);
        Dlab.setBounds(290, 640, 24, 29);

        Elab.setBackground(new java.awt.Color(255, 51, 51));
        Elab.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Elab.setForeground(new java.awt.Color(255, 0, 0));
        Elab.setText("E");
        Background.add(Elab);
        Elab.setBounds(350, 640, 24, 29);

        Flab.setBackground(new java.awt.Color(255, 51, 51));
        Flab.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Flab.setForeground(new java.awt.Color(255, 0, 0));
        Flab.setText("F");
        Background.add(Flab);
        Flab.setBounds(410, 640, 24, 29);

        Glab.setBackground(new java.awt.Color(255, 51, 51));
        Glab.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Glab.setForeground(new java.awt.Color(255, 0, 0));
        Glab.setText("G");
        Background.add(Glab);
        Glab.setBounds(470, 640, 24, 29);

        Alab.setBackground(new java.awt.Color(255, 51, 51));
        Alab.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Alab.setForeground(new java.awt.Color(255, 0, 0));
        Alab.setText("A");
        Background.add(Alab);
        Alab.setBounds(530, 640, 24, 29);

        Gsharplab.setBackground(new java.awt.Color(255, 51, 51));
        Gsharplab.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Gsharplab.setForeground(new java.awt.Color(255, 204, 102));
        Gsharplab.setText("G#");
        Background.add(Gsharplab);
        Gsharplab.setBounds(920, 540, 30, 30);

        Dlab1.setBackground(new java.awt.Color(255, 51, 51));
        Dlab1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Dlab1.setForeground(new java.awt.Color(255, 204, 51));
        Dlab1.setText("D");
        Background.add(Dlab1);
        Dlab1.setBounds(710, 640, 24, 29);

        Elab1.setBackground(new java.awt.Color(255, 51, 51));
        Elab1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Elab1.setForeground(new java.awt.Color(255, 204, 51));
        Elab1.setText("E");
        Background.add(Elab1);
        Elab1.setBounds(770, 640, 24, 29);

        Flab1.setBackground(new java.awt.Color(255, 51, 51));
        Flab1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Flab1.setForeground(new java.awt.Color(255, 204, 51));
        Flab1.setText("F");
        Background.add(Flab1);
        Flab1.setBounds(830, 640, 24, 29);

        Glab1.setBackground(new java.awt.Color(255, 51, 51));
        Glab1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Glab1.setForeground(new java.awt.Color(255, 204, 51));
        Glab1.setText("G");
        Background.add(Glab1);
        Glab1.setBounds(890, 640, 24, 29);

        Alab1.setBackground(new java.awt.Color(255, 51, 51));
        Alab1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Alab1.setForeground(new java.awt.Color(255, 204, 51));
        Alab1.setText("A");
        Background.add(Alab1);
        Alab1.setBounds(950, 640, 24, 29);

        Blab1.setBackground(new java.awt.Color(255, 51, 51));
        Blab1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Blab1.setForeground(new java.awt.Color(255, 204, 51));
        Blab1.setText("B");
        Background.add(Blab1);
        Blab1.setBounds(1010, 640, 24, 29);

        Csharplab4.setBackground(new java.awt.Color(255, 51, 51));
        Csharplab4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Csharplab4.setForeground(new java.awt.Color(255, 0, 0));
        Csharplab4.setText("C#");
        Background.add(Csharplab4);
        Csharplab4.setBounds(250, 540, 30, 30);

        Fsharplab.setBackground(new java.awt.Color(255, 51, 51));
        Fsharplab.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Fsharplab.setForeground(new java.awt.Color(255, 0, 0));
        Fsharplab.setText("F#");
        Background.add(Fsharplab);
        Fsharplab.setBounds(430, 540, 30, 30);

        Dsharplab1.setBackground(new java.awt.Color(255, 51, 51));
        Dsharplab1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Dsharplab1.setForeground(new java.awt.Color(255, 204, 51));
        Dsharplab1.setText("D#");
        Background.add(Dsharplab1);
        Dsharplab1.setBounds(740, 540, 30, 30);

        Fsharplab1.setBackground(new java.awt.Color(255, 51, 51));
        Fsharplab1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Fsharplab1.setForeground(new java.awt.Color(255, 204, 51));
        Fsharplab1.setText("F#");
        Background.add(Fsharplab1);
        Fsharplab1.setBounds(850, 540, 30, 30);

        Asharplab1.setBackground(new java.awt.Color(255, 51, 51));
        Asharplab1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Asharplab1.setForeground(new java.awt.Color(255, 0, 0));
        Asharplab1.setText("A#");
        Background.add(Asharplab1);
        Asharplab1.setBounds(560, 540, 30, 30);

        Gsharplab2.setBackground(new java.awt.Color(255, 51, 51));
        Gsharplab2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Gsharplab2.setForeground(new java.awt.Color(255, 0, 0));
        Gsharplab2.setText("G#");
        Background.add(Gsharplab2);
        Gsharplab2.setBounds(500, 540, 30, 30);

        Asharplab2.setBackground(new java.awt.Color(255, 51, 51));
        Asharplab2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Asharplab2.setForeground(new java.awt.Color(255, 204, 102));
        Asharplab2.setText("A#");
        Background.add(Asharplab2);
        Asharplab2.setBounds(980, 540, 30, 30);

        Dsharplab2.setBackground(new java.awt.Color(255, 51, 51));
        Dsharplab2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Dsharplab2.setForeground(new java.awt.Color(255, 0, 0));
        Dsharplab2.setText("D#");
        Background.add(Dsharplab2);
        Dsharplab2.setBounds(320, 540, 30, 30);

        Csharplab1.setBackground(new java.awt.Color(255, 51, 51));
        Csharplab1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Csharplab1.setForeground(new java.awt.Color(255, 204, 51));
        Csharplab1.setText("C#");
        Background.add(Csharplab1);
        Csharplab1.setBounds(670, 540, 30, 30);

        Title.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Virtual Piano");
        Background.add(Title);
        Title.setBounds(500, 10, 340, 60);

        Csharp2.setBackground(new java.awt.Color(51, 51, 51));
        Csharp2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Csharp2.setForeground(new java.awt.Color(255, 255, 255));
        Csharp2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Csharp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(Csharp2);
        Csharp2.setBounds(660, 450, 50, 120);

        C2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        C2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(C2);
        C2.setBounds(630, 450, 60, 220);

        Dsharp2.setBackground(new java.awt.Color(51, 51, 51));
        Dsharp2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Dsharp2.setForeground(new java.awt.Color(255, 255, 255));
        Dsharp2.setToolTipText("");
        Dsharp2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Dsharp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(Dsharp2);
        Dsharp2.setBounds(730, 450, 50, 120);

        D2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        D2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(D2);
        D2.setBounds(690, 450, 60, 220);

        E2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        E2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(E2);
        E2.setBounds(750, 450, 60, 220);

        Fsharp2.setBackground(new java.awt.Color(51, 51, 51));
        Fsharp2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Fsharp2.setForeground(new java.awt.Color(255, 255, 255));
        Fsharp2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Fsharp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(Fsharp2);
        Fsharp2.setBounds(840, 450, 50, 120);

        F2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        F2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(F2);
        F2.setBounds(810, 450, 60, 220);

        Gsharp2.setBackground(new java.awt.Color(51, 51, 51));
        Gsharp2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Gsharp2.setForeground(new java.awt.Color(255, 255, 255));
        Gsharp2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Gsharp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(Gsharp2);
        Gsharp2.setBounds(910, 450, 50, 120);

        G2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        G2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(G2);
        G2.setBounds(870, 450, 60, 220);

        Asharp2.setBackground(new java.awt.Color(51, 51, 51));
        Asharp2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Asharp2.setForeground(new java.awt.Color(255, 255, 255));
        Asharp2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Asharp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(Asharp2);
        Asharp2.setBounds(970, 450, 50, 120);

        A2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        A2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(A2);
        A2.setBounds(930, 450, 60, 220);

        B2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        B2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(B2);
        B2.setBounds(990, 450, 60, 220);

        NotePanel.setBackground(new java.awt.Color(255, 204, 102));
        NotePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        NotePanel.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Netbeans\\UF2_P20\\Images\\pentagrama (1).png")); // NOI18N
        NotePanel.add(jLabel2);
        jLabel2.setBounds(-30, 10, 96, 128);

        Background.add(NotePanel);
        NotePanel.setBounds(400, 70, 520, 220);

        Csharp1.setBackground(new java.awt.Color(51, 51, 51));
        Csharp1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Csharp1.setForeground(new java.awt.Color(255, 255, 255));
        Csharp1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Csharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(Csharp1);
        Csharp1.setBounds(240, 450, 50, 120);

        daftL.setIcon(new javax.swing.ImageIcon("E:\\Netbeans\\UF2_P20\\Images\\LIdO.gif")); // NOI18N
        Background.add(daftL);
        daftL.setBounds(-80, 40, 400, 370);

        Dsharp1.setBackground(new java.awt.Color(51, 51, 51));
        Dsharp1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Dsharp1.setForeground(new java.awt.Color(255, 255, 255));
        Dsharp1.setToolTipText("");
        Dsharp1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Dsharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(Dsharp1);
        Dsharp1.setBounds(310, 450, 50, 120);

        C1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        C1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(C1);
        C1.setBounds(210, 450, 60, 220);

        Panelsound.setBackground(new java.awt.Color(153, 153, 153));
        Panelsound.setLayout(null);

        highV.setIcon(new javax.swing.ImageIcon("E:\\Netbeans\\UF2_P20\\Images\\altavoz (1).png")); // NOI18N
        Panelsound.add(highV);
        highV.setBounds(470, 80, 50, 40);

        lowV.setIcon(new javax.swing.ImageIcon("E:\\Netbeans\\UF2_P20\\Images\\bajavoz.png")); // NOI18N
        Panelsound.add(lowV);
        lowV.setBounds(470, 40, 50, 40);

        mute.setIcon(new javax.swing.ImageIcon("E:\\Netbeans\\UF2_P20\\Images\\silenciar.png")); // NOI18N
        mute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muteActionPerformed(evt);
            }
        });
        Panelsound.add(mute);
        mute.setBounds(470, 0, 50, 40);

        library.setIcon(new javax.swing.ImageIcon("E:\\Netbeans\\UF2_P20\\Images\\musica-y-multimedia.png")); // NOI18N
        library.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libraryActionPerformed(evt);
            }
        });
        Panelsound.add(library);
        library.setBounds(420, 0, 50, 40);

        foward.setIcon(new javax.swing.ImageIcon("E:\\Netbeans\\UF2_P20\\Images\\opcion-multimedia.png")); // NOI18N
        Panelsound.add(foward);
        foward.setBounds(350, 0, 70, 40);

        play.setIcon(new javax.swing.ImageIcon("E:\\Netbeans\\UF2_P20\\Images\\boton-de-play (1).png")); // NOI18N
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        Panelsound.add(play);
        play.setBounds(280, 0, 70, 40);

        back.setIcon(new javax.swing.ImageIcon("E:\\Netbeans\\UF2_P20\\Images\\hacia-atras.png")); // NOI18N
        Panelsound.add(back);
        back.setBounds(140, 0, 70, 40);

        pause.setIcon(new javax.swing.ImageIcon("E:\\Netbeans\\UF2_P20\\Images\\pausa.png")); // NOI18N
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });
        Panelsound.add(pause);
        pause.setBounds(210, 0, 70, 40);

        hold.setIcon(new javax.swing.ImageIcon("E:\\Netbeans\\UF2_P20\\Images\\boton-detener.png")); // NOI18N
        Panelsound.add(hold);
        hold.setBounds(70, 0, 70, 40);

        rec.setIcon(new javax.swing.ImageIcon("E:\\Netbeans\\UF2_P20\\Images\\rec.png")); // NOI18N
        Panelsound.add(rec);
        rec.setBounds(0, 0, 70, 40);

        off.setIcon(new javax.swing.ImageIcon("E:\\Netbeans\\UF2_P20\\Images\\poder.png")); // NOI18N
        off.setBorder(null);
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });
        Panelsound.add(off);
        off.setBounds(20, 50, 60, 50);

        Instrubox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Piano", "Electric", "Organ" }));
        Panelsound.add(Instrubox);
        Instrubox.setBounds(160, 70, 80, 20);

        InstruLab.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        InstruLab.setText("Instrumento:");
        Panelsound.add(InstruLab);
        InstruLab.setBounds(90, 70, 70, 20);

        About.setText("About...");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        Panelsound.add(About);
        About.setBounds(360, 90, 80, 23);

        Background.add(Panelsound);
        Panelsound.setBounds(400, 290, 520, 120);

        D1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        D1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(D1);
        D1.setBounds(270, 450, 60, 220);

        E1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        E1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(E1);
        E1.setBounds(330, 450, 60, 220);

        daftR.setIcon(new javax.swing.ImageIcon("E:\\Netbeans\\UF2_P20\\Images\\SwhF.gif")); // NOI18N
        Background.add(daftR);
        daftR.setBounds(920, 50, 410, 350);

        Fsharp1.setBackground(new java.awt.Color(51, 51, 51));
        Fsharp1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Fsharp1.setForeground(new java.awt.Color(255, 255, 255));
        Fsharp1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Fsharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(Fsharp1);
        Fsharp1.setBounds(420, 450, 50, 120);

        F1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        F1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(F1);
        F1.setBounds(390, 450, 60, 220);

        Gsharp1.setBackground(new java.awt.Color(51, 51, 51));
        Gsharp1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Gsharp1.setForeground(new java.awt.Color(255, 255, 255));
        Gsharp1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Gsharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(Gsharp1);
        Gsharp1.setBounds(490, 450, 50, 120);

        G1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        G1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(G1);
        G1.setBounds(450, 450, 60, 220);

        Asharp1.setBackground(new java.awt.Color(51, 51, 51));
        Asharp1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Asharp1.setForeground(new java.awt.Color(255, 255, 255));
        Asharp1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Asharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(Asharp1);
        Asharp1.setBounds(550, 450, 50, 120);

        A1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        A1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(A1);
        A1.setBounds(510, 450, 60, 220);

        B1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        B1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        Background.add(B1);
        B1.setBounds(570, 450, 60, 220);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 894, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        Background.add(jPanel1);
        jPanel1.setBounds(190, 430, 900, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 1369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
        System.exit(0);
    }//GEN-LAST:event_offActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        AboutPresonal v= new AboutPresonal();
        v.setVisible(true);
    }//GEN-LAST:event_AboutActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
 //codigo de los buttons
       JButton jbt= (JButton)evt.getSource();
       System.out.println(jbt.getName());
      //JOptionPane.showMessageDialog ( null,jbt.getName(), "Numeros", JOptionPane.INFORMATION_MESSAGE);  
             
//detectar la nota
              int numberKey = Integer.parseInt(jbt.getName());
            sound(arrayNotes[numberKey]);                           
    }//GEN-LAST:event_C1ActionPerformed

    private void libraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libraryActionPerformed
        MusicLibrary v= new MusicLibrary();
        v.setVisible(true);
    }//GEN-LAST:event_libraryActionPerformed


    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        String sbase = "/uf2_p20/Around the world - daft punk.wav";
        audioclip1 = java.applet.Applet.newAudioClip(getClass().getResource(sbase));
        audioclip1.play();
    }//GEN-LAST:event_playActionPerformed

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
       audioclip1.stop();
    }//GEN-LAST:event_pauseActionPerformed

    private void muteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muteActionPerformed
        BooleanControl.Type MUTE = BooleanControl.Type.MUTE;
    }//GEN-LAST:event_muteActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PianoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PianoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PianoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PianoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PianoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton About;
    private javax.swing.JLabel Alab;
    private javax.swing.JLabel Alab1;
    private javax.swing.JButton Asharp1;
    private javax.swing.JButton Asharp2;
    private javax.swing.JLabel Asharplab1;
    private javax.swing.JLabel Asharplab2;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Blab;
    private javax.swing.JLabel Blab1;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JLabel Clab;
    private javax.swing.JLabel Clab1;
    private javax.swing.JButton Csharp1;
    private javax.swing.JButton Csharp2;
    private javax.swing.JLabel Csharplab1;
    private javax.swing.JLabel Csharplab4;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JLabel Dlab;
    private javax.swing.JLabel Dlab1;
    private javax.swing.JButton Dsharp1;
    private javax.swing.JButton Dsharp2;
    private javax.swing.JLabel Dsharplab1;
    private javax.swing.JLabel Dsharplab2;
    private javax.swing.JButton E1;
    private javax.swing.JButton E2;
    private javax.swing.JLabel Elab;
    private javax.swing.JLabel Elab1;
    private javax.swing.JButton F1;
    private javax.swing.JButton F2;
    private javax.swing.JLabel Flab;
    private javax.swing.JLabel Flab1;
    private javax.swing.JButton Fsharp1;
    private javax.swing.JButton Fsharp2;
    private javax.swing.JLabel Fsharplab;
    private javax.swing.JLabel Fsharplab1;
    private javax.swing.JButton G1;
    private javax.swing.JButton G2;
    private javax.swing.JLabel Glab;
    private javax.swing.JLabel Glab1;
    private javax.swing.JButton Gsharp1;
    private javax.swing.JButton Gsharp2;
    private javax.swing.JLabel Gsharplab;
    private javax.swing.JLabel Gsharplab2;
    private javax.swing.JLabel InstruLab;
    private javax.swing.JComboBox<String> Instrubox;
    private javax.swing.JPanel NotePanel;
    private javax.swing.JPanel Panelsound;
    private javax.swing.JLabel Title;
    private javax.swing.JButton back;
    private javax.swing.JLabel daftL;
    private javax.swing.JLabel daftR;
    private javax.swing.JButton foward;
    private javax.swing.JButton highV;
    private javax.swing.JButton hold;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton library;
    private javax.swing.JButton lowV;
    private javax.swing.JButton mute;
    private javax.swing.JButton off;
    private javax.swing.JButton pause;
    private javax.swing.JButton play;
    private javax.swing.JButton rec;
    // End of variables declaration//GEN-END:variables

//sonido 
private void sound(String nota) {
 String sNota = "/notas/" + nota + ".wav";
 AudioClip audioClip;
 audioClip = java.applet.Applet.newAudioClip(getClass().getResource(sNota));
 audioClip.play();
 //System.out.println(sNota);
    }
    private void sound2(String nota) throws MalformedURLException {
        String path = System.getProperty("user.dir");
        path += "\\src\\notas\\" + nota + ".wav";
            File file = new File(path);//adecuate the route
            URL url = file.toURL();
        AudioClip audioClip;
        audioClip = java.applet.Applet.newAudioClip(url);
        audioClip.play();
    }
}