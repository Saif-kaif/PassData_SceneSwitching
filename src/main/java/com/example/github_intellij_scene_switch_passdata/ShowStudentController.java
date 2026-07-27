package com.example.github_intellij_scene_switch_passdata;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class ShowStudentController
{
    @javafx.fxml.FXML
    private TableColumn<Student,String> genderTableView;
    @javafx.fxml.FXML
    private TableColumn<Student,Float> CGPATableView;
    @javafx.fxml.FXML
    private TableColumn<Student, DatePicker> dateOfBirthTableView;
    @javafx.fxml.FXML
    private TableColumn<Student,String> nameTableView;
    @javafx.fxml.FXML
    private TableView<Student> mainTableView;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    ArrayList<Student> toReceive = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        nameTableView.setCellValueFactory(new PropertyValueFactory<>("name"));
        genderTableView.setCellValueFactory(new PropertyValueFactory<>("gender"));
        dateOfBirthTableView.setCellValueFactory(new PropertyValueFactory<>("dob"));
        CGPATableView.setCellValueFactory(new PropertyValueFactory<>("cgpa"));
    }

    @javafx.fxml.FXML
    public void showStudentOnAction(ActionEvent actionEvent) {

        mainTableView.getItems().addAll(toReceive);
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CreateStudent.fxml"));
            Node node = fxmlLoader.load();

//            CreateStudentViewController nextController = fxmlLoader.getController();
//            nextController.studentList = toReceive;                             to see previous data if back

            mainPane.getChildren().setAll(node);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}