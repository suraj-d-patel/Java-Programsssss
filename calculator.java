
public class calculator extends javax.swing.JFrame {

    double a;
    double b;
    double equals;
    String operations;

    public calculator() {
        initComponents();

        setSize(370, 480);
        setVisible(true);
        // setDefaultCloseOnOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        tf = new javax.swing.JTextField();
        bt8 = new javax.swing.JButton();
        btdiv = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btclr = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        btmul = new javax.swing.JButton();
        btadd = new javax.swing.JButton();
        btdec = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt00 = new javax.swing.JButton();
        btchange = new javax.swing.JButton();
        btequals = new javax.swing.JButton();
        btsub = new javax.swing.JButton();

        getContentPane().setLayout(null);

        tf.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N
        tf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });
        getContentPane().add(tf);
        tf.setBounds(20, 40, 310, 60);

        bt8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt8.setText("8");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        getContentPane().add(bt8);
        bt8.setBounds(100, 190, 70, 50);

        btdiv.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        btdiv.setText("/");
        btdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdivActionPerformed(evt);
            }
        });
        getContentPane().add(btdiv);
        btdiv.setBounds(260, 130, 70, 50);

        bt4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt4.setText("4");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        getContentPane().add(bt4);
        bt4.setBounds(20, 250, 70, 50);

        bt5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt5.setText("5");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        getContentPane().add(bt5);
        bt5.setBounds(100, 250, 70, 50);

        bt6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt6.setText("6");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        getContentPane().add(bt6);
        bt6.setBounds(180, 250, 70, 50);

        bt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt1.setText("1");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(20, 310, 70, 50);

        bt2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt2.setText("2");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(100, 310, 70, 50);

        bt3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt3.setText("3");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(180, 310, 70, 50);

        btclr.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        btclr.setText("Clr");
        btclr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclrActionPerformed(evt);
            }
        });
        getContentPane().add(btclr);
        btclr.setBounds(20, 130, 150, 50);

        bt0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt0.setText("0");
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });
        getContentPane().add(bt0);
        bt0.setBounds(100, 370, 70, 50);

        bt7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt7.setText("7");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        getContentPane().add(bt7);
        bt7.setBounds(20, 190, 70, 50);

        btmul.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        btmul.setText("*");
        btmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmulActionPerformed(evt);
            }
        });
        getContentPane().add(btmul);
        btmul.setBounds(260, 190, 70, 50);

        btadd.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        btadd.setText("+");
        btadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddActionPerformed(evt);
            }
        });
        getContentPane().add(btadd);
        btadd.setBounds(260, 250, 70, 50);

        btdec.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        btdec.setText(".");
        btdec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdecActionPerformed(evt);
            }
        });
        getContentPane().add(btdec);
        btdec.setBounds(180, 370, 70, 50);

        bt9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt9.setText("9");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        getContentPane().add(bt9);
        bt9.setBounds(180, 190, 70, 50);

        bt00.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt00.setText("00");
        bt00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(bt00);
        bt00.setBounds(20, 370, 70, 50);

        btchange.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        btchange.setText("+/-");
        btchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btchangeActionPerformed(evt);
            }
        });
        getContentPane().add(btchange);
        btchange.setBounds(180, 130, 70, 50);

        btequals.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        btequals.setText("=");
        btequals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btequalsActionPerformed(evt);
            }
        });
        getContentPane().add(btequals);
        btequals.setBounds(260, 370, 70, 50);

        btsub.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        btsub.setText("-");
        btsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsubActionPerformed(evt);
            }
        });
        getContentPane().add(btsub);
        btsub.setBounds(260, 310, 70, 50);

        pack();
    }// </editor-fold>                        

    private void tfActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = tf.getText() + bt1.getText();
        tf.setText(Enternumber);
    }

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = tf.getText() + bt2.getText();
        tf.setText(Enternumber);
    }

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = tf.getText() + bt3.getText();
        tf.setText(Enternumber);
    }

    private void bt00ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = tf.getText() + bt00.getText();
        tf.setText(Enternumber);
    }

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = tf.getText() + bt0.getText();
        tf.setText(Enternumber);
    }

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = tf.getText() + bt4.getText();
        tf.setText(Enternumber);
    }

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = tf.getText() + bt5.getText();
        tf.setText(Enternumber);
    }

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = tf.getText() + bt6.getText();
        tf.setText(Enternumber);
    }

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = tf.getText() + bt7.getText();
        tf.setText(Enternumber);
    }

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = tf.getText() + bt8.getText();
        tf.setText(Enternumber);
    }

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = tf.getText() + bt9.getText();
        tf.setText(Enternumber);
    }

    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {
        a = Double.parseDouble(tf.getText());
        tf.setText("");
        operations = "+";
    }

    private void btmulActionPerformed(java.awt.event.ActionEvent evt) {
        a = Double.parseDouble(tf.getText());
        tf.setText("");
        operations = "*";
    }

    private void btdivActionPerformed(java.awt.event.ActionEvent evt) {
        a = Double.parseDouble(tf.getText());
        tf.setText("");
        operations = "/";
    }

    private void btsubActionPerformed(java.awt.event.ActionEvent evt) {
        a = Double.parseDouble(tf.getText());
        tf.setText("");
        // tf.append("-");
        operations = "-";
    }

    private void btdecActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = tf.getText() + btdec.getText();
        tf.setText(Enternumber);
    }

    private void btchangeActionPerformed(java.awt.event.ActionEvent evt) {
        double res = Double.parseDouble(String.valueOf(tf.getText()));
        res = res * (-1);
        tf.setText(String.valueOf(res));

    }

    private void btequalsActionPerformed(java.awt.event.ActionEvent evt) {
        String answer;
        b = Double.parseDouble(tf.getText());
        if (operations == "+") {
            equals = a + b;
            answer = String.format("%.0f", equals);
            tf.setText(answer);
        } else if (operations == "-") {
            equals = a - b;
            answer = String.format("%.0f", equals);
            tf.setText(answer);
        } else if (operations == "*") {
            equals = a * b;
            answer = String.format("%.0f", equals);
            tf.setText(answer);
        } else if (operations == "/") {
            equals = a / b;
            answer = String.format("%.0f", equals);
            tf.setText(answer);
        }

    }

    private void btclrActionPerformed(java.awt.event.ActionEvent evt) {
        tf.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt00;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btadd;
    private javax.swing.JButton btchange;
    private javax.swing.JButton btclr;
    private javax.swing.JButton btdec;
    private javax.swing.JButton btdiv;
    private javax.swing.JButton btequals;
    private javax.swing.JButton btmul;
    private javax.swing.JButton btsub;
    private javax.swing.JTextField tf;

    // End of variables declaration                   
}
