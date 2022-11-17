package com.example.demo5;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Auto {

    @FXML
    private Button add;

    @FXML
    private TextField log1;

    @FXML
    private TextField pass1;
    @FXML
    void initialize() {
        add.setOnAction(click -> {  // Фактически прописываем функционал кнопки "Вход" и функционал TextField
            add.setText("Добро пожаловать");
            System.out.println("Логин:" + log1.getText());
            System.out.println("Пароль:" + pass1.getText());
            add.getScene().getWindow().hide(); // 37 строчка читает из файла(к которому прописан путь к документу txt
            try (BufferedReader reader = new BufferedReader(new FileReader("D:\\demo5\\src\\main\\resources\\com\\example\\demo5\\log.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.equals(log1.getText().trim())) {
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("list.fxml")); // Пропиываем путь к следующему окну( которое будет открываться после окна регистрации
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("Верный логин");
                    }else {
                        try {
                            FXMLLoader loader = new FXMLLoader();//Создали исключение(при вводе логина и тд) для ошибки
                            loader.setLocation(getClass().getResource("err.fxml")); // Пропиываем путь к окну сообщающем ошибку вврда данных
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("Данные введены некорректно");
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }  // Повторяем те же действия для пароля

            try (BufferedReader reader = new BufferedReader(new FileReader("D:\\demo5\\src\\main\\resources\\com\\example\\demo5\\pass.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.equals(pass1.getText().trim())) {
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("list.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("Верный пароль");
                    } else {
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("err.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("Данные введены некорректно");
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

    }
}

