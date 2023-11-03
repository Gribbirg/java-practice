package Practice_5.Ex_1;

import ForAll.Messages;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("1");

        // создание окна
        JFrame frame = new JFrame("Milan - Madrid");
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final int width = 400;
        panel.setPreferredSize(new Dimension(400, 128));

        int currentHeight = 1;
        int[] goals = {0, 0};

        // надписи и кнопки
        JLabel labelGoals = new JLabel("Result: 0 X 0", JLabel.CENTER);
        labelGoals.setBounds(width / 2 - labelGoals.getPreferredSize().width / 2, 1, labelGoals.getPreferredSize().width, labelGoals.getPreferredSize().height);
        currentHeight += labelGoals.getPreferredSize().height + 4;
        JLabel labelLastScorer = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        labelLastScorer.setBounds(width / 2 - labelLastScorer.getPreferredSize().width / 2, currentHeight, labelLastScorer.getPreferredSize().width, labelLastScorer.getPreferredSize().height);
        currentHeight += labelLastScorer.getPreferredSize().height + 5;
        JLabel labelWinner = new JLabel("Winner: DRAW", JLabel.CENTER);
        labelWinner.setBounds(width / 2 - labelWinner.getPreferredSize().width / 2, currentHeight, labelWinner.getPreferredSize().width, labelWinner.getPreferredSize().height);
        currentHeight += labelWinner.getPreferredSize().height + 5;

        JButton buttonMilan = new JButton("AC Milan");
        buttonMilan.setBounds(width / 4 - 150 / 2, currentHeight, 150, buttonMilan.getPreferredSize().height);
        buttonMilan.addActionListener(e -> {
            // при нажатии на кнопку
            System.out.println("Milan scores!");
            goals[0]++;
            labelGoals.setText("Result: " + goals[0] + " X " + goals[1]);
            labelGoals.setBounds(width / 2 - labelGoals.getPreferredSize().width / 2, labelGoals.getY(), labelGoals.getPreferredSize().width, labelGoals.getPreferredSize().height);
            labelLastScorer.setText("Last Scorer: AC Milan");
            labelLastScorer.setBounds(width / 2 - labelLastScorer.getPreferredSize().width / 2, labelLastScorer.getY(), labelLastScorer.getPreferredSize().width, labelLastScorer.getPreferredSize().height);

        });

        JButton buttonMadrid = new JButton("Real Madrid");
        buttonMadrid.setBounds(width / 2 + width / 4 - 150 / 2, currentHeight, 150, buttonMadrid.getPreferredSize().height);
        buttonMadrid.addActionListener(e -> {
            // при нажатии на кнопку
            System.out.println("Real Madrid scores!");
            goals[1]++;
            labelGoals.setText("Result: " + goals[0] + " X " + goals[1]);
            labelGoals.setBounds(width / 2 - labelGoals.getPreferredSize().width / 2, labelGoals.getY(), labelGoals.getPreferredSize().width, labelGoals.getPreferredSize().height);
            labelLastScorer.setText("Last Scorer: Real Madrid");
            labelLastScorer.setBounds(width / 2 - labelLastScorer.getPreferredSize().width / 2, labelLastScorer.getY(), labelLastScorer.getPreferredSize().width, labelLastScorer.getPreferredSize().height);

        });
        currentHeight += buttonMadrid.getPreferredSize().height + 5;

        JButton end = new JButton("End");
        end.setBounds(width / 2 -150 / 2, currentHeight, 150, end.getPreferredSize().height);
        end.addActionListener(e -> {
            // при нажатии на кнопку
            System.out.println("End!");
            buttonMilan.removeActionListener(buttonMilan.getActionListeners()[0]);
            buttonMadrid.removeActionListener(buttonMadrid.getActionListeners()[0]);
            end.removeActionListener(end.getActionListeners()[0]);
            if (goals[0] > goals[1]) labelWinner.setText("Winner : AC Milan");
            else if (goals[1] > goals[0]) labelWinner.setText("Winner: Real Madrid");
            else labelWinner.setText("Winner: no winner");
            labelWinner.setBounds(width / 2 - labelWinner.getPreferredSize().width / 2, labelWinner.getY(), labelWinner.getPreferredSize().width, labelWinner.getPreferredSize().height);
        });

        // включение окна
        panel.setLayout(null);
        panel.add(labelGoals);
        panel.add(labelLastScorer);
        panel.add(labelWinner);
        panel.add(buttonMilan);
        panel.add(buttonMadrid);
        panel.add(end);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
