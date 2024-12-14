package structra.assignment.task.impl.de.rub.client;

import javax.swing.*;

import java.awt.*;

public class QuizApplication {

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(QuizApplication::createAndShowGUI);
    }

    /**
     * Create the GUI and show it.
     */
    private static void createAndShowGUI() {
        // Create and set up the window
        JFrame frame = new JFrame("Question Provider");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create main panel with BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(18, 20, 18, 20));

        // Create question label
        JLabel questionLabel = new JLabel("<Question>?");
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        questionLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.add(questionLabel);
        mainPanel.add(Box.createVerticalStrut(10)); // 10px gap

        // Create options as text labels
        JLabel option1 = new JLabel("1. Option");
        option1.setFont(new Font("Arial", Font.PLAIN, 14));
        option1.setAlignmentX(Component.LEFT_ALIGNMENT);
        option1.setBorder(BorderFactory.createEmptyBorder(0, 10, 2, 0)); // 10px left and 2px bottom padding
        mainPanel.add(option1);

        JLabel option2 = new JLabel("2. Option");
        option2.setFont(new Font("Arial", Font.PLAIN, 14));
        option2.setAlignmentX(Component.LEFT_ALIGNMENT);
        option2.setBorder(BorderFactory.createEmptyBorder(0, 10, 2, 0)); // 10px left and 2px bottom padding
        mainPanel.add(option2);

        JLabel option3 = new JLabel("3. Option");
        option3.setFont(new Font("Arial", Font.PLAIN, 14));
        option3.setAlignmentX(Component.LEFT_ALIGNMENT);
        option3.setBorder(BorderFactory.createEmptyBorder(0, 10, 2, 0)); // 10px left and 2px bottom padding
        mainPanel.add(option3);

        JLabel option4 = new JLabel("4. Option");
        option4.setFont(new Font("Arial", Font.PLAIN, 14));
        option4.setAlignmentX(Component.LEFT_ALIGNMENT);
        option4.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 0)); // 10px left and 10px bottom padding
        mainPanel.add(option4);

        // Create explanation label
        JLabel explanationLabel = new JLabel("Explanation: <Explanation here>");
        explanationLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        explanationLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.add(explanationLabel);
        mainPanel.add(Box.createVerticalStrut(10)); // 10px gap

        // Create next button
        JButton nextButton = new JButton("Get Next Question");
        nextButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        nextButton.setFont(new Font("Arial", Font.PLAIN, 14));
        mainPanel.add(nextButton);

        // Add main panel to frame
        frame.getContentPane().add(mainPanel);

        // Adjust position of the window
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        int frameWidth = (int) (width / 2);
        int frameHeight = (int) (height / 4);
        frame.setLocation((int) (width - frameWidth) / 2, (int) (height - frameHeight) / 2);
        frame.setSize(frameWidth, frameHeight);

        // Display the window
        frame.setVisible(true);
    }
}
