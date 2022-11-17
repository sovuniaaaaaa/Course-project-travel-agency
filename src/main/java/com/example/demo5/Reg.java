package com.example.demo5;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Reg {

    @FXML
    private Button inplog;

    @FXML
    private Button inppass;

    @FXML
    private TextField log;

    @FXML
    private TextField pass;

    @FXML
    private Button reg;
    @FXML
    private Button reg1;

    @FXML
    void initialize() {
        reg.setOnAction(click -> {
            System.out.println("Логин:" + log.getText());
            System.out.println("Пароль:" + pass.getText());
            reg.getScene().getWindow().hide();
            // Запись в txt документ для регистрации
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\demo5\\src\\main\\resources\\com\\example\\demo5\\log.txt"))) {
                writer.write(log.getText());
                writer.newLine();

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("auto.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\demo5\\src\\main\\resources\\com\\example\\demo5\\pass.txt"))) {
                writer.write(pass.getText());
                writer.newLine();

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("auto.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());


        };
        });
        reg1.setOnAction(click -> {
            System.out.println("Логин:" + log.getText());
            System.out.println("Пароль:" + pass.getText());
            reg1.getScene().getWindow().hide();
            // Запись в txt документ для регистрации
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\demo5\\src\\main\\resources\\com\\example\\demo5\\log.txt"))) {
                writer.write(log.getText());
                writer.newLine();

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("auto.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\demo5\\src\\main\\resources\\com\\example\\demo5\\pass.txt"))) {
                writer.write(pass.getText());
                writer.newLine();

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("auto.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());


            };
        });
    }}

