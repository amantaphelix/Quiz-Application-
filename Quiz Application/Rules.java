import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rules.setText(
            "<html>"+ 
                "1. Do not use external resources or assistance to answer questions. Cheating will result in disqualification." + "<br><br>" +
                "2. You will have a limited amount of time to answer each question. Ensure you manage your time wisely." + "<br><br>" +
                "3. Answer questions to the best of your knowledge. Do not guess or provide false information." + "<br><br>" +
                "4. Each user is allowed one account. Multiple accounts or attempts to circumvent the rules may lead to disqualification." + "<br><br>" +
                "5. Points will be awarded for correct answers, and there may be penalties for incorrect answers. The scoring system will be explained at the beginning of the quiz." + "<br><br>" +
                "6. Play fair and do not use any scripts, bots, or automated methods to participate in the quiz." + "<br><br>" +
                "7. Treat fellow participants with respect. Do not engage in any form of harassment, hate speech, or offensive behavior." + "<br><br>" +
                "8. Most importantly, enjoy the quiz! Have fun while testing your knowledge and competing with others, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800,650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args){
        new Rules("User");
    }
}
