
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JMenuBarExample implements Runnable, ActionListener
{
    private JLabel message;
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenuItem openMenuItem;
    private JMenuItem cutMenuItem;
    private JMenuItem copyMenuItem;
    private JMenuItem pasteMenuItem;

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new JMenuBarExample());
    }

    public void run()
    {
        frame = new JFrame("Java JMenubar Example");
        menuBar = new JMenuBar();
        message = new JLabel();

        message.setHorizontalAlignment(JLabel.CENTER);

        // build the File menu
        fileMenu = new JMenu("File");
        openMenuItem = new JMenuItem("Open");
        fileMenu.add(openMenuItem);

        // build the Edit menu
        editMenu = new JMenu("Edit");
        cutMenuItem = new JMenuItem("Cut");
        copyMenuItem = new JMenuItem("Copy");
        pasteMenuItem = new JMenuItem("Paste");
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);

        //set listener
        openMenuItem.addActionListener(this);
        cutMenuItem.addActionListener(this);
        copyMenuItem.addActionListener(this);
        pasteMenuItem.addActionListener(this);

        // add menus to menubar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // put the menubar on the frame
        frame.setJMenuBar(menuBar);
        frame.add(message, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 300));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    //handles the click event on JMenutem
    public void actionPerformed(ActionEvent ev)
    {
        String textOnMenu = ((JMenuItem) ev.getSource()).getText();
        message.setText(textOnMenu + " menu item clicked.");
    }
}