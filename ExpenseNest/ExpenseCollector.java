import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;



public class ExpenseCollector {
    private ArrayList<Expense> expenses;

    public ExpenseCollector() {
        expenses = new ArrayList<>();
        initUI();
    }

    private void initUI() {
        JFrame frame = new JFrame("Expense Collector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2, 10, 10));

        JLabel descriptionLabel = new JLabel("Description:");
        JTextField descriptionField = new JTextField();

        JLabel amountLabel = new JLabel("Amount:");
        JTextField amountField = new JTextField();

        JLabel categoryLabel = new JLabel("Category:");
        JTextField categoryField = new JTextField();

        JButton addButton = new JButton("Add Expense");
        JButton displayButton = new JButton("Display Expenses");

        JTextArea displayArea = new JTextArea();
        displayArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(displayArea);

        inputPanel.add(descriptionLabel);
        inputPanel.add(descriptionField);
        inputPanel.add(amountLabel);
        inputPanel.add(amountField);
        inputPanel.add(categoryLabel);
        inputPanel.add(categoryField);
        inputPanel.add(addButton);
        inputPanel.add(displayButton);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String description = descriptionField.getText();
                    double amount = Double.parseDouble(amountField.getText());
                    String category = categoryField.getText();

                    expenses.add(new Expense(description, amount, category));
                    JOptionPane.showMessageDialog(frame, "Expense added successfully!");

                    descriptionField.setText("");
                    amountField.setText("");
                    categoryField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid amount.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText("");
                double total = 0;
                for (Expense expense : expenses) {
                    displayArea.append(expense.toString() + "\n");
                    total += expense.getAmount();
                }
                displayArea.append("\nTotal Expenses: $" + total);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ExpenseCollector());
    }
}
