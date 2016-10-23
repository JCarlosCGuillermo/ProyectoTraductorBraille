package TraductorBraille;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

//librerias paracrar archivo HTML
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//librerias para crear archivo pdf 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.ImageIcon;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.JOptionPane;

public class FormularioTraductorBraille extends javax.swing.JFrame {

    String[] guardarCadena = new String[1000];
    int posicionImagenJlabel = 0;
    String palabraCadena="";

    public FormularioTraductorBraille() {
        super(" iBraille  Version 2.0 ");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        botonGrupoTraductor = new javax.swing.ButtonGroup();
        txtParrafo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        letra10 = new javax.swing.JLabel();
        letra12 = new javax.swing.JLabel();
        letra14 = new javax.swing.JLabel();
        letra16 = new javax.swing.JLabel();
        letra18 = new javax.swing.JLabel();
        letra20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLetraBraille1 = new javax.swing.JLabel();
        jRadioBotonHTML = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioBotonPDF = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel11.setText("jLabel11");

        jLabel17.setText("jLabel17");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtParrafo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtParrafoKeyReleased(evt);
            }
        });

        jButton1.setText("Borrar Todo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingresa La Frase A Traducir:");

        botonGrupoTraductor.add(jRadioBotonHTML);
        jRadioBotonHTML.setText("Mostrar HTML");
        jRadioBotonHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBotonHTMLActionPerformed(evt);
            }
        });

        jLabel3.setText("Elige Un Formato De Salida Para La");

        botonGrupoTraductor.add(jRadioBotonPDF);
        jRadioBotonPDF.setText("Mostrar PDF");
        jRadioBotonPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBotonPDFActionPerformed(evt);
            }
        });

        jLabel5.setText("Traduccion De La Frase:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(letra20)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(letra12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLetraBraille1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(letra14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioBotonHTML)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(letra16, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(letra18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(119, 119, 119)
                                                .addComponent(letra10))
                                            .addComponent(jRadioBotonPDF)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel3)))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtParrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(letra10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(letra20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioBotonHTML)
                                .addGap(21, 21, 21)
                                .addComponent(jRadioBotonPDF))
                            .addComponent(jLetraBraille1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(letra14)
                            .addComponent(letra16)
                            .addComponent(letra18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letra12)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtParrafoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParrafoKeyReleased
        if (txtParrafo.getText().isEmpty()) {
        } else {
            if (guardarCadena.length - 1 == posicionImagenJlabel) {
                JOptionPane.showMessageDialog(null, "Se Excedio El Numero De Caracteres");
            } else {
                posicionImagenJlabel++;
                guardarCadena[posicionImagenJlabel] = txtParrafo.getText().substring(txtParrafo.getText().length() - 1);
            }
/**            if (txtParrafo.getText().endsWith(" ")) { posicionImagenJlabel++; }
            if (txtParrafo.getText().endsWith("A") || txtParrafo.getText().endsWith("a")) { imagenBraille("A", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("B") || txtParrafo.getText().endsWith("b")) { imagenBraille("B", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("C") || txtParrafo.getText().endsWith("c")) { imagenBraille("C", posicionImagenJlabel++); }              
            if (txtParrafo.getText().endsWith("D") || txtParrafo.getText().endsWith("d")) { imagenBraille("D", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("E") || txtParrafo.getText().endsWith("e")) { imagenBraille("E", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("F") || txtParrafo.getText().endsWith("f")) { imagenBraille("F", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("G") || txtParrafo.getText().endsWith("g")) { imagenBraille("G", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("H") || txtParrafo.getText().endsWith("h")) { imagenBraille("H", posicionImagenJlabel++); }               
            if (txtParrafo.getText().endsWith("I") || txtParrafo.getText().endsWith("i")) { imagenBraille("I", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("J") || txtParrafo.getText().endsWith("j")) { imagenBraille("J", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("K") || txtParrafo.getText().endsWith("k")) { imagenBraille("K", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("L") || txtParrafo.getText().endsWith("l")) { imagenBraille("L", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("M") || txtParrafo.getText().endsWith("m")) { imagenBraille("M", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("N") || txtParrafo.getText().endsWith("n")) { imagenBraille("N", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("O") || txtParrafo.getText().endsWith("o")) { imagenBraille("O", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("P") || txtParrafo.getText().endsWith("p")) { imagenBraille("P", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("Q") || txtParrafo.getText().endsWith("q")) { imagenBraille("Q", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("R") || txtParrafo.getText().endsWith("r")) { imagenBraille("R", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("S") || txtParrafo.getText().endsWith("s")) { imagenBraille("S", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("T") || txtParrafo.getText().endsWith("t")) { imagenBraille("T", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("U") || txtParrafo.getText().endsWith("u")) { imagenBraille("U", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("V") || txtParrafo.getText().endsWith("v")) { imagenBraille("V", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("W") || txtParrafo.getText().endsWith("w")) { imagenBraille("W", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("X") || txtParrafo.getText().endsWith("x")) { imagenBraille("X", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("Y") || txtParrafo.getText().endsWith("y")) { imagenBraille("Y", posicionImagenJlabel++); }
            if (txtParrafo.getText().endsWith("Z") || txtParrafo.getText().endsWith("z")) { imagenBraille("Z", posicionImagenJlabel++); }
            System.out.println(txtParrafo.getText().substring(txtParrafo.getText().length() - 1));**/
        }
    }//GEN-LAST:event_txtParrafoKeyReleased
    
    public void imagenBraille(String letraBraille, int posicionImagenJlabel){
        ImageIcon img = new ImageIcon("src/img/letra" + letraBraille + ".jpg");
        jLetraBraille1.setIcon(new ImageIcon(img.getImage().getScaledInstance(jLetraBraille1.getWidth(), jLetraBraille1.getHeight(), java.awt.Image.SCALE_SMOOTH))); 
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtParrafo.setText("");
        posicionImagenJlabel = 0;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioBotonHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBotonHTMLActionPerformed
        try {
            //se crea el archivo 
            FileWriter w = new FileWriter("ArchivoHTML.html");
            try (BufferedWriter bw = new BufferedWriter(w); PrintWriter escribeHTML = new PrintWriter(bw)) {
                escribeHTML.append("<HTML>" + "<HEAD>"+ "<TITLE>Traductor a Braille</TITLE>" + "</HEAD>" + "<BODY>");
                escribeHTML.append("<DIV ALIGN=center><H1>TEXTO INGRESADO PARA TRADUCIR</H1></DIV>");
                escribeHTML.append("<DIV ALIGN=center><H2>" + palabraCadena + "</H2></DIV>");
                escribeHTML.append("<DIV ALIGN=center><H1>TEXTO TRADUCIDO A LENGUAJE BRAILLE</H1></DIV>");
                for (int i = 1; i < guardarCadena.length; i++) {
                    if (guardarCadena[i] == null) {
                        break;
                    } else {
                        palabraCadena += guardarCadena[i];
                        if (guardarCadena[i].equals(" ")) { escribeHTML.println("<img src=\"src/img/espace.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("a") || guardarCadena[i].equals("A")) { escribeHTML.println("<img src=\"src/img/letraA.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("b") || guardarCadena[i].equals("B")) { escribeHTML.println("<img src=\"src/img/letraB.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("c") || guardarCadena[i].equals("C")) { escribeHTML.println("<img src=\"src/img/letraC.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("d") || guardarCadena[i].equals("D")) { escribeHTML.println("<img src=\"src/img/letraD.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("e") || guardarCadena[i].equals("E")) { escribeHTML.println("<img src=\"src/img/letraE.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("f") || guardarCadena[i].equals("F")) { escribeHTML.println("<img src=\"src/img/letraF.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("g") || guardarCadena[i].equals("G")) { escribeHTML.println("<img src=\"src/img/letraG.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("h") || guardarCadena[i].equals("H")) { escribeHTML.println("<img src=\"src/img/letraH.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("i") || guardarCadena[i].equals("I")) { escribeHTML.println("<img src=\"src/img/letraI.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("j") || guardarCadena[i].equals("J")) { escribeHTML.println("<img src=\"src/img/letraJ.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("k") || guardarCadena[i].equals("K")) { escribeHTML.println("<img src=\"src/img/letraK.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("l") || guardarCadena[i].equals("L")) { escribeHTML.println("<img src=\"src/img/letraL.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("m") || guardarCadena[i].equals("M")) { escribeHTML.println("<img src=\"src/img/letraM.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("n") || guardarCadena[i].equals("N")) { escribeHTML.println("<img src=\"src/img/letraN.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("o") || guardarCadena[i].equals("O")) { escribeHTML.println("<img src=\"src/img/letraO.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("p") || guardarCadena[i].equals("P")) { escribeHTML.println("<img src=\"src/img/letraP.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("q") || guardarCadena[i].equals("Q")) { escribeHTML.println("<img src=\"src/img/letraQ.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("r") || guardarCadena[i].equals("R")) { escribeHTML.println("<img src=\"src/img/letraR.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("s") || guardarCadena[i].equals("S")) { escribeHTML.println("<img src=\"src/img/letraS.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("t") || guardarCadena[i].equals("T")) { escribeHTML.println("<img src=\"src/img/letraT.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("u") || guardarCadena[i].equals("U")) { escribeHTML.println("<img src=\"src/img/letraU.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("v") || guardarCadena[i].equals("V")) { escribeHTML.println("<img src=\"src/img/letraV.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("w") || guardarCadena[i].equals("W")) { escribeHTML.println("<img src=\"src/img/letraW.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("x") || guardarCadena[i].equals("X")) { escribeHTML.println("<img src=\"src/img/letraX.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("y") || guardarCadena[i].equals("Y")) { escribeHTML.println("<img src=\"src/img/letraY.jpg\" width=\"100\" height=\"150\">"); }
                        if (guardarCadena[i].equals("z") || guardarCadena[i].equals("Z")) { escribeHTML.println("<img src=\"src/img/letraZ.jpg\" width=\"100\" height=\"150\">"); }
                    }
                }
                escribeHTML.append("</BODY>" + "</HTML>");
                ITraductorBraille codigoBraille = new Traductor(palabraCadena);
                codigoBraille.imprimirTraducir();
            } catch (IOException e) {
                System.out.println(e);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea Abrir Archivo HTML?", "Aviso", JOptionPane.YES_NO_OPTION);    
        if (respuesta == YES_NO_OPTION) {
            try {
                File path = new File("ArchivoHTML.html");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }        
    }//GEN-LAST:event_jRadioBotonHTMLActionPerformed

    private void jRadioBotonPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBotonPDFActionPerformed
        try {
            // Obtenemos una instancia de un objeto PDFWriter   
            FileOutputStream archivo = new FileOutputStream("DocumentoPDF.pdf");
            Document documento = new Document();
            PdfWriter.getInstance(documento,archivo);
            documento.open();
            Paragraph parrafo;
    
            parrafo = new Paragraph("Parrafo A Traducir:\n\n"+palabraCadena+"\n\nTraduccion A Lenguaje Braille:\n\n");
            parrafo.setAlignment(Element.ALIGN_CENTER);
            documento.add(parrafo);

            for (int i = 1; i < guardarCadena.length; i++) {
                if (guardarCadena[i] == null) {
                    break;
                } else {
                    palabraCadena += guardarCadena[i];
                    if (guardarCadena[i].equals(" ")) { 
                        Image espace = Image.getInstance("src/img/espace.jpg"); 
                        espace.scaleAbsoluteWidth(40f); //ancho
                        espace.scaleAbsoluteHeight(60f);//alto
                            //Agregamos la imagen al documento.
                        documento.add(espace);
                    }
                    if (guardarCadena[i].equals("a") || guardarCadena[i].equals("A")) { 
                        Image imagenA = Image.getInstance("src/img/letraA.jpg"); 
                        imagenA.scaleAbsoluteWidth(40f); //ancho
                        imagenA.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenA);
                    }
                    if (guardarCadena[i].equals("b") || guardarCadena[i].equals("B")) { 
                        Image imagenB = Image.getInstance("src/img/letraB.jpg"); 
                        imagenB.scaleAbsoluteWidth(40f); //ancho
                        imagenB.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenB);
                    }
                    if (guardarCadena[i].equals("c") || guardarCadena[i].equals("C")) {  
                        Image imagenC = Image.getInstance("src/img/letraC.jpg"); 
                        imagenC.scaleAbsoluteWidth(40f); //ancho
                        imagenC.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenC);
                    }
                    if (guardarCadena[i].equals("d") || guardarCadena[i].equals("D")) {  
                        Image imagenD = Image.getInstance("src/img/letraD.jpg"); 
                        imagenD.scaleAbsoluteWidth(40f); //ancho
                        imagenD.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenD);
                    }
                    if (guardarCadena[i].equals("e") || guardarCadena[i].equals("E")) {  
                        Image imagenE = Image.getInstance("src/img/letraE.jpg"); 
                        imagenE.scaleAbsoluteWidth(40f); //ancho
                        imagenE.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenE);
                    }
                    if (guardarCadena[i].equals("f") || guardarCadena[i].equals("F")) {  
                        Image imagenF = Image.getInstance("src/img/letraF.jpg"); 
                        imagenF.scaleAbsoluteWidth(40f); //ancho
                        imagenF.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenF);
                    }
                    if (guardarCadena[i].equals("g") || guardarCadena[i].equals("G")) {  
                        Image imagenG = Image.getInstance("src/img/letraG.jpg"); 
                        imagenG.scaleAbsoluteWidth(40f); //ancho
                        imagenG.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenG);
                    }
                    if (guardarCadena[i].equals("h") || guardarCadena[i].equals("H")) {  
                        Image imagenH = Image.getInstance("src/img/letraH.jpg"); 
                        imagenH.scaleAbsoluteWidth(40f); //ancho
                        imagenH.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenH);
                    }
                    if (guardarCadena[i].equals("i") || guardarCadena[i].equals("I")) {  
                        Image imagenI = Image.getInstance("src/img/letraI.jpg"); 
                        imagenI.scaleAbsoluteWidth(40f); //ancho
                        imagenI.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenI);
                    }
                    if (guardarCadena[i].equals("j") || guardarCadena[i].equals("J")) {  
                        Image imagenJ = Image.getInstance("src/img/letraJ.jpg"); 
                        imagenJ.scaleAbsoluteWidth(40f); //ancho
                        imagenJ.scaleAbsoluteHeight(60f);//alto
                        //Agreamos la imagen al documento.
                        documento.add(imagenJ);
                    }
                    if (guardarCadena[i].equals("k") || guardarCadena[i].equals("K")) {  
                        Image imagenK = Image.getInstance("src/img/letraK.jpg"); 
                        imagenK.scaleAbsoluteWidth(40f); //ancho
                        imagenK.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenK);
                    }
                    if (guardarCadena[i].equals("l") || guardarCadena[i].equals("L")) {  
                        Image imagenL = Image.getInstance("src/img/letraL.jpg"); 
                        imagenL.scaleAbsoluteWidth(40f); //ancho
                        imagenL.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenL);
                    }
                    if (guardarCadena[i].equals("m") || guardarCadena[i].equals("M")) {  
                        Image imagenM = Image.getInstance("src/img/letraM.jpg"); 
                        imagenM.scaleAbsoluteWidth(40f); //ancho
                        imagenM.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenM);
                    }
                    if (guardarCadena[i].equals("n") || guardarCadena[i].equals("N")) {  
                        Image imagenN = Image.getInstance("src/img/letraN.jpg"); 
                        imagenN.scaleAbsoluteWidth(40f); //ancho
                        imagenN.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenN);
                    }
                    if (guardarCadena[i].equals("o") || guardarCadena[i].equals("O")) {  
                        Image imagenO = Image.getInstance("src/img/letraO.jpg"); 
                        imagenO.scaleAbsoluteWidth(40f); //ancho
                        imagenO.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenO);
                    }
                    if (guardarCadena[i].equals("p") || guardarCadena[i].equals("P")) {  
                        Image imagenP = Image.getInstance("src/img/letraP.jpg"); 
                        imagenP.scaleAbsoluteWidth(40f); //ancho
                        imagenP.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenP);
                    }
                    if (guardarCadena[i].equals("q") || guardarCadena[i].equals("Q")) {  
                        Image imagenQ = Image.getInstance("src/img/letraQ.jpg"); 
                        imagenQ.scaleAbsoluteWidth(40f); //ancho
                        imagenQ.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenQ);
                    }
                    if (guardarCadena[i].equals("r") || guardarCadena[i].equals("R")) { 
                        Image imagenR = Image.getInstance("src/img/letraR.jpg"); 
                        imagenR.scaleAbsoluteWidth(40f); //ancho
                        imagenR.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenR);
                    }
                    if (guardarCadena[i].equals("s") || guardarCadena[i].equals("S")) { 
                        Image imagenS = Image.getInstance("src/img/letraS.jpg"); 
                        imagenS.scaleAbsoluteWidth(40f); //ancho
                        imagenS.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenS);    
                    }
                    if (guardarCadena[i].equals("t") || guardarCadena[i].equals("T")) { 
                        Image imagenT = Image.getInstance("src/img/letraT.jpg"); 
                        imagenT.scaleAbsoluteWidth(40f); //ancho
                        imagenT.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenT);
                    }
                    if (guardarCadena[i].equals("u") || guardarCadena[i].equals("U")) {
                        Image imagenU = Image.getInstance("src/img/letraU.jpg"); 
                        imagenU.scaleAbsoluteWidth(40f); //ancho
                        imagenU.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenU);
                    }
                    if (guardarCadena[i].equals("v") || guardarCadena[i].equals("V")) { 
                        Image imagenV = Image.getInstance("src/img/letraV.jpg"); 
                        imagenV.scaleAbsoluteWidth(40f); //ancho
                        imagenV.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenV);    
                    }
                    if (guardarCadena[i].equals("w") || guardarCadena[i].equals("W")) {
                        Image imagenW = Image.getInstance("src/img/letraW.jpg"); 
                        imagenW.scaleAbsoluteWidth(40f); //ancho
                        imagenW.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenW);
                    }
                    if (guardarCadena[i].equals("x") || guardarCadena[i].equals("X")) {
                        Image imagenX = Image.getInstance("src/img/letraX.jpg"); 
                        imagenX.scaleAbsoluteWidth(40f); //ancho
                        imagenX.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenX);
                    }
                    if (guardarCadena[i].equals("y") || guardarCadena[i].equals("Y")) {
                        Image imagenY = Image.getInstance("src/img/letraY.jpg"); 
                        imagenY.scaleAbsoluteWidth(40f); //ancho
                        imagenY.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenY);
                    }
                    if (guardarCadena[i].equals("z") || guardarCadena[i].equals("Z")) { 
                        Image imagenZ = Image.getInstance("src/img/letraZ.jpg"); 
                        imagenZ.scaleAbsoluteWidth(40f); //ancho
                        imagenZ.scaleAbsoluteHeight(60f);//alto
                        //Agregamos la imagen al documento.
                        documento.add(imagenZ);
                    }
                }
            }
            // Obtenemos una instancia de un objeto Image
            // pasandole por parametro la imagen.
            //Asignamos un 20 porciento de ancho.
 
           documento.close();
        } catch (DocumentException ex) {
            // Atrapamos excepciones concernientes al documentoo.
            JOptionPane.showMessageDialog(null,"Error Al Crear El PDF");
        } catch (IOException ex) {
            // Atrapamos excepciones concernientes al I/O.
            JOptionPane.showMessageDialog(null,"");
        }
        
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea Abrir Archivo PDF?", "Aviso", JOptionPane.YES_NO_OPTION);    
        if (respuesta == YES_NO_OPTION) {
            try {
                File path = new File("DocumentoPDF.pdf");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }                  
    }//GEN-LAST:event_jRadioBotonPDFActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioTraductorBraille().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botonGrupoTraductor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLetraBraille1;
    private javax.swing.JRadioButton jRadioBotonHTML;
    private javax.swing.JRadioButton jRadioBotonPDF;
    private javax.swing.JLabel letra10;
    private javax.swing.JLabel letra12;
    private javax.swing.JLabel letra14;
    private javax.swing.JLabel letra16;
    private javax.swing.JLabel letra18;
    private javax.swing.JLabel letra20;
    private javax.swing.JTextField txtParrafo;
    // End of variables declaration//GEN-END:variables
}
