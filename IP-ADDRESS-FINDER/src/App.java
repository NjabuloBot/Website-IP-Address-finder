import javax.swing.*;
import java.awt.event.*;
import java.net.*;

public class App extends JFrame implements ActionListener{

    JLabel labez;
    JTextField textfield;
    JButton butt;

    App(){
        super("IP FINDER TOOL");
        labez = new JLabel("Enter URL: ");
        labez.setBounds(50,70,150,20);
        textfield = new JTextField();
        textfield.setBounds(50,100,200,20);

        butt = new JButton("Find IP");
        butt.setBounds(50,150,80,30);
        butt.addActionListener(this);
        add(labez);
        add(textfield);
        add(butt);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String url = textfield.getText();
        try {
            InetAddress ia =InetAddress.getByName(url);
            String ip = ia.getHostAddress();
            JOptionPane.showMessageDialog(this,ip);
        } catch (UnknownHostException e1) {
            JOptionPane.showMessageDialog(this,e1.toString());
            // TODO: handle exception
        }
    }

    public static void main(String[] args){
        new App();
    } 
}  