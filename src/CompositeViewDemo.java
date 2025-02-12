import javax.swing.*;
import java.awt.*;

interface View {
    JPanel getPanel();
}

class FirstView implements View {
    private JPanel panel;
    private CompositeView parent;

    public FirstView(CompositeView parent) {
        this.parent = parent;
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Navegación");
        JMenuItem secondViewItem = new JMenuItem("Ir a la Segunda Vista");
        secondViewItem.addActionListener(e -> parent.showView("second"));
        menu.add(secondViewItem);
        menuBar.add(menu);

        JLabel label = new JLabel("Esta es la Primera Vista", SwingConstants.CENTER);
        JTextField textField = new JTextField("Campo de texto en la primera vista");

        panel.add(menuBar, BorderLayout.NORTH);
        panel.add(label, BorderLayout.CENTER);
        panel.add(textField, BorderLayout.SOUTH);
    }

    public JPanel getPanel() {
        return panel;
    }
}

class SecondView implements View {
    private JPanel panel;
    private CompositeView parent;

    public SecondView(CompositeView parent) {
        this.parent = parent;
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Navegación");
        JMenuItem firstViewItem = new JMenuItem("Ir a la Primera Vista");
        firstViewItem.addActionListener(e -> parent.showView("first"));
        menu.add(firstViewItem);
        menuBar.add(menu);

        JLabel label = new JLabel("Esta es la Segunda Vista", SwingConstants.CENTER);
        JButton distinctiveButton = new JButton("Botón especial de la segunda vista");

        panel.add(menuBar, BorderLayout.NORTH);
        panel.add(label, BorderLayout.CENTER);
        panel.add(distinctiveButton, BorderLayout.SOUTH);
    }

    public JPanel getPanel() {
        return panel;
    }
}

class CompositeView {
    private JFrame frame;
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public CompositeView() {
        frame = new JFrame("Ejemplo de Vista Compuesta");
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        FirstView firstView = new FirstView(this);
        SecondView secondView = new SecondView(this);
        mainPanel.add(firstView.getPanel(), "first");
        mainPanel.add(secondView.getPanel(), "second");
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void showView(String viewName) {
        cardLayout.show(mainPanel, viewName);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CompositeView::new);
    }
}













