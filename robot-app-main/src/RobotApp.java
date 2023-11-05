import java.util.Scanner;

public class RobotApp {
    public static void main(String[] args) {
        new RobotApp();
    }

    private int x = 4;
    private int y = 4;
    private char icon = 'o';
    private char[][] grid = new char[10][10];
    private Scanner scanner = new Scanner(System.in);

    public RobotApp() {
        System.out.println("-------- Permainan Dimulai --------");
        draw();

        while (true) {
            String instruction = waitInstruction();
            if (instruction.equals("x")) {
                break;
            }

            char direction = instruction.charAt(0);
            int steps = Integer.parseInt(instruction.substring(1));
            moveRobot(direction, steps);
            draw();
        }

        System.out.println("-------- Permainan Selesai --------");
    }

    private void draw() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == x && j == y) {
                    System.out.print(icon);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private String waitInstruction() {
        System.out.println("-------- Instruksi --------");
        System.out.println("Instruksi: {w|s|a|d}{jumlah langkah}");
        System.out.println("Contoh: w3 berarti 'keatas 3 langkah'");
        System.out.print("Masukkan instruksi: ");
        return scanner.nextLine();
    }

    private void moveRobot(char direction, int steps) {
        if (direction == 'w') {
            x = Math.max(x - steps, 0);
        } else if (direction == 's') {
            x = Math.min(x + steps, 9);
        } else if (direction == 'a') {
            y = Math.max(y - steps, 0);
        } else if (direction == 'd') {
            y = Math.min(y + steps, 9);
        }
    }
}