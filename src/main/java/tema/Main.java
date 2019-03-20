package tema;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Operatii cu polinoame");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout((null));

        JLabel coef1 = new JLabel(("coef:"));
        coef1.setBounds(30, 20, 80, 30);
        panel.add(coef1);
        final JTextField coef11 = new JTextField(20);
        coef11.setBounds(60, 20, 80, 30);
        panel.add(coef11);

        JLabel grad1 = new JLabel(("grad:"));
        grad1.setBounds(200, 20, 80, 30);
        panel.add(grad1);
        final JTextField grad11 = new JTextField(20);
        grad11.setBounds(230, 20, 80, 30);
        panel.add(grad11);

        JButton add1 = new JButton("Add");
        add1.setBounds(315, 20, 70, 30);
        panel.add(add1);

        JLabel coef2 = new JLabel(("coef:"));
        coef2.setBounds(400, 20, 80, 30);
        panel.add(coef2);
        final JTextField coef22 = new JTextField(20);
        coef22.setBounds(430, 20, 80, 30);
        panel.add(coef22);

        JLabel grad2 = new JLabel(("grad:"));
        grad2.setBounds(550, 20, 80, 30);
        panel.add(grad2);
        final JTextField grad22 = new JTextField(20);
        grad22.setBounds(580, 20, 80, 30);
        panel.add(grad22);

        JButton add2 = new JButton("Add");
        add2.setBounds(665, 20, 70, 30);
        panel.add(add2);

        JLabel polinom1 = new JLabel(("Polinom1:"));
        polinom1.setBounds(30, 100, 80, 30);
        panel.add(polinom1);
        final JTextField polinom11 = new JTextField(20);
        polinom11.setBounds(90, 100, 250, 30);
        panel.add(polinom11);

        JLabel polinom2 = new JLabel(("Polinom2:"));
        polinom2.setBounds(450, 100, 80, 30);
        panel.add(polinom2);
        final JTextField polinom22 = new JTextField(20);
        polinom22.setBounds(510, 100, 250, 30);
        panel.add(polinom22);

        JButton plus = new JButton("+");
        plus.setBounds(30, 200, 50, 50);
        panel.add(plus);

        JButton minus = new JButton("-");
        minus.setBounds(100, 200, 50, 50);
        panel.add(minus);

        JButton mul = new JButton("*");
        mul.setBounds(170, 200, 50, 50);
        panel.add(mul);

        JButton deriv = new JButton("'");
        deriv.setBounds(240, 200, 50, 50);
        panel.add(deriv);

        JButton integ = new JButton("|");
        integ.setBounds(310, 200, 50, 50);
        panel.add(integ);

        JLabel rezultat1 = new JLabel(("Rezultat:"));
        rezultat1.setBounds(30, 350, 80, 30);
        panel.add(rezultat1);
        final JTextField rezultat11 = new JTextField(20);
        rezultat11.setBounds(90, 350, 350, 30);
        panel.add(rezultat11);

        JButton clear = new JButton("Clear");
        clear.setBounds(500, 350, 100, 30);
        panel.add(clear);

        frame.setVisible((true));

        final ArrayList<Monom> p = new ArrayList<Monom>();
        final ArrayList<Monom> q = new ArrayList<Monom>();
        final ArrayList<Monom> suma = new ArrayList<Monom>();
        ArrayList<Monom> suma11 = new ArrayList<Monom>();
        final ArrayList<Monom> dif = new ArrayList<Monom>();
        final ArrayList<Monom> produs = new ArrayList<Monom>();
        final ArrayList<Monom> derivare = new ArrayList<Monom>();
        final ArrayList<Monom1> integrare = new ArrayList<Monom1>();

        add1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String coef_p1 = coef11.getText();
                String grad_p1 = grad11.getText();
                int p1_coef = Integer.parseInt(coef_p1);
                int p1_grad = Integer.parseInt(grad_p1);
                Monom mon1 = new Monom(p1_coef, p1_grad);
                p.add(mon1);
                afisare_polinom1();
            }

            public void afisare_polinom1() {
                String poli1 = "";
                for (Monom i : p) {
                    for (Monom j : p)
                        i.sortare(j);
                }
                for (Monom i : p) {
                    if (i.coef >= 0)
                        poli1 = poli1.concat("+");
                    else
                        poli1 = poli1.concat("-");
                    if(i.grad==0)
                        poli1 = poli1.concat(i.coef+"");
                    else if(i.grad==1)
                        poli1 = poli1.concat(i.coef + "*X");
                    else if(i.coef==1)
                        poli1 = poli1.concat("X^" + i.grad);
                    else if(i.coef==0)
                        poli1 = poli1.concat(0+"");
                    else
                    poli1 = poli1.concat(i.coef + "*X^" + i.grad);
                }
                polinom11.setText(poli1);
            }
        });

        add2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String coef_p2 = coef22.getText();
                String grad_p2 = grad22.getText();
                int p2_coef = Integer.parseInt(coef_p2);
                int p2_grad = Integer.parseInt(grad_p2);
                Monom mon2 = new Monom(p2_coef, p2_grad);
                q.add(mon2);
                afisare_polinom2();
            }

            public void afisare_polinom2() {
                String poli2 = "";
                for (Monom i : q) {
                    for (Monom j : q)
                        i.sortare(j);
                }
                for (Monom i : q) {
                    if (i.coef >= 0)
                        poli2 = poli2.concat("+");
                    else
                        poli2 = poli2.concat("-");
                    if(i.grad==0)
                        poli2 = poli2.concat(i.coef+"");
                    else if(i.grad==1)
                        poli2 = poli2.concat(i.coef + "*X");
                    else if(i.coef==1)
                        poli2 = poli2.concat("X^" + i.grad);
                    else if(i.coef==0)
                        poli2 = poli2.concat(0+"");
                    else
                        poli2 = poli2.concat(i.coef + "*X^" + i.grad);

                }
                polinom22.setText(poli2);
            }
        });

        //p.add(p1);
        //p.add(p2);
        //p.add(p3);
        //p.add(p4);
        //q.add(q1);
        //q.add(q2);
        //q.add(q3);
        //Afisare olinomul p
        for (Monom j : p) {
            for (Monom i : p) {
                j.sortare(i);
            }
        }
        System.out.println();
        System.out.print("p(x)=");
        for (Monom i : p) {
            if (i.coef > 0)
                System.out.print("+");
            i.afisare();
        }
        System.out.println();
        //Afisare p derivat
        System.out.print("p'(x)=");
        for (Monom i : p) {
            if (i.coef > 0)
                System.out.print("+");
            i.derivare();
        }
        //Afisare polinom q
        for (Monom j : q) {
            for (Monom i : q) {
                j.sortare(i);
            }
        }
        System.out.println();
        System.out.print("q(x)=");
        //Afisare q derivat
        for (Monom i : q) {
            if (i.coef > 0)
                System.out.print("+");
            i.afisare();
        }
        System.out.println();
        System.out.print("q'(x)=");
        for (Monom i : q) {
            if (i.coef > 0)
                System.out.print("+");
            i.derivare();
        }
        System.out.println();
        System.out.print("p(x)*q(x)=");
        //Afisare p1 integrat
        integ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String integration = "";
                for (Monom i : p) {
                    Monom1 integr = new Monom1(1, 0);
                    integr.coef1 = (double) i.coef / (i.grad + 1);
                    integr.grad1 = i.grad + 1;
                    // integr.integrare();
                    integrare.add(integr);

                }
                //integr.integrare();
                //integr.afisare1();
                for (Monom1 i : integrare) {
                    if (i.coef1 >= 0)
                        integration = integration.concat("+");
                    else
                        integration = integration.concat("-");
                    if(i.grad1==0)
                        integration=integration.concat(i.coef1+"");
                    else if(i.grad1==1)
                        integration=integration.concat(i.coef1+"*X");
                    else if(i.coef1==1)
                        integration=integration.concat("X^"+i.grad1);
                    else if(i.coef1==0)
                        integration=integration.concat(0+"");
                    else
                    integration = integration.concat(i.coef1 + "*X^" + i.grad1);
                    //i.afisare1();
                    rezultat11.setText(integration);
                }


            }
        });
        //Afisare p1 derivat
        deriv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String deriv = "";
                for (Monom i : p) {
                    derivare.add(i.derivare());

                }
                for (Monom i : derivare) {
                    if (i.coef >= 0)
                        deriv = deriv.concat("+");
                    else
                        deriv = deriv.concat("-");
                    if(i.grad==0)
                        deriv=deriv.concat(i.coef+"");
                    else if(i.grad==1)
                        deriv=deriv.concat(i.coef+"*X");
                    else if(i.coef==1)
                        deriv=deriv.concat("X^"+i.grad);
                    else if(i.coef==0)
                        deriv=deriv.concat(0+"");
                    else
                    deriv = deriv.concat(i.coef + "*X^" + i.grad);
                    rezultat11.setText(deriv);


                }
            }
        });
        //Inmultire polinoame
        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String prod = "";
                for (Monom i : p) {
                    for (Monom j : q) {
                        Monom p1 = i.inmultire(j);
                        produs.add(p1);
                    }
                }
                for (Monom i : produs)
                    for (Monom j : produs)
                        i.sortare(j);
                for (Monom i : produs) {
                    if (i.coef >= 0)
                        prod = prod.concat("+");
                    else
                        prod = prod.concat("-");
                    if(i.grad==0)
                        prod=prod.concat(i.coef+"");
                    else if(i.grad==1)
                        prod=prod.concat(i.coef+"*X");
                    else if(i.coef==1)
                        prod=prod.concat("X^"+i.grad);
                    else if(i.coef==0)
                        prod=prod.concat(0+"");
                    else
                        prod = prod.concat(i.coef + "*X^" + i.grad);
                    rezultat11.setText(prod);
                }
            }
        });
        System.out.println();
        //Adunare polinoame
        System.out.print("p(x)+q(x)=");
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String suma1 = "";
                int count1 = 0;
                int count2 = 0;
                while (p.size() > count1 && q.size() > count2) {
                    if (p.get(count1).compare(q.get(count2)) == 2) {
                        //p.get(count1).adunare(q.get(count2));
                        Monom sum = p.get(count1).adunare(q.get(count2)); //new Monom(p.get(count1).coef, p.get(count1).grad);
                        suma.add(sum);
                        count1++;
                    } else if (p.get(count1).compare(q.get(count2)) == 1) {
                        //p.get(count1).adunare(q.get(count2));
                        Monom sum = p.get(count1).adunare(q.get(count2)); //Monom(q.get(count2).coef, q.get(count2).grad);
                        suma.add(sum);
                        count2++;
                    } else if (p.get(count1).compare(q.get(count2)) == 0) {
                        // p.get(count1).adunare(q.get(count2));
                        Monom sum = p.get(count1).adunare(q.get(count2));
                        //new Monom(p.get(count1).coef+q.get(count2).coef, p.get(count2).grad);
                        suma.add(sum);
                        count1++;
                        count2++;
                    }
                }
                while (p.size() > count1) {
                    Monom sum = p.get(count1);
                    suma.add(sum);
                    count1++;
                }
                while (q.size() > count2) {
                    Monom sum = q.get(count2);
                    suma.add(sum);
                    count2++;
                }

                for (Monom i : suma) {
                    if(i.grad==0)
                        suma1=suma1.concat(i.coef+"");
                    else if(i.grad==1)
                        suma1=suma1.concat(i.coef+"*X");
                    else if(i.coef==1)
                        suma1=suma1.concat("X^"+i.grad);
                    else if(i.coef==0)
                        suma1=suma1.concat(0+"");
                    else
                    suma1 = suma1.concat(i.coef + "*X^" + i.grad);
                    if (i.coef >= 0)
                        suma1 = suma1.concat("+");
                    else
                        suma1 = suma1.concat("-");
                    // i.afisare();
                    rezultat11.setText(suma1);
                }
            }


        });
        System.out.println();
        //Scadere polinoame
        System.out.print("p(x)-q(x)");
        minus.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        String dife1 = "";
                                        int count3 = 0;
                                        int count4 = 0;
                                        while ((p.size() > count3) && (q.size() > count4)) {
                                            if (p.get(count3).compare(q.get(count4)) == 2) {
                                                Monom diferenta = p.get(count3).scadere(q.get(count4));
                                                dif.add(diferenta);
                                                if (diferenta.coef >= 0)
                                                    dife1 = dife1.concat("+");
                                                else
                                                    dife1 = dife1.concat("-");
                                                if(diferenta.grad==0)
                                                    dife1=dife1.concat(diferenta.coef+"");
                                                else if(diferenta.grad==1)
                                                    dife1=dife1.concat(diferenta.coef+"*X");
                                                else if(diferenta.coef==1)
                                                    dife1=dife1.concat("X^"+diferenta.grad);
                                                else if(diferenta.coef==0)
                                                    dife1=dife1.concat(0+"");
                                                else
                                                dife1 = dife1.concat(diferenta.coef + "*X^" + diferenta.grad);
                                                rezultat11.setText(dife1);
                                                count3++;
                                            } else if (p.get(count3).compare(q.get(count4)) == 1) {
                                                Monom diferenta = p.get(count3).adunare(q.get(count4));
                                                dif.add(diferenta);
                                                if (diferenta.coef >= 0)
                                                    dife1 = dife1.concat("-");
                                                else
                                                    dife1 = dife1.concat("+");
                                                if(diferenta.grad==0)
                                                    dife1=dife1.concat(diferenta.coef+"");
                                                else if(diferenta.grad==1)
                                                    dife1=dife1.concat(diferenta.coef+"*X");
                                                else if(diferenta.coef==1)
                                                    dife1=dife1.concat("X^"+diferenta.grad);
                                                else if(diferenta.coef==0)
                                                    dife1=dife1.concat(0+"");
                                                else
                                                dife1 = dife1.concat(diferenta.coef + "*X^" + diferenta.grad);
                                                rezultat11.setText(dife1);
                                                count4++;
                                            } else if (p.get(count3).compare(q.get(count4)) == 0) {
                                                Monom diferenta = p.get(count3).scadere(q.get(count4));
                                                dif.add(diferenta);
                                                if (diferenta.coef > 0)
                                                    dife1 = dife1.concat("+");
                                                else
                                                    dife1 = dife1.concat("-");
                                                if(diferenta.grad==0)
                                                    dife1=dife1.concat(diferenta.coef+"");
                                                else if(diferenta.grad==1)
                                                    dife1=dife1.concat(diferenta.coef+"*X");
                                                else if(diferenta.coef==1)
                                                    dife1=dife1.concat("X^"+diferenta.grad);
                                                else if(diferenta.coef==0)
                                                    dife1=dife1.concat(0+"");
                                                else
                                                dife1 = dife1.concat(diferenta.coef + "*X^" + diferenta.grad);
                                                rezultat11.setText(dife1);
                                                count3++;
                                                count4++;
                                            }
                                        }
                                        while (p.size() > count3) {
                                            Monom diferenta = p.get(count3);
                                            dif.add(diferenta);
                                            if (diferenta.coef > 0)
                                                dife1 = dife1.concat("+");
                                            else
                                                dife1 = dife1.concat("-");
                                            if(diferenta.grad==0)
                                                dife1=dife1.concat(diferenta.coef+"");
                                            else if(diferenta.grad==1)
                                                dife1=dife1.concat(diferenta.coef+"*X");
                                            else if(diferenta.coef==1)
                                                dife1=dife1.concat("X^"+diferenta.grad);
                                            else if(diferenta.coef==0)
                                                dife1=dife1.concat(0+"");
                                            else
                                            dife1 = dife1.concat(diferenta.coef + "*X^" + diferenta.grad);
                                            rezultat11.setText(dife1);
                                            count3++;
                                        }
                                        while (q.size() > count4) {
                                            Monom diferenta = q.get(count4);
                                            dif.add(diferenta);
                                            if (diferenta.coef > 0)
                                                dife1 = dife1.concat("-");
                                            else
                                                dife1 = dife1.concat("+");
                                            if(diferenta.grad==0)
                                                dife1=dife1.concat(diferenta.coef+"");
                                            else if(diferenta.grad==1)
                                                dife1=dife1.concat(diferenta.coef+"*X");
                                            else if(diferenta.coef==1)
                                                dife1=dife1.concat("X^"+diferenta.grad);
                                            else if(diferenta.coef==0)
                                                dife1=dife1.concat(0+"");
                                            else
                                            dife1 = dife1.concat(diferenta.coef + "*X^" + diferenta.grad);
                                            rezultat11.setText(dife1);
                                            count4++;
                                        }
                                    }
                                }
        );
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rezultat11.setText("");

            }
        });
    }
}


