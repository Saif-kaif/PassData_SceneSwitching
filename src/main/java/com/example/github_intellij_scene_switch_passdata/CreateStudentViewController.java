package com.example.github_intellij_scene_switch_passdata;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class CreateStudentViewController
{
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private DatePicker dobDatePicker;
    @javafx.fxml.FXML
    private TextField cgpaTF;
    @javafx.fxml.FXML
    private ComboBox<String> genderComboBox;

    ArrayList<Student> studentList = new ArrayList<>();

    @javafx.fxml.FXML
    private AnchorPane mainPane;

    @javafx.fxml.FXML
    public void initialize() {
        genderComboBox.getItems().addAll("Female","male");

    }


    @javafx.fxml.FXML
    public void nextPageOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("showStudent.fxml"));

            Node node = fxmlLoader.load();

            ShowStudentController nextController = fxmlLoader.getController();

            nextController.toReceive = studentList;
            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void createAndAddToArrayListOnAction(ActionEvent actionEvent) {
        Student s = new Student(
                nameTF.getText(),
                genderComboBox.getValue(),
                dobDatePicker.getValue(),
                Float.parseFloat(cgpaTF.getText())
        );
        studentList.add(s);
    }
}