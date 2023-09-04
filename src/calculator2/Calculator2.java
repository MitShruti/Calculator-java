
package calculator2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;
public class Calculator2 extends JFrame implements ActionListener 
{
     static double a=0,l=0;
     static double result=0,b=0;
     static double d=10,g=0;
     int fontstyle;
      int fontsize=50;
     JTextField tfresult;
     JLabel tfstd;
     JButton btoption;
     Button  btmc,btmr,btmp,btmm,btms,btm;
     JButton btmod,bt7,bt4,bt1,bt,btce,btc,btback,btx,btxs,btroot,btdiv,btmul,btmin,btplus,btequal;
     JButton bt8,bt5,bt2,bt0,bt9,bt6,bt3,btdot;
     ImageIcon ic;
     Font f;
     public Calculator2()
     {
         f=new Font("A",Font.PLAIN,30);
         btoption=new JButton();
         tfstd=new JLabel();
        setLayout(null);
        btoption.setBounds(5,20, 30, 30);
        tfstd.setBounds(40, 20, 250, 50);
        add(btoption);
        add(tfstd);
        tfstd.setFont(f);
        tfstd.setText("Standard");
        tfresult=new JTextField("0");
        tfresult.setFont(f);
        tfresult.setHorizontalAlignment(JTextField.RIGHT);
        tfresult.setBounds(5,100,550,100);
        add(tfresult);
        btmc=new Button("MC");
        btmr=new Button("MR");
        btmp=new Button("M+");
        btmm=new Button("M-");
        btms=new Button("MS");
        btm=new Button("M");
        btmc.setFont(f);
        btmr.setFont(f);
        btmp.setFont(f);
        btmm.setFont(f);
        btm.setFont(f);
        btmc.setBounds(5, 225, 100, 80);
        btmr.setBounds(120, 225, 100, 80);
        btmp.setBounds(240, 225, 100, 80);
        btmm.setBounds(360, 225, 100, 80);
        btm.setBounds(480, 225, 100, 80);
        
        add(btmc);
        add(btmr);
        add(btmp);
        add(btmm);
        add(btm) ;
        ic=new ImageIcon("C:\\Users\\HP\\OneDrive\\Pictures\\java images\\download (1).png");
        btback=new JButton(ic);
        btback.setFont(f);
        
        btdiv=new JButton("/");
        btdiv.setFont(f);
        btmul=new JButton("X");
        btmul.setFont(f);
        btmin=new JButton("-");
        btmin.setFont(f);
        btplus=new JButton("+");
        btplus.setFont(f);
        btequal=new JButton("=");
        btequal.setFont(f);
        btmod=new JButton("%");
        btmod.setFont(f);
        btx=new JButton("1/x");
        btx.setFont(f);
        bt7=new JButton("7");
        bt7.setFont(f);
        bt4=new JButton("4");
        bt4.setFont(f);
        bt1=new JButton("1");
        bt1.setFont(f);
        bt=new JButton("+/-");
        bt.setFont(f);
         btce=new JButton("CE");
         btce.setFont(f);
         btxs=new JButton("x^2");
         btxs.setFont(f);
         btroot=new JButton("rootx");
         btroot.setFont(f);
         bt8=new JButton("8");
         bt8.setFont(f);
         bt9=new JButton("9");
         bt9.setFont(f);
         bt5=new JButton("5");
         bt5.setFont(f);
         bt6=new JButton("6");
         bt6.setFont(f);
         bt2=new JButton("2");
         bt2.setFont(f);
         bt3=new JButton("3");
         bt3.setFont(f);
         bt0=new JButton("0");
         bt0.setFont(f);
         btc=new JButton("C");
         btc.setFont(f);
         btdot=new JButton(".");
         btdot.setFont(f);
        btback.setBounds(440,335, 120, 75);
        btmod.setBounds(5,335,120,75);
        btce.setBounds(150,335,120,75);
        btc.setBounds(295,335,120,75);
        btdiv.setBounds(440, 425, 120, 75);
        btx.setBounds(5,425,120,75);
        btxs.setBounds(150,425,120,75);
        btroot.setBounds(295,425,120,75);
        btmul.setBounds(440,515,120,75);
        bt7.setBounds(5,515,120,75);
        bt8.setBounds(150,515,120,75);
        bt9.setBounds(295,515,120,75);
        btmin.setBounds(440,605,120,75);
        bt4.setBounds(5,605,120,75);
        bt5.setBounds(150,605,120,75);
        bt6.setBounds(295,605,120,75);
        btplus.setBounds(440,695,120,75);
        bt1.setBounds(5,695,120,75);
        bt2.setBounds(150,695,120,75);
        bt3.setBounds(295,695,120,75);
        bt.setBounds(5,785,120,75);
        btequal.setBackground(Color.RED);
        btequal.setBounds(440, 785, 120, 75);
        bt0.setBounds(150,785,120,75);
        btdot.setBounds(295,785,120,75);
        add(bt2);
        add(btxs);
        add(btroot);
        add(bt5);
        add(bt8);
        add(bt9);
        add(bt6);
        add(bt3);
        add(btdot);
        add(bt0);
        add(btce);
        add(btequal);
        add(btplus);
        add(btmin);
        add(btback);
        add(btdiv);
        add(btmul);
        add(btmod);
        add(btx);
        add(bt7);
        add(bt4);
        add(bt1);
        add(bt);
        add(btc);
        bt0.addActionListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        btdot.addActionListener(this);
        btmod.addActionListener(this);
        btmul.addActionListener(this);
        bt.addActionListener(this);
        btce.addActionListener(this);
        btc.addActionListener(this);
        btback.addActionListener(this);
        btx.addActionListener(this);
        btxs.addActionListener(this);
        btoption.addActionListener(this);
        btmc.addActionListener(this);
        btmr.addActionListener(this);
        btmp.addActionListener(this);
        btmm.addActionListener(this);
        btms.addActionListener(this);
        btm.addActionListener(this);
        btroot.addActionListener(this);
        btdiv.addActionListener(this);
        btmin.addActionListener(this);
        btplus.addActionListener(this);
        btequal.addActionListener(this);
     }
     public void actionPerformed(ActionEvent ae)
     {
         double x=0;
         int r;
         
       if (ae.getSource()== bt0)
       {
          
           x=0;
           if(g==1)
           {
               x=x/d;
               d=d*10;
               a=a+x;
           }
           else
           a= a*10+x;
           tfresult.setText(a+"");
       }
       else if(ae.getSource()==bt1)
       {
           x=1;
           if(g==1)
           {
               x=x/d;
               d=d*10;
               a=a+x;
           }
           else
           a=a*10+x;
           tfresult.setText(a+"");
       }
       else if(ae.getSource()==bt2)
       {
           x=2;
           if(g==1)
           {
               x=x/d;
               d=d*10;
               a=a+x;
           }
           else
           a=a*10+x;
           tfresult.setText(a+"");
       }
       else if(ae.getSource()==bt3)
       {
            x=3;
            if(g==1)
           {
               x=x/d;
               d=d*10;
               a=a+x;
           }
            else
           a=a*10+x;
           tfresult.setText(a+"");
       }
       else if(ae.getSource()==bt4)
       {
             x=4;
             if(g==1)
           {
               x=x/d;
               d=d*10;
               a=a+x;
           }
             else
           a=a*10+x;
           tfresult.setText(a+"");
       }
       else if(ae.getSource()==bt5)
       {
            x=5;
            if(g==1)
           {
               x=x/d;
               d=d*10;
               a=a+x;
           }
            else
           a=a*10+x;
           tfresult.setText(a+"");
       }
       else if(ae.getSource()==bt6)
       {
            x=6;
            if(g==1)
           {
               x=x/d;
               d=d*10;
               a=a+x;
           }
            else
           a=a*10+x;
           tfresult.setText(a+"");
       }
       else if(ae.getSource()==bt7)
       {
            x=7;
            if(g==1)
           {
               x=x/d;
               d=d*10;
               a=a+x;
           }
            else
           a=a*10+x;
           tfresult.setText(a+"");
       }
       else if(ae.getSource()==bt8)
       {
           x=8;
           if(g==1)
           {
               x=x/d;
               d=d*10;
               a=a+x;
           }
           else
           a=a*10+x;
           tfresult.setText(a+"");
       }
       else if(ae.getSource()==bt9)
       {
            x=9;
            if(g==1)
            {
                x=x/d;
                d=d*10;
                a=a+x;
            }
            else
           a=a*10+x;
           tfresult.setText(a+"");
       }
       else if(ae.getSource()==btdot)
       {
           g=1;
       }
     
       else if(ae.getSource()==btplus)
       {
           g=0;
           l=1;
           result=a;
           System.out.print(result);
           a=0;
           d=10;
           
       }
       else if(ae.getSource()==btmin)
       {
           g=0;
           l=2;
           result=a;
           a=0;
           d=10;
       }
       else if(ae.getSource()==btmul)
       {
           g=0;
           l=3;
           result=a;
           a=0;
           d=10;
       }
       else if(ae.getSource()==btdiv)
       {
           g=0;
           l=4;
           result=a;
           a=0;
           d=10;
       }
       else if(ae.getSource()==btroot)
       {
           g=0;
           result=a;
           a=0;
           d=10;
            if(result!=0)
               {
                   b=Math.sqrt(result);
                    tfresult.setText(null);
                     tfresult.setText(b+"");
                    result=0;
                     a=0;
                    l=0;
               }
               else if(result==0)
               {
                   b=Math.sqrt(b);
                    tfresult.setText(null);
                     tfresult.setText(b+"");
                    result=0;
                     a=0;
                    l=0;
               }
       }
       else if(ae.getSource()==bt)
       {
           g=0;
           result=a;
           a=0;
           d=10;
            if(result!=0)
               {
                   b=-1*result;
                    tfresult.setText(null);
                     tfresult.setText(b+"");
                    result=0;
                     a=0;
                    l=0;
               }
               else if(result==0)
               {
                   b=-1*b;
                    tfresult.setText(null);
                     tfresult.setText(b+"");
                    result=0;
                     a=0;
                    l=0;
               }
       }
  else if(ae.getSource()==btmod)
       {
           result=a;
           a=0;
           l=5;
           g=0;
           d=10;
        
       }       
       else if(ae.getSource()==btxs)
       {
           g=0;
           result=a;
           a=0;
           d=10;
           if(result!=0)
           {
               b=result*result;
                tfresult.setText(null);
                     tfresult.setText(b+"");
                    result=0;
                     a=0;
                    l=0;
           }
           else if(result==0)
           {
               b=b*b;
                tfresult.setText(null);
                     tfresult.setText(b+"");
                    result=0;
                     a=0;
                    l=0;
           }
       }
       else if(ae.getSource()==btx)
       {
           g=0;
           result=a;
           a=0;
           d=10;
           if(result!=0)
           {
               b=1/result;
                tfresult.setText(null);
                     tfresult.setText(b+"");
                    result=0;
                     a=0;
                    l=0;
           }
           else if(result==0)
           {
               b=1/b;
                tfresult.setText(null);
                     tfresult.setText(b+"");
                    result=0;
                     a=0;
                    l=0;
           }
       }
       else if(ae.getSource()==btc)
       {
           g=0;
           a=0;
           d=10;
           result=0;
           b=0;
           l=0;
            tfresult.setText(null);
                     tfresult.setText(b+"");
       }
      
       else if(ae.getSource()==btback)
       {
           
           if(b==0)
           {
          r=(int)a/10;
          a=(double)r;
          tfresult.setText(null);
          tfresult.setText(a+"");
          
           }
           else if(b!=0)
           {
             
          tfresult.setText(null);
          tfresult.setText(b+"");
            
           }
       }
       else if(ae.getSource()==btequal)
       {   d=10;
          g=0;
           if(l==1)
           {     
           b=b+result+a;
           tfresult.setText(null);
           tfresult.setText(b+"");
            result=0;
            a=0;
            l=0;
           }
           else if(l==2)
           {
               b=b+result-a;
                tfresult.setText(null);
           tfresult.setText(b+"");
            result=0;
            a=0;
            l=0;
           }
           else if(l==3)
           {
                     if(result!=0)
                     {
                          b=result*a;
                         tfresult.setText(null);
                         tfresult.setText(b+"");
                         result=0;
                         a=0;
                          l=0;
                     }
                    else if(result==0)
                     {
                      b=b*a;
                      tfresult.setText(null);
                     tfresult.setText(b+"");
                    result=0;
                     a=0;
                    l=0;
                    }
           }
           else if(l==4)
           {
               if(result!=0)
               {
                   b=result/a;
                   tfresult.setText(null);
                     tfresult.setText(b+"");
                    result=0;
                     a=0;
                    l=0;
               }
               else if(result==0)
               {
                   b=b/a;
                   tfresult.setText(null);
                     tfresult.setText(b+"");
                    result=0;
                     a=0;
                    l=0;
               }
           }
          
     }
     }
    public static void main(String[] args) 
    {
       Calculator2 obj=new Calculator2();
       ImageIcon ic=new ImageIcon("C:\\Users\\HP\\OneDrive\\Pictures\\java images\\Windows_Calculator_icon.png");
       obj.setIconImage(ic.getImage());
       obj.setSize(600,930);
       obj.setVisible(true);
       obj.setTitle("Calculator");
       obj.setLocation(900, 50);
       obj.setAlwaysOnTop(true);
      obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
