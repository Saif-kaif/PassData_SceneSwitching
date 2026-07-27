module com.example.github_intellij_scene_switch_passdata {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.github_intellij_scene_switch_passdata to javafx.fxml;
    exports com.example.github_intellij_scene_switch_passdata;
}