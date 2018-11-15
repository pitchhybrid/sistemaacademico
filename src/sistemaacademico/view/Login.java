package sistemaacademico.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JanelaHeranca implements ActionListener{
JTextField txfLogin;
JPasswordField txfSenha;
    
    public Login(){
        inicializarComponentes();
        setSize(600,300);
    }

    private void inicializarComponentes() {
        setLayout(null);
        JLabel imagem = new JLabel(new ImageIcon("./assets/login.png"));
        imagem.setBounds(0,1,250,250);
        add(imagem);
        txt();
        txf();
        btn();
        
    }
    private void txt(){
        JLabel txtLogin = new JLabel("Usuario:");
        txtLogin.setBounds(300, 25, 60, 25);
        JLabel txtSenha = new JLabel("Senha:");
        txtSenha.setBounds(300, 120, 60, 25);
        
        add(txtSenha);
        add(txtLogin);
    } 
    private void txf(){
        txfLogin = new JTextField();
        txfLogin.setBounds(300, 45, 220, 25);
        txfLogin.addActionListener(this);
        txfSenha = new JPasswordField();
        txfSenha.setBounds(300, 140, 220, 25);
        txfSenha.addActionListener(this);
        add(txfSenha);
        add(txfLogin);
    }
     private void btn(){
        JButton entrar = new JButton("Entrar");
        entrar.setBounds(300, 200, 100, 25);
        entrar.addActionListener(this);
        JButton sair = new JButton("Sair");
        sair.setBounds(420, 200, 100, 25);
        sair.addActionListener(this);
        add(entrar);
        add(sair);
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        char []senha = txfSenha.getPassword();
        JButton btn = ((JButton)ae.getSource());
        
        if(btn.getText().equals("Sair")){
            System.exit(0);
        }
        if(btn.getText().equals("Entrar")){
            if(txfLogin.getText().equalsIgnoreCase("Aluno") && "123456".equals(String.valueOf(senha))){
                
            }else{
                JOptionPane.showMessageDialog(this, "Campos Vazios ou Senha Errada!!!");
            }
        }
    
    
    
        }
        
    

    }
