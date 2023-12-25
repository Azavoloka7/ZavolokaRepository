package org;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GameGUI extends Application {

    private Stage stage;
    private Scene scene;
    private Label healthLabel;
    private Label enemyHealthLabel;
    private Button attackButton;
    private Button potionButton;
    private Button runButton;
    private Button strengthPotionButton;

    // Додайте інші GUI-елементи, які вам потрібні.

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        stage.setTitle("Text RPG Game");

        // Ініціалізація GUI-елементів
        healthLabel = new Label("Your HP is: 100");
        enemyHealthLabel = new Label("Enemy's HP: 100");
        attackButton = new Button("Attack");
        potionButton = new Button("Drink Health Potion");
        runButton = new Button("Run");
        strengthPotionButton = new Button("Drink Strength Potion");

        // Додайте обробники подій для кнопок

        // Розміщення GUI-елементів в контейнері VBox
        VBox layout = new VBox(10);
        layout.getChildren().addAll(healthLabel, enemyHealthLabel, attackButton, potionButton, runButton, strengthPotionButton);

        // Створення сцени і встановлення контейнера VBox як кореневого вузла
        scene = new Scene(layout, 300, 200);

        // Встановлення сцени для вікна
        stage.setScene(scene);

        // Відображення вікна
        stage.show();
    }

    // Додайте методи для обробки подій кнопок та інші необхідні методи для логіки гри.

    // Опціонально, ви можете використовувати CSS для оформлення GUI-елементів.

}
