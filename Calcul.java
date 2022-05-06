import javax.swing.*;
import java.awt.*;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


    public class Calcul extends JFrame implements ActionListener, WindowListener { //
        final TextField f = new TextField();
        final JButton b6 = new JButton("6");
        final JButton b5 = new JButton("5");
        final JButton b1 = new JButton("1");
        final JButton b2 = new JButton("2");
        final JButton b3 = new JButton("3");
        final JButton b4 = new JButton("4");
        final JButton b7 = new JButton("7");
        final JButton b8 = new JButton("8");
        final JButton b9 = new JButton("9");
        final JButton b0 = new JButton("0");
        final JButton Del = new JButton("D");
        final JButton Cancel= new JButton("C");
        final JButton ad = new JButton("+");
        final JButton sub = new JButton("-");
        final JButton mult = new JButton("*");
        final JButton div = new JButton("/");
        final JButton equals = new JButton("=");
        final JButton sq = new JButton("sqrt");
        final JButton change = new JButton("+/-");
        final JButton dot = new JButton(".");
        final String Text="";
        final int l=57;
        final int m=57;
        public int a=0;
        public int b=0;
        public char z;



        private String text="";
     public Calcul()  { // конструктор
         Font Ex= new Font("Impact",Font.ROMAN_BASELINE,40);
         setLayout(null);
         setSize(380,550);
         setVisible(true);
         setLocation(700,250);
         f.setFont(Ex);
         f.setSize(334,60);
         f.setLocation(25,25);
         f.setVisible(true);
         add(f);
         b1.setFont(Ex);
         b1.setSize(l,m);
         b1.setLocation(20,145);
         b1.setVisible(true);
         add(b1);

         sq.setSize(70,30);
         sq.setLocation(20,100);
         sq.setVisible(true);
         add(sq);
         b2.setFont(Ex);
         b2.setSize(l,m);
         b2.setLocation(90,145);
         b2.setVisible(true);
         add(b2);
         b3.setFont(Ex);
         b3.setSize(l,m);
         b3.setLocation(160,145);
         b3.setVisible(true);
         add(b3);
         b4.setFont(Ex);
         b4.setSize(l,m);
         b4.setLocation(20,225);
         b4.setVisible(true);
         add(b4);
         b7.setFont(Ex);
         b7.setSize(l,m);
         b7.setLocation(20,305);
         b7.setVisible(true);
         add(b7);
         b6.setFont(Ex);
         b6.setSize(l,m);
         b6.setLocation(160,225);
         b6.setVisible(true);
         add(b6);
         b5.setFont(Ex);
         b5.setSize(l,m);
         b5.setLocation(90,225);
         b5.setVisible(true);
         add(b5);
         b8.setFont(Ex);
         b8.setSize(l,m);
         b8.setLocation(90,305);
         b8.setVisible(true);
         add(b8);
         b9.setFont(Ex);
         b9.setSize(l,m);
         b9.setLocation(160,305);
         b9.setVisible(true);
         add(b9);
         b0.setFont(Ex);
         b0.setSize(l,m);
         b0.setLocation(90,385);
         b0.setVisible(true);
         add(b0);
         change.setSize(l,m);
         change.setLocation(20,385);
         change.setVisible(true);
         add(change);
         dot.setFont(Ex);
         dot.setSize(l,m);
         dot.setLocation(160,385);
         dot.setVisible(true);
         add(dot);

         Del.setFont(Ex);
         Del.setSize(l,m);
         Del.setLocation(230,385);
         Del.setVisible(true);
         add(Del);
         Cancel.setFont(Ex);
         Cancel.setSize(l,m);
         Cancel.setLocation(230,305);
         Cancel.setVisible(true);
         add(Cancel);
         ad.setFont(Ex);
         ad.setSize(l,m);
         ad.setLocation(230,145);
         ad.setVisible(true);
         add(ad);
         mult.setFont(Ex);
         mult.setSize(l,m);
         mult.setLocation(230,225);
         mult.setVisible(true);
         add(mult);
         div.setFont(Ex);
         div.setSize(l,m);
         div.setLocation(300,225);
         div.setVisible(true);
         add(div);

         sub.setFont(Ex);
         sub.setSize(l,m);
         sub.setLocation(300,145);
         sub.setVisible(true);
         add(sub);
         equals.setFont(Ex);
         equals.setSize(57,135);
         equals.setLocation(300,305);
         equals.setVisible(true);
         add(equals);
         b6.addActionListener(this);
         b5.addActionListener(this);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         b7.addActionListener(this);
         b8.addActionListener(this);
         b9.addActionListener(this);
         b0.addActionListener(this);
         Del.addActionListener(this);
         ad.addActionListener(this);
         sub.addActionListener(this);
         equals.addActionListener(this);
         mult.addActionListener(this);
         div.addActionListener(this);
         Cancel.addActionListener(this);
         sq.addActionListener(this);
         change.addActionListener(this);
         dot.addActionListener(this);

     }









        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b5) {
                text = text + b5.getText();//Переменная text  стала счетчиком текста
                f.setText(b5.getText());
                f.setText(text);
            }
            if (e.getSource() == b6) {
                text = text + b6.getText();//Переменная text  стала счетчиком текста
                f.setText(b6.getText());
                f.setText(text);

            }
            if (e.getSource() == b7) {
                text = text + b7.getText();//Переменная text  стала счетчиком текста
                f.setText(b7.getText());
                f.setText(text);
            }
            if (e.getSource() == b9) {
                text = text + b9.getText();//Переменная text  стала счетчиком текста
                f.setText(b9.getText());
                f.setText(text);
            }
            if (e.getSource() == b0) {
                text = text + b0.getText();//Переменная text  стала счетчиком текста
                f.setText(b0.getText());
                f.setText(text);
            }
            if (e.getSource() == b1) {
                text = text + b1.getText();//Переменная text  стала счетчиком текста
                f.setText(b1.getText());
                f.setText(text);
            }
            if (e.getSource() == b2) {
                text = text + b2.getText();//Переменная text  стала счетчиком текста
                f.setText(b2.getText());
                f.setText(text);
            }
            if(e.getSource()==sq){
                double c=Integer.parseInt(f.getText());
                c=Math.sqrt(c);
                f.setText(String.valueOf(c));
                text=String.valueOf(c);
            }
            if(e.getSource()==change){
                int c=Integer.parseInt(f.getText());
                c=c*-1;
                f.setText(String.valueOf(c));
                text=String.valueOf(c);
            }
            if (e.getSource() == b3) {
                text = text + b3.getText();//Переменная text  стала счетчиком текста
                f.setText(b3.getText());
                f.setText(text);
            }
            if (e.getSource() == b8) {
                text = text + b8.getText();//Переменная text  стала счетчиком текста
                f.setText(b8.getText());
                f.setText(text);
            }
            if (e.getSource() == b4) {
                text = text + b4.getText();//Переменная text  стала счетчиком текста
                f.setText(b4.getText());
                f.setText(text);
            }
            if (e.getSource() == ad) {
                a = Integer.parseInt(text);
                f.setText(text + ad.getText());
                text ="";
                z='+';
            }
            if (e.getSource() == sub) {
                a = Integer.parseInt(text);
                f.setText(text + sub.getText());
                text ="";
                z = '-';
            }
            if (e.getSource() == mult) {
                a = Integer.parseInt(text);
                f.setText(text + mult.getText());
                text ="";
                z = '*';
            }
            if (e.getSource() == div) {
                a = Integer.parseInt(text);
                f.setText(text + div.getText());
                text ="";
                z = '/';
            }
            if (e.getSource() == equals) {
                if (z == '+') {
                    b = Integer.parseInt(text);
                    f.setText(String.valueOf(a + b));
                }

                if (z == '-') {
                    b = Integer.parseInt(text);
                    f.setText(String.valueOf(a - b));
                }
                if (z == '*') {
                    b = Integer.parseInt(text);
                    f.setText(String.valueOf(a * b));
                }
                if(z=='/'){
                    b=Integer.parseInt(text);
                    f.setText(String.valueOf(a/b));
                }
            }
               if (e.getSource() == Del) {
              int c=Integer.parseInt(f.getText());
              c=c/10;
                f.setText(String.valueOf(c));
                text=String.valueOf(c);
                }

            if(e.getSource() == Cancel) {
                text = "";
                f.setText(text);
            }
        }
        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {

        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }

    public static void main(String[] args) {
        Calcul f = new Calcul();// Создали объект w

    }
}
