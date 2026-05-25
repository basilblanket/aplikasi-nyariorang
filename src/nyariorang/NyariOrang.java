package nyariorang;

public class NyariOrang {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new view.MainFrame().setVisible(true);
        });
    }

}
