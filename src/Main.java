public class Main implements Runnable {
    GUI gui = new GUI();

    public static void main(String[] args) {
        //creamos un nuevo hilo
        new Thread(new Main()).start();
    }

    @Override
    public void run() {
        while (true) {
            gui.repaint();
        }
    }

}
