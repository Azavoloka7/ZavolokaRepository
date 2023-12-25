package chatGPT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Клас для представлення ліків
class Medicine {
    private String name;
    private double price;
    private int quantity;

    public Medicine(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " - Price: $" + price + " - Quantity: " + quantity;
    }
}

// Клас для управління аптекою
class PharmacyManager {
    private List<Medicine> medicines;

    public PharmacyManager() {
        medicines = new ArrayList<>();
    }

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(medicines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            medicines = (List<Medicine>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// Головний клас для GUI
public class PharmacyApp {
    private static final String FILENAME = "pharmacy_data.dat";
    private PharmacyManager pharmacyManager;

    private JFrame frame;
    private JTextArea outputTextArea;

    public PharmacyApp() {
        pharmacyManager = new PharmacyManager();
        pharmacyManager.loadFromFile(FILENAME);

        frame = new JFrame("Pharmacy Management System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);

        JButton checkAvailabilityButton = new JButton("Check Availability");
        checkAvailabilityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayMedicines();
            }
        });

        JButton sellMedicineButton = new JButton("Sell Medicine");
        sellMedicineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sellMedicine();
            }
        });

        JButton addMedicineButton = new JButton("Add Medicine");
        addMedicineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMedicine();
            }
        });

        JButton saveButton = new JButton("Save Data");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pharmacyManager.saveToFile(FILENAME);
                JOptionPane.showMessageDialog(frame, "Data saved successfully.");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(checkAvailabilityButton);
        buttonPanel.add(sellMedicineButton);
        buttonPanel.add(addMedicineButton);
        buttonPanel.add(saveButton);

        frame.setLayout(new BorderLayout());
        frame.add(outputTextArea, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void displayMedicines() {
        List<Medicine> medicines = pharmacyManager.getMedicines();
        if (medicines.isEmpty()) {
            outputTextArea.setText("No medicines available.");
        } else {
            StringBuilder output = new StringBuilder("Medicine List:\n");
            for (Medicine medicine : medicines) {
                output.append(medicine).append("\n");
            }
            outputTextArea.setText(output.toString());
        }
    }

    private void sellMedicine() {
        String medicineName = JOptionPane.showInputDialog(frame, "Enter medicine name:");
        if (medicineName != null && !medicineName.isEmpty()) {
            List<Medicine> medicines = pharmacyManager.getMedicines();
            for (Medicine medicine : medicines) {
                if (medicine.getName().equalsIgnoreCase(medicineName)) {
                    int quantityToSell = getQuantityToSell(medicine);
                    if (quantityToSell > 0 && quantityToSell <= medicine.getQuantity()) {
                        medicine.setQuantity(medicine.getQuantity() - quantityToSell);
                        displayMedicines();
                        return;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Invalid quantity.");
                        return;
                    }
                }
            }
            JOptionPane.showMessageDialog(frame, "Medicine not found.");
        }
    }

    private int getQuantityToSell(Medicine medicine) {
        String quantityStr = JOptionPane.showInputDialog(frame, "Enter quantity to sell:");
        try {
            return Integer.parseInt(quantityStr);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void addMedicine() {
        String name = JOptionPane.showInputDialog(frame, "Enter medicine name:");
        double price = getPrice();
        int quantity = getQuantity();

        if (name != null && !name.isEmpty() && price >= 0 && quantity > 0) {
            Medicine newMedicine = new Medicine(name, price, quantity);
            pharmacyManager.addMedicine(newMedicine);
            displayMedicines();
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid input. Please try again.");
        }
    }

    private double getPrice() {
        String priceStr = JOptionPane.showInputDialog(frame, "Enter medicine price:");
        try {
            return Double.parseDouble(priceStr);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private int getQuantity() {
        String quantityStr = JOptionPane.showInputDialog(frame, "Enter medicine quantity:");
        try {
            return Integer.parseInt(quantityStr);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PharmacyApp();
            }
        });
    }
}
